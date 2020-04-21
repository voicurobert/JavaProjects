/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import interceptors.InterceptorA;
import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.ExcludeDefaultInterceptors;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

/**
 *
 * @author robert
 */

@Stateless

public class MyBean2 {

    @ExcludeDefaultInterceptors
    @ExcludeClassInterceptors
    @Interceptors(InterceptorA.class)
    public int m1(int x, int y) {
        System.out.println("M1");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        return x + y;
    }
    
    @AroundInvoke
    public Object x(InvocationContext inv) throws Exception{
        return inv.proceed();
    }
}
