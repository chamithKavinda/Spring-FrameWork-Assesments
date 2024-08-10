package lk.ijse.gdse68.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.dep.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class user {
    @Autowired
    @Qualifier("Long hair")
    private GoodGirl goodGirl;

    @PostConstruct
    public void init(){
        goodGirl.sayHello();
    }
}
