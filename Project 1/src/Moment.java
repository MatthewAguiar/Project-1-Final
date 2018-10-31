import java.util.ArrayList;

public class Moment extends Account 
{
	private ArrayList<AnimateAccount> participants;
	private ArrayList<Float> smileValues;
	
	public Moment(String name, Image image, ArrayList<AnimateAccount> participants, ArrayList<Float> smileValues)
	{
		super(name, image);
		this.participants = participants;
		this.smileValues = smileValues;
	}
	
	public ArrayList<AnimateAccount> getParticipants()
	{
		return participants;
	}
	
	public ArrayList<Float> getSmileValues()
	{
		return smileValues;
	}
	
	public boolean hasParticipant(AnimateAccount participant)
	{
		return participants.contains(participant);
	}
	
	public int getParticipantIndex(AnimateAccount participant)
	{
		return participants.indexOf(participant);
	}

}
