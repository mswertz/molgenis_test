package molgenis.test.mref;

import java.io.File;

import org.molgenis.framework.db.Database;

import app.CsvImport;

public class TestMrefImport
{
	
	
	public static void main(String[] args) throws Exception
	{
		File directory = new File(TestMrefImport.class.getResource("").getFile());
		System.out.println("Importing from dir "+directory);
		Database db = null;
		try
		{
			db = (Database) app.DatabaseFactory.create();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CsvImport.importAll(directory, db, null);

	

	}
}
