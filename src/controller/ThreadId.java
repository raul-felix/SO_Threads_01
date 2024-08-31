package controller;

public class ThreadId extends Thread {
	
	public ThreadId() {
		super();
	}
	
	@Override
	public void run() {
		long id = threadId();
		System.out.println("#" + id);
	}

}
