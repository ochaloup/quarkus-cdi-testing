package cz.chalda.quarkus;

import cz.chalda.quarkus.cdi.AnnotationWithInit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@AnnotationWithInit
public class CDIBean {
    public String getInfo() {
        return System.getProperties().entrySet().iterator().next().toString();
    }
}
