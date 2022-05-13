package Controlador;

import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Publicador {
    public Publicador(){
    }

    public void enviarMensaje(String mensaje){
        Properties properties = new Properties();
        //"bootstrap-servers" are the addresses of the Kafka brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //El producer realiza un registro(record)
        ProducerRecord producerRecord = new ProducerRecord("eventoDisparador","name", mensaje);
        //Se crea el productor
        KafkaProducer kafkaProducer = new KafkaProducer(properties);
        //El producer envía el registro
        kafkaProducer.send(producerRecord);
        kafkaProducer.close();
    }
}
