package cn.lipg.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:/dubbo.xml")
public class DubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceApplication.class, args);
        while (true) {

        }
    }
}
