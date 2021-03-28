package codes.andreirozov.uciapi;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class UciapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UciapiApplication.class, args);
    }
}
