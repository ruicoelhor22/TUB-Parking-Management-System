package net.javaguides.springbootkafkatutorial.controller;

import net.javaguides.springbootkafkatutorial.kafka.ProducerSenhas;
import net.javaguides.springbootkafkatutorial.payload.Senhas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/kafka")


public class SenhasController {

    private List<Senhas> senhas = new ArrayList<>();

    private ProducerSenhas kafkaProducer;

    public SenhasController(ProducerSenhas kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Senhas user){
        kafkaProducer.sendMessage(user);
        senhas.add(user);

        return ResponseEntity.ok("Json message sent to T_Senhas");
    }

    @GetMapping("/getSenhas")
    public List<Senhas> getSenhas(){
        return senhas;
    }


}