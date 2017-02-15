package org.osate.xtext.ba.ui;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage ;
import org.osate.ba.aadlba.AadlBaPackage ;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.ui.internal.BaActivator ;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

public class BaModelActivator extends BaActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		EPackage.Registry.INSTANCE.put(org.osate.ba.aadlba.AadlBaPackage.eNS_URI,
		                               AadlBaPackage.eINSTANCE) ;
		try {
			registerInjectorFor("org.osate.xtext.Ba");
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}

	@Override
	public Injector getInjector(String languageName) {
		return OsateCorePlugin.getDefault().getInjector(languageName);
	}
	
	protected void registerInjectorFor(String language) throws Exception {
		OsateCorePlugin.getDefault().registerInjectorFor(language, 
				createInjector(
						language));
	}

}
