package wjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoomApplication {
    // java -Xmx8m wjs.Boom
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BoomApplication.class, args);

    }



}
