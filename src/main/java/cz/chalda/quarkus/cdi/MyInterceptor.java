package cz.chalda.quarkus.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.annotation.Priority;

@Interceptor
@AnnotationWithInit
@AnnotationSecond
@Priority(Interceptor.Priority.PLATFORM_BEFORE + 200)
public class MyInterceptor {

    @AroundInvoke
    public Object manageTransaction(InvocationContext ctx) throws Exception {
        String ret = (String) ctx.proceed();
        return "[" + ret + "]";
    }
}
