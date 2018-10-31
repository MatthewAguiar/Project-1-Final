
public class Possession extends Account
{
	private Person owner;
	private double price;
	
	public Possession(String name, Image image, double price)
	{
		super(name, image);
		this.price = price;
	}
	
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
	
	public double getPrice()
	{
		return price;
	}
}
