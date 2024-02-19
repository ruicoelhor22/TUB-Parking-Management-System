package net.javaguides.springbootkafkatutorial.kafka;


import net.javaguides.springbootkafkatutorial.payload.Senhas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerSenhas {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerSenhas.class);

    private static KafkaTemplate<String, Senhas> kafkaTemplate;

    public ProducerSenhas(KafkaTemplate<String, Senhas> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Senhas data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Senhas> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "T_Senhas")
                .build();

        kafkaTemplate.send(message);
    }
}