import java.util.ArrayList;

public class Pet extends AnimateAccount
{
	private Person owner;
	
	public Pet (String name, Image image) 
	{
		super(name, image);
	}

	public void setOwner(Person person) 
	{
		owner = person;
	}

	public void setFriends(ArrayList boList) {
		// TODO Auto-generated method stub
		
	}

	public void setMoments(ArrayList boMoments) {
		// TODO Auto-generated method stub
		
	}
}
