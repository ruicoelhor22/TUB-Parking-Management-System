package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Veiculo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerVeiculos {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerSenhas.class);

    private static KafkaTemplate<String, Veiculo> kafkaTemplate;

    public ProducerVeiculos(KafkaTemplate<String, Veiculo> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Veiculo data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Veiculo> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "T_Contagem")
                .build();

        kafkaTemplate.send(message);
    }
}
