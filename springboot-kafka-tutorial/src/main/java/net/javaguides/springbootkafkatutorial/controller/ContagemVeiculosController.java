package net.javaguides.springbootkafkatutorial.controller;


import net.javaguides.springbootkafkatutorial.payload.Veiculo;
import net.javaguides.springbootkafkatutorial.kafka.ProducerVeiculos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/api/v2/kafka")


    public class ContagemVeiculosController {

        private List<Veiculo> veiculo = new ArrayList<>();

        private ProducerVeiculos kafkaProducer;

        public ContagemVeiculosController(ProducerVeiculos kafkaProducer) {
            this.kafkaProducer = kafkaProducer;
        }

        @PostMapping("/publish")
        public ResponseEntity<String> publish(@RequestBody Veiculo user) {
            kafkaProducer.sendMessage(user);
            veiculo.add(user);

            return ResponseEntity.ok("Json message sent to T_Contagem");
        }

        @GetMapping("/getVeiculos")
        public List<Veiculo> getVeiculo() {
            return veiculo;
        }


    }

