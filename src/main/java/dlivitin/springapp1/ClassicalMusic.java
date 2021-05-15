package dlivitin.springapp1;

public class ClassicalMusic implements Music{


    // private constructor -> we can not create object using keyword 'new'
    private ClassicalMusic(){}

    // factory method  (method to create a new object)
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    // for the init method
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    // for the destroy-method
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
