package com.osgi.client;

import com.osgi.service.definition.Greeter;
import org.osgi.framework.*;

public class Client implements BundleActivator, ServiceListener {

    private BundleContext ctx;
    private ServiceReference serviceReference;

    public void start(BundleContext ctx) {
        System.out.println("[CLIENT] Start client. Registering a service ...");
        this.ctx = ctx;
        try {
            ctx.addServiceListener(
                    this, "(objectclass=" + Greeter.class.getName() + ")");
        } catch (Exception ise) {
            ise.printStackTrace();
        }
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("[CLIENT] Stop client");
        if(serviceReference != null) {
            ctx.ungetService(serviceReference);
        }
    }

    public void serviceChanged(ServiceEvent serviceEvent) {
        int type = serviceEvent.getType();
        switch (type){
            case(ServiceEvent.REGISTERED):
                System.out.println("[CLIENT] Notification of service registered.");
                serviceReference = serviceEvent
                        .getServiceReference();
                Greeter service = (Greeter)(ctx.getService(serviceReference));
                System.out.println( service.sayHiTo("John from client") );
                break;
            case(ServiceEvent.UNREGISTERING):
                System.out.println("[CLIENT] Notification of service unregistered.");
                ctx.ungetService(serviceEvent.getServiceReference());
                break;
            default:
                break;
        }
    }
}
