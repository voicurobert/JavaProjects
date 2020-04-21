/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interceptors;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.InvocationContext;

/**
 *
 * @author robert
 */

public class InterceptorA {

    @AroundInvoke
    public Object invoke(InvocationContext invocationContext) throws Exception {
        long t1 = System.currentTimeMillis();
        Object o = invocationContext.proceed();
        long t2 = System.currentTimeMillis();
        System.out.println("A durat " + (t2 - t1));
        return o;
    }
    
    @AroundTimeout
    public Object invoke2(InvocationContext invocationContext) throws Exception {
        return invocationContext.proceed();
    }
    
    @AroundConstruct
    public Object invoke3(InvocationContext invocationContext) throws Exception {
        return invocationContext.proceed();
    }
}
