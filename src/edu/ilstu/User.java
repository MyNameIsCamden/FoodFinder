package edu.ilstu;

public class User
{
	private String firstName;
	private String lastName;
	
	User(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
	@Override
	public boolean equals(Object user){
		boolean result = false;
		
	    if (user == null) result = false;
	    else 
	    	{ 
	    	User tempUser = (User)user;
	    	if (tempUser.getFirstName().equals(this.getFirstName()) &&
	    			(tempUser.getLastName().equals(this.getLastName())))
	    		result = true;
	    	}
	    return result;
	}
}
