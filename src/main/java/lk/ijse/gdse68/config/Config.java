package lk.ijse.gdse68.config;

import lk.ijse.gdse68.beans.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Customer.class})
public class Config {
    //if there are special configuration you can put them in here
}
