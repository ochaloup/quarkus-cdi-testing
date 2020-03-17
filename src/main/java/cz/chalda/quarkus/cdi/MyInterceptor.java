package cz.chalda.quarkus.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@AnnotationWithInit
@AnnotationSecond
public class MyInterceptor {

    @AroundInvoke
    public Object manageTransaction(InvocationContext ctx) throws Exception {
        String ret = (String) ctx.proceed();
        return "[" + ret + "]";
    }
}
