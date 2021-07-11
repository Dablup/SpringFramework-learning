package dlivitin.springapp1.genre;

import dlivitin.springapp1.Music;
import org.springframework.stereotype.Component;

//@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Playing some Jazz Song! ";
    }
}
