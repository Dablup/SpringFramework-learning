package dlivitin.springapp1;

import dlivitin.springapp1.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // Creating context from xml file in the 'resources' folder
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//          "applicationContext.xml"
//        );

        // Creating context from Java configuration class (in our case it is SpringConfig.java)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
