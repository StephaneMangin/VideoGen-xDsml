package org.gemoc.executionframework.extensions.sirius.accessor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ecore.extender.business.api.accessor.IExtenderProvider;
import org.eclipse.sirius.ecore.extender.business.api.accessor.IExtensionProvider;
import org.eclipse.sirius.ecore.extender.business.api.accessor.IMetamodelExtender;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionAuthority;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugURIHandler;
import org.gemoc.xdsmlframework.api.core.IExecutionCheckpoint;

public class DebugMetamodelExtenderProvider implements IExtenderProvider {

	@Override
	public IMetamodelExtender getExtender(ResourceSet set) {
		final DebugModelAccessor res = new DebugModelAccessor();
			if (set.getResources().size() > 0) {
				final Session session = SessionManager.INSTANCE.getSession(set
						.getResources().get(0));
				if (session != null) {
					session.addListener(new SessionListener() {

						@Override
						public void notify(int changeKind) {
							if (changeKind == SessionListener.CLOSED) {
								IExecutionCheckpoint.CHECKPOINTS.remove(set);
							}
						}
					});
				}
			}
			return res;
	}

	@Override
	public boolean provides(ResourceSet set) {
		final boolean res;
		
		if (set !=null
			&& set.getURIConverter() != null) {
			URIConverter converter = set.getURIConverter();
			if (converter.getURIHandlers().size() > 0) {
				res = converter.getURIHandlers().get(0) instanceof DebugURIHandler;
			} else {
				res = false;
			}
		} else {
			res = false;
		}
		
		return res;
	}

}
