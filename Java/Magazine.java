
public class Magazine {

	/**
	 * @param args
	 */
	public int maxNoOfBullets;
	public int[] myMagazine;
	public int top;
	
	public Magazine(int magCapacity)
	{
		maxNoOfBullets = magCapacity;
		myMagazine = new int[magCapacity];
		top = -1;
	}
	
	public int fillMagazine(int bullet)
	{
		if(top == maxNoOfBullets - 1)
		{
			System.out.println("Your mag is full! Start shooting.");
		}	
		else
		{	
			top = top + 1;
			myMagazine[top] = bullet;
			System.out.println("You added a bullet to your mag!");
		}	
		return top;
	}
	
	public int fire() 
	{
		if(top == -1)
		{	
			System.out.println("Oops! Your mag is empty.");
			return top;
		}	
		else
		{	
			System.out.println("You fired bullet number " + myMagazine[top] + " from you mag!");
			top = top - 1;
			return top;
		}	
	}
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Magazine pistol = new Magazine(5);
			pistol.fire();
			pistol.fillMagazine(1);
			pistol.fillMagazine(2);
			pistol.fillMagazine(3);
			pistol.fillMagazine(4);
			pistol.fillMagazine(5);
			pistol.fillMagazine(6);
			pistol.fire();
			pistol.fire();
			pistol.fire();
			pistol.fire();
			pistol.fire();
			pistol.fire();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
