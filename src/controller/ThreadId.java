package controller;

public class ThreadId extends Thread{

	public ThreadId() {
	}

	@Override
	public void run() {
		int id  = (int)getId();
		System.out.println("Id da Thread : "+id);
	}

	
}
