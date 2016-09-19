
public class Multithreading implements Runnable {
	
	 public void run() 
	 {
		useMinutes(10); 
		addMinutes(20);  
     }
	private void addMinutes(int minutes)
	{
		 System.out.println(Thread.currentThread().getName()+" "+ "has added minutes");
		 try 
		 {
		  Thread.sleep(50);
		 } 
		 catch (Exception e) 
		 {
		  System.out.println(e);
		 }  
		 System.out.println(Thread.currentThread().getName()+"has added "+minutes+" minutes");
	} 
	private void useMinutes(int minutes)
	{
	 
	 System.out.println(Thread.currentThread().getName()+ " used minutes");
	 try 
	 {
	   Thread.sleep(50);
	 } 
	 catch (Exception e) 
	 {
	   System.out.println(e);
	 }  
	 System.out.println(Thread.currentThread().getName()+" has used "+ minutes +" minutes");
	}

	public static void main(String[] args)
	 {
	  Multithreading cell = new Multithreading();
	  Thread thread1 = new Thread(cell,"Person1");
	  Thread thread2 = new Thread(cell, "Person2");
	  thread1.start();
	  thread2.start();
	  }

}





