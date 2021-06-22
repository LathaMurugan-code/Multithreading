package multithreading;

public class InterruptedMethods extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedMethods i = new InterruptedMethods();
		i.start();
		try {
			i.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int j=0;j<5;j++)
		System.out.println("from main"+j);
		

	}
	public void run()
	{    for(int i=0;i<5;i++)
	{     //Thread.yield();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("from run"+i);
	}
	}

}
