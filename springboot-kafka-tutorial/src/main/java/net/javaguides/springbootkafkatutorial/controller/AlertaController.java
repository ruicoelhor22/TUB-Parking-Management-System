package net.javaguides.springbootkafkatutorial.controller;


import net.javaguides.springbootkafkatutorial.kafka.Comparacao;
import net.javaguides.springbootkafkatutorial.kafka.ProducerAlertas;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v3/kafka")


public class AlertaController {

    private List<String> alerta = new ArrayList<>();

    private ProducerAlertas kafkaProducer;

    public AlertaController(ProducerAlertas kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/getAlertas")
    public List<String> getAlerta() {
       // fazer umm consumidor que va buscar as mensagens do topico t_aLERTas e mete as mensagens no array alerta
        return Comparacao.alerta;
    }


}
