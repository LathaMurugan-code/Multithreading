package multithreading;

public class ThreadMethods extends Thread 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMethods t = new ThreadMethods();
		//used to see default priority
		System.out.println(t.getPriority());
		//can set different priority max to min
		t.setPriority(1);
		//gets the name of the thread
		System.out.println(t.getName());
		//setting own names
		t.setName("MyThread");
		//returns the current life-cycle of the thread
		System.out.println(t.getState());
		//Starts the concurrent execution of the thread
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getState());
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread "+i+" called");
		}
		System.out.println(t.getState());
		

	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread "+i+" called");
		}
	}

}
