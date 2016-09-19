
public class ArrayDemo {

	/**
	 * @param args
	 */
	int courseList[] = {1,2,3,4,5};
	double totalFees = 0;
	double fees[] = {2500,1500,3300,8315,987};
	
	public double calculateFee(){
		for(int i=0; i<courseList.length; i++)
		{
			System.out.println("The fees for: " + courseList[i] + " is $ " + fees[i]);
			totalFees = totalFees + courseList[i] * (fees[i] - ((15 * fees[i])/100));
		}
		System.out.println("The total fees for the student is: $" + totalFees);
		return totalFees;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			ArrayDemo sampleArray = new ArrayDemo();
			sampleArray.calculateFee();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
