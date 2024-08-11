package lk.ijse.gdse68;

import lk.ijse.gdse68.beans.TestBeans;
import lk.ijse.gdse68.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        //Following line is similar to a Bucket
        //Other lines are used to describe of the bucket should work
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(Config.class); //Put the class into the Bucket
        context.refresh(); //Refresh (shake) the bucket to make the class visible to the spring.

        //customer class scope check
//        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
//        boolean isSingletonCustomer = beanFactory.isSingleton("customer");
//        System.out.println("customer class is singleton " + isSingletonCustomer);
//        context.registerShutdownHook();

        TestBeans testBeans = (TestBeans)context.getBean("TestBeans");
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
        boolean isSingletonTest = beanFactory.isSingleton("TestBeans");
        System.out.println(testBeans);
        System.out.println("Is test singleton: "+isSingletonTest);

        context.close();
    }
}