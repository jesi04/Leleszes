package hu.Leleszes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishingConfiguration {

    @Bean
    public Fishing fishing(){
        return new Fishing();
    }

    @Autowired
    public Fisher fisher(){
        return new Fisher();
    }
}
