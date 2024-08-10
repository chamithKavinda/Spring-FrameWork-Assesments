package lk.ijse.gdse68.dep;

import org.springframework.stereotype.Component;

@Component
public class Jessica implements GoodGirl{
    @Override
    public void sayHello() {
        System.out.println("Hello Jessika");
    }
}
