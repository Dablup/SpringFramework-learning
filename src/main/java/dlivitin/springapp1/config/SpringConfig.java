package dlivitin.springapp1.config;

import dlivitin.springapp1.Music;
import dlivitin.springapp1.MusicPlayer;
import dlivitin.springapp1.genre.ClassicalMusic;
import dlivitin.springapp1.genre.JazzMusic;
import dlivitin.springapp1.genre.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

// Annotation to define that this class is configuration class for spring
@Configuration

// We use this annotation to connect properties file
@PropertySource("classpath:musicPlayer.properties")

// If we want to spring do all the scanning automatically we can use this annotation
// Also we need to write @Component annotation before each class that we want to create as bean
//@ComponentScan("dlivitin.springapp1")

public class SpringConfig {
    // If we want to create all beans by hand then we can use these annotations
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicArrayList(){
        return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicArrayList());
    }
}
