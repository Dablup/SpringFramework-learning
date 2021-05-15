package dlivitin.springapp1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() { }

    // Inversion of control( dependency injection via constructor )
    public MusicPlayer(List<Music> music){
        this.musicList = music;
    }

    public void playMusic(){
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }

    // Setter for field music
    public void setMusic(List<Music> music) {
        this.musicList = music;
    }
}
