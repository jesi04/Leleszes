package hu.Leleszes;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({HalProperty.class})
public class HalConfiguration {
    final HalProperty halProperty;

    public HalConfiguration(HalProperty halProperty) {
        this.halProperty = halProperty;
        System.out.println(halProperty.getSize());

    }


    Hal hal(){
        return new Hal(2);
    }
}
