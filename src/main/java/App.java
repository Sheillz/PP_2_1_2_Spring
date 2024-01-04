import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHellWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHellWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHellWorld1 == beanHellWorld2);
        Cat beanCat3 = (Cat) applicationContext.getBean("cat");
        Cat beanCat4 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat3== beanCat4);
    }
}