package lk.ijse.gdse68.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//You can use this to give a name to the bean
//If you did not give a name to the bean it will take the class name as the bean name
//Eg: TestBeans -> testBeans
@Component("TestBeans")
public class TestBeans implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String name){
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("Bean factory is " + beanFactory );
    }

    //Use this method to do something before destroy method
    //To clean up resources (eg: closing a database connection)
    @Override
    public void destroy() throws Exception {
        System.out.println("Hello World");
    }

    //This is not a part of spring framework its additional
    //if you want to do any custom destroy method or do something before destroy method
    //You can use this annotation
    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext is " + applicationContext);
    }
}
