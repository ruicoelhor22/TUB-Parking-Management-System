package net.javaguides.springbootkafkatutorial.kafka;


import net.javaguides.springbootkafkatutorial.payload.Alerta;
import net.javaguides.springbootkafkatutorial.payload.Veiculo;
import net.javaguides.springbootkafkatutorial.payload.Senhas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

@Service
    public class Comparacao {

    public static List<String> alerta = new ArrayList<>();
    KafkaTemplate<String, Alerta> kafkaTemplate;

    public Comparacao(KafkaTemplate<String, Alerta> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

        private static final Logger LOGGER = LoggerFactory.getLogger(Comparacao.class);

        private Integer nrVeiculos; // Use Integer para permitir null
        private Integer total;      // Use Integer para permitir null
        private String alertas;

        // Variável de controle para indicar que ambos os posts foram recebidos
        private boolean contagemRecebida = false;
        private boolean senhasRecebidas = false;

        @KafkaListener(topics = "T_Contagem", groupId = "${spring.kafka.consumer.group-id}")
        public void consumeContagem(Veiculo veiculo) {
            this.nrVeiculos = veiculo.getNrVeiculos();
            System.out.println("Numero de veiculos estacionados:" + this.nrVeiculos);
            contagemRecebida = true;
            verificarEAtualizarAlertas();
        }

        @KafkaListener(topics = "T_Senhas", groupId = "${spring.kafka.consumer.group-id}")
        public void consumeSenhas(Senhas senhas) {
            int parquimetro = senhas.getParquimetro();
            int viaverde = senhas.getViaVerde();
            int iparque = senhas.getiParque();

            this.total = parquimetro + viaverde + iparque;

            System.out.println("Total de senhas compradas: " + this.total);
            senhasRecebidas = true;
            verificarEAtualizarAlertas();
        }

        private void verificarEAtualizarAlertas() {
            // Verificar se ambos os posts foram recebidos
            if (contagemRecebida && senhasRecebidas) {
                calcularTotal();

                // Resetar o estado para aguardar os próximos posts
                contagemRecebida = false;
                senhasRecebidas = false;
            }
        }

    private static String horaFormatada;

    // Método para obter e formatar a hora atual
    public void obterHoraAtual() {
        // Obter a hora atual
        LocalTime horaAtual = LocalTime.now();

        // Formatar a hora usando um objeto DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaFormatada = horaAtual.format(formatter);

        // Imprimir a hora atual formatada
        //System.out.println("Hora atual: " + horaFormatada);

    }
        private void calcularTotal() {
        obterHoraAtual();
        int a = 0, b = 0;

            if (nrVeiculos < total) {
                a = total - nrVeiculos;
                alertas = "Ha " + a + " condutores que compraram senha e nao estacionaram os veiculos - " + horaFormatada;
            } else if (nrVeiculos == total) {
                alertas = "Nao ha veiculos em incumprimento - " + horaFormatada;
            } else if (nrVeiculos > total) {
                b = nrVeiculos - total;
                alertas = "Ha " + b + " veiculos estacionados em incumprimento - " + horaFormatada;
            }

            System.out.println("Status dos estacionamentos: " + alertas);

            LOGGER.info(String.format("Message sent -> %s", alertas.toString()));

            Message<String> message = MessageBuilder
                    .withPayload(alertas)
                    .setHeader(KafkaHeaders.TOPIC, "T_Alertas")
                    .build();

            kafkaTemplate.send(message);
             alerta.add(alertas);
        }
    }



