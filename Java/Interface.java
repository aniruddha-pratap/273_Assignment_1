
public class Interface implements UniversityFees {
	

	double totalFees;
	double feePerCredit;
	double diningFees;
	double parkingFees;
	String department;
	
	public Interface(int creditEnrolled, double feePerCredit,
			double diningFees, double parkingFees, String department){
		this.creditEnrolled = creditEnrolled;
		this.department = department;
		this.parkingFees = parkingFees;
		this.diningFees = diningFees;
		this.feePerCredit = feePerCredit;
	}
	
	int creditEnrolled;
	@Override
	public double calculateFees(int discount) {
		// TODO Auto-generated method stub
		totalFees = ((this.creditEnrolled * this.feePerCredit) + this.diningFees + this.parkingFees);
		this.totalFees = totalFees - ((discount*totalFees)/100);
		return this.totalFees;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return this.department;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface newUni = new Interface(9, 342.50, 142.75, 450, "Software Engineering");
		String dep = newUni.getDepartment();
		double fees=newUni.calculateFees(15);
		System.out.println("Deaprtment is: "+dep+" & Fees is: "+fees);
	}

}
