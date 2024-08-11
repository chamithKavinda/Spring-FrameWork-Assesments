package lk.ijse.gdse68.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @Before("execution(public void startTransaction())")

    public void logsForStartTransaction(){
        System.out.println("logs Transaction started");
    }

    @Before("execution( public void endTransaction())")
    public void logsForEndTransaction(){
        System.out.println("logs Transaction End");
    }

}
