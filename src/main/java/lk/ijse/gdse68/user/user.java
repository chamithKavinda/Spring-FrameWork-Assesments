package lk.ijse.gdse68.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.dep.GoodGirl;
import lk.ijse.gdse68.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class user {
    @Qualifier("Long hair")
    private GoodGirl goodGirl;


    //Constructor Injection
    public  user(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

    public  user() {
        //cant use goodGirl here because it is not initialized yet
        System.out.println(goodGirl);
    }

    //Setter Injection
    @Autowired
    @Wow
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

    //PostConstruct is used to execute a method after the bean is initialized
    @PostConstruct
    public void init(){
        //System.out.println(goodGirl);
        goodGirl.sayHello();
    }
}
