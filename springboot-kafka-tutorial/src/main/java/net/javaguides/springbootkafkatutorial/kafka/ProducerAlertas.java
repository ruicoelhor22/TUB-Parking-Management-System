package net.javaguides.springbootkafkatutorial.kafka;


import net.javaguides.springbootkafkatutorial.payload.Alerta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerAlertas {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerAlertas.class);

    private static KafkaTemplate<String, Alerta> kafkaTemplate;

    public ProducerAlertas(KafkaTemplate<String, Alerta> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(String data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<String> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "T_Contagem")
                .build();

        kafkaTemplate.send(message);
    }
}
