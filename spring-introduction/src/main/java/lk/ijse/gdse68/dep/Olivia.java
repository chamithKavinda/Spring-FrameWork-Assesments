package lk.ijse.gdse68.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
public class Olivia implements GoodGirl{
    @Override
    public void sayHello() {
        System.out.println("Hello Olivia");
    }
}
