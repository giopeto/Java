package com.osgi.service.implementation;

import com.osgi.service.definition.Greeter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import java.util.Hashtable;

public class GreeterImpl implements Greeter, BundleActivator {

    private ServiceReference<Greeter> reference;
    private ServiceRegistration<Greeter> registration;

    public String sayHiTo(String name) {
        return "[SERVICE] Hello " + name;
    }

    public void start(BundleContext context) throws Exception {
        System.out.println("[SERVICE] Registering service.");
        registration = context.registerService(
                Greeter.class,
                new GreeterImpl(),
                new Hashtable<String, String>());
        reference = registration
                .getReference();
    }


    public void stop(BundleContext context) throws Exception {
        System.out.println("[SERVICE] Unregistering service.");
        registration.unregister();
    }
}
