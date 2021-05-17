package dlivitin.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;


    public MusicPlayer() { }

    // Inversion of control( dependency injection via constructor)
    // We are using @Autowired annotation to perform an injection of needed beans
    // We can use @Qualifier to specify which bean exactly we want to inject
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

}
