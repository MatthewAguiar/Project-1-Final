
public class Possession extends Account
{
	private Person owner;
	private double price;
	
	public Possession(String name, Image image, double price)
	{
		super(name, image);
		//this.owner = owner;
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
}