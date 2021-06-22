package multithreading;

public class SyncCaller extends Thread {
	SynchronizedBlock s;
	String msg;
	SyncCaller(SynchronizedBlock s,String msg)
	{
		this.s = s;
		this.msg = msg;
	}

	public void run()
	{
		synchronized(s) {
			s.msgSend(msg);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedBlock s1 = new SynchronizedBlock();
		SynchronizedBlock s2 = new SynchronizedBlock();
		SyncCaller c = new SyncCaller(s1,"latha");
		SyncCaller c2 = new SyncCaller(s2,"kalai");
		c.start();
		c2.start();
		

	}

}
