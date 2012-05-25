
package org.molgenis.test.ui;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.ui.EasyPluginController;
import org.molgenis.framework.ui.ScreenController;
<<<<<<< HEAD
import org.molgenis.framework.ui.ScreenView;
import org.molgenis.framework.ui.html.ActionInput;
import org.molgenis.framework.ui.html.FlowLayout;
import org.molgenis.framework.ui.html.HtmlElement.UiToolkit;
import org.molgenis.framework.ui.html.HtmlSettings;
import org.molgenis.framework.ui.html.Label;
=======
import org.molgenis.framework.ui.html.FlowLayout;
import org.molgenis.framework.ui.html.HtmlElement.UiToolkit;
import org.molgenis.framework.ui.html.ActionInput;
import org.molgenis.framework.ui.html.HtmlSettings;
import org.molgenis.framework.ui.html.LabelInput;
>>>>>>> be13413f28f625dab901d4d8a19dfc893cb642df
import org.molgenis.framework.ui.html.MolgenisForm;
import org.molgenis.framework.ui.html.SelectInput;
import org.molgenis.framework.ui.html.VerticalLayout;
import org.molgenis.util.Tuple;


/**
 * InputsTestController takes care of all user requests and application logic.
 *
 * <li>Each user request is handled by its own method based action=methodName. 
 * <li> MOLGENIS takes care of db.commits and catches exceptions to show to the user
 * <li>InputsTestModel holds application state and business logic on top of domain model. Get it via this.getModel()/setModel(..)
 * <li>InputsTestView holds the template to show the layout. Get/set it via this.getView()/setView(..).
 */
public class ChooseLibrary extends EasyPluginController<ChooseLibraryModel>
{
	private static final long serialVersionUID = 1L;

	public ChooseLibrary(String name, ScreenController<?> parent)
	{
<<<<<<< HEAD
		super(name, parent);
=======
		super(name, null, parent);
>>>>>>> be13413f28f625dab901d4d8a19dfc893cb642df
		this.setModel(new ChooseLibraryModel(this)); //the default model
		//this.setView(new FreemarkerView("InputsTestView.ftl", getModel())); //<plugin flavor="freemarker"
	}
	
	/**
	 * At each page view: reload data from database into model and/or change.
	 *
	 * Exceptions will be caught, logged and shown to the user automatically via setMessages().
	 * All db actions are within one transaction.
	 */ 
	@Override
	public void reload(Database db) throws Exception
	{	
//		//example: update model with data from the database
//		Query q = db.query(Investigation.class);
//		q.like("name", "molgenis");
//		getModel().investigations = q.find();
	}
	
	public void changelibrary(Database db, Tuple request)
	{
		logger.info("changelibrary: " + request);
		String lib = request.getString("library");
<<<<<<< HEAD
=======
		if("DOJO".equals(lib)) HtmlSettings.uiToolkit = UiToolkit.DOJO;
>>>>>>> be13413f28f625dab901d4d8a19dfc893cb642df
		if("JQUERY".equals(lib)) HtmlSettings.uiToolkit = UiToolkit.JQUERY;
		if("DEFAULT".equals(lib)) HtmlSettings.uiToolkit = UiToolkit.ORIGINAL;
		
	}
	
<<<<<<< HEAD
	public ScreenView getView()
	{
		MolgenisForm main = new MolgenisForm(this, new VerticalLayout());
		
		main.add(new Label("select demo (and to change library used)"));
=======
	public String render()
	{
		MolgenisForm main = new MolgenisForm(this, new VerticalLayout());
		
		main.add(new LabelInput("select demo (and to change library used)"));
>>>>>>> be13413f28f625dab901d4d8a19dfc893cb642df
		
		FlowLayout libraryPanel = new FlowLayout();
		
		SelectInput select = new SelectInput("library", HtmlSettings.uiToolkit.toString());
		select.addOption("JQUERY", "Jquery toolkit");
		select.addOption("DEFAULT","MOLGENIS original");
		
		libraryPanel.add(select);
		
		libraryPanel.add(new ActionInput("changelibrary"));
		
		main.add(libraryPanel);
		
<<<<<<< HEAD
		return main;
=======
		return main.render();
>>>>>>> be13413f28f625dab901d4d8a19dfc893cb642df
	}
}