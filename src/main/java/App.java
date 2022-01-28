import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBeanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat borisCat = (Cat) applicationContext.getBean("cat");
        Cat dorisCat = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == secondBeanHelloWorld);
        System.out.println(borisCat == dorisCat);
    }
}