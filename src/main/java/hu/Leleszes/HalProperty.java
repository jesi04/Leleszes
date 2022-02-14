package hu.Leleszes;

import com.google.common.reflect.ClassPath;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.Prefix;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Validated
@PropertySource(value = "classpath:application.properties", encoding = "utf-8")
@ConfigurationProperties(prefix = "fish")
public class HalProperty {
    private @Getter @Setter int size;


    /*
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }*/
}
