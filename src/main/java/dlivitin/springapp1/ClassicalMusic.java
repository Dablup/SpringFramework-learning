package dlivitin.springapp1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{


    // private constructor -> we can not create object using keyword 'new'
    private ClassicalMusic(){}

    // factory method  (method to create a new object)
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    // for the init method
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    // for the destroy-method
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
