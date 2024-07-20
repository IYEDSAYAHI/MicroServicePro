package tn.esprit.empreintems;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpreintemsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpreintemsApplication.class, args);
    }
}

