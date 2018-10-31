
public abstract class Account
{
	private Identity identity; //Creates a composition with an identity object. (An account HAS-A identity but not the other way around.) 
	
	public Account(String name, Image image)
	{
		identity = new Identity(name, image); //Composition.
	}
	
	public Identity getIdentity()
	{
		return identity;
	}
	
	public boolean equals(Object object)
	{
		Account account = (Account)object; //Upcast the object to an Account to get its name. 
		if(identity.name.equals(account.getIdentity().name)) //Compare the identities of objects.
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
}
