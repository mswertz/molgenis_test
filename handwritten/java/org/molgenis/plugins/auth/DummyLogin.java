package org.molgenis.plugins.auth;

import java.text.ParseException;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.db.DatabaseException;
import org.molgenis.framework.db.QueryRule;
import org.molgenis.framework.security.Login;
import org.molgenis.util.Entity;


public class DummyLogin implements Login
{
	String name = null;
	
	@Override
	public QueryRule getRowlevelSecurityFilters(Entity entity)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getUserId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserName()
	{
		return this.name;
	}

	@Override
	public boolean canWrite(Entity entity) throws DatabaseException
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canRead(Entity entity)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAuthenticated()
	{
		if(this.name != null) return true;
		return false;
	}

	@Override
	public boolean login(Database db, String name, String password)
	{
		this.name = name;
		return true;
	}

	@Override
	public void logout()
	{
		this.name = null;
	}

	@Override
	public <E extends Entity> boolean canRead(Class<E> entityClass) throws DatabaseException
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Entity> boolean canWrite(Class<E> entityClass) throws DatabaseException
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLoginRequired()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reload(Database db) throws DatabaseException, ParseException
	{
		//nothing to do
		
	}

}
