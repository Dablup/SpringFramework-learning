package dlivitin.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer() { }

    // Inversion of control( dependency injection via constructor)
    // We are using @Autowired annotation to perform an injection of needed beans
    // We can use @Qualifier to specify which bean exactly we want to inject

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public void playMusic(){
        Random random = new Random();
        int someNumber = random.nextInt(music.size());
        System.out.println("Playing: " + music.get(someNumber).getSong());
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
