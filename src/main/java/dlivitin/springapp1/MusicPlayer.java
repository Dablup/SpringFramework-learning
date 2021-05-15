package dlivitin.springapp1;

public class MusicPlayer {
    Music music;


    // Inversion of control( dependency injection via constructor )
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
