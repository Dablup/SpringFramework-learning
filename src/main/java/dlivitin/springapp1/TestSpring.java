package dlivitin.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Creating context from xml file in the 'resources' folder
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        // Creating bean using context
        Music music = context.getBean("MusicBean", Music.class);

        // Dependency injection via constructor ( it is needed because we do not want to create objects(ClassicalMusic or RockMusic)
        // explicitly in MusicPlayer class). That is why we inject needed object via constructor.
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        // When we end work with context we need to close it
        context.close();
    }
}
