package hu.Leleszes;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

public class Fishing {
    private @Getter Fish fish;

    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }
}
