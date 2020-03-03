package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloServiceAspect {

//    @Before("execution(* services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("A");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("B");
//    }
//
//    // without throwing an exception
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("C");
//    }
//
//    // is called only when the method throws an exception
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("D");
//    }

    @Around("execution(* services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("A");
        Object result = null;
        try {
            //result = joinPoint.proceed(new Object[]{"Bill"});
            result = joinPoint.proceed();
            System.out.println("B");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
