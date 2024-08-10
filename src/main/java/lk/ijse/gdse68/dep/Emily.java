package lk.ijse.gdse68.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Emily implements GoodGirl{
    @Override
    public void sayHello() {
        System.out.println("Hello Emily");
    }
}
