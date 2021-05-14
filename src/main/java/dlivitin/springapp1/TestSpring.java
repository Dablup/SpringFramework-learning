package dlivitin.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Creating context from xml file in the 'resources' folder
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        // Creating bean using context
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        // When we end work with context we need to close it
        context.close();
    }
}
