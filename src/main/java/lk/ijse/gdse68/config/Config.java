package lk.ijse.gdse68.config;

import lk.ijse.gdse68.beans.Customer;
import lk.ijse.gdse68.beans.TestBeans;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {TestBeans.class})
public class Config {
    //if there are special configuration you can put them in here
}
