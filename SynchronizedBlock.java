package multithreading;

public class SynchronizedBlock {

	public void msgSend(String msg)
	{
		System.out.println("Sending "+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg+" Sent");
		
	
		

	}

}
