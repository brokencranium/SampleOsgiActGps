package com.brokencranium.toast.act.internal.gps.fake;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.brokencranium.toast.act.gps.IGps;

public class Activator implements BundleActivator {

	private ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
       FakeGps gps = new FakeGps();
       registration = context.registerService(IGps.class.getName(),gps, null);
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		registration.unregister();

	}

}
