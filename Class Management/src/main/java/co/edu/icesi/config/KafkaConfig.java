package co.edu.icesi.config;

import co.edu.icesi.dto.NotificacionDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
@Configuration
public class KafkaConfig {
    @Bean
    public KafkaTemplate<String, NotificacionDTO> kafkaTemplate(ProducerFactory<String,
            NotificacionDTO> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}