package lk.ijse.gdse68.config;

import lk.ijse.gdse68.aop.Transaction;
import lk.ijse.gdse68.beans.Customer;
import lk.ijse.gdse68.beans.TestBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackageClasses = {Transaction.class, Long.class})
public class Config {
    //if there are special configuration you can put them in here

}
