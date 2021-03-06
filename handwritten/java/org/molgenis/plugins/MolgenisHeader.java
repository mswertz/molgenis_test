/* Date:        November 11, 2009
 * Template:	PluginScreenJavaTemplateGen.java.ftl
 * generator:   org.molgenis.generators.ui.PluginScreenJavaTemplateGen 3.3.2-testing
 * 
 * THIS FILE IS A TEMPLATE. PLEASE EDIT :-)
 */

package org.molgenis.plugins;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.ui.EasyPluginController;
import org.molgenis.framework.ui.EasyPluginModel;
import org.molgenis.framework.ui.FreemarkerView;
import org.molgenis.framework.ui.ScreenController;
import org.molgenis.framework.ui.ScreenView;
import org.molgenis.util.Tuple;

/**
 * A simple plugin to create the header of the MOLGENIS application. This
 * includes the header logo as well as the top level menu items for
 * documentation, services etc (replaces the hardcoded header).
 * 
 * @author Morris Swertz
 */
public class MolgenisHeader extends EasyPluginController<MolgenisHeaderModel>
{
	private static final long serialVersionUID = -7775794887717460675L;

	public MolgenisHeader(String name, ScreenController<?> parent)
	{
		super(name, parent);
		this.setModel(new MolgenisHeaderModel(this));
	}

	@Override
	public void handleRequest(Database db, Tuple request)
	{
		//static
	}

	@Override
	public void reload(Database db)
	{
		//static
	}

	@Override
	public boolean isVisible()
	{
		return true;
	}

	@Override
	public ScreenView getView() {
		return new FreemarkerView("org/molgenis/plugins/MolgenisHeader.ftl", this.getModel());
	}
}
