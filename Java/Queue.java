public class Queue {

	/**
	 * @param args
	 */
	int maxLength = 5;
	int custInQueue[] = new int[maxLength];
	int front = 0;
	int rear = -1;
	int queueLength = 0;
	public int pushCustomer(int newCustomer)
	{	
		if (rear < maxLength - 1) 
		{
			rear = rear+1;
			custInQueue[rear] = newCustomer;
			System.out.println("You are customer number " + newCustomer + " in the line!" );
			queueLength = queueLength + 1;
		} 
		else 
		{
			System.out.println("Full! Please wait while other customers are served.");
		}
		return queueLength;
	}
	
	public int servingCustomer() 
	{
		if (rear >= front) 
		{
			int custServed = custInQueue[front];
			front++;
			System.out.println("Serving customer number: " + custServed);
			queueLength =queueLength-1;
		}	 
		else 
		{
			System.out.println("No more customers.");
		}
		return queueLength;
	}
	
	public void showCustomers()
	{
		if (rear >= front) 
		{
			System.out.println("Customer numbers left in queue.");
			for (int i = front; i <= rear; i++)
			{
				System.out.println(custInQueue[i]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			// TODO Auto-generated method stub
			Queue demo = new Queue();
			demo.servingCustomer();
			demo.pushCustomer(1);
			demo.pushCustomer(2);
			demo.pushCustomer(3);
			demo.pushCustomer(4);
			demo.pushCustomer(5);
			demo.pushCustomer(6);
			demo.showCustomers();
			demo.servingCustomer();
			demo.servingCustomer();
			demo.servingCustomer();
			demo.servingCustomer();
			demo.servingCustomer();
			demo.servingCustomer();
		
		}	
		catch(Exception e)
		{
			System.out.println(e);		
		}
	}
}
