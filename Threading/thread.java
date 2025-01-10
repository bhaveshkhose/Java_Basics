package Threading;
import Multiple_Inheritance.Student;

class printHi extends Thread{
	
	public void run() {
		for(int i  =0 ; i < 50 ; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
	}
}

class printHello extends Thread{
	public void run() {
		for(int i =0 ; i < 50 ; i++) {
			System.out.println("hello");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
public abstract class thread implements Student {
	
public static void main(String [] a) {
		
		printHi hi  = new printHi();
		printHello hello = new printHello();
		
		hi.setName("thread1");
		hello.setName("thread2");
		
		hi.start();
		hello.start();
		
		try {
			for(int i =0 ; i < 50 ; i ++) {
				System.out.println("heyy");
			}
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		hello.setPriority(10);
		System.out.println(hello.getPriority());
		System.out.println("For hi object"+hi.currentThread());
		
		System.out.println("For hello object"+hello.currentThread());
		Thread tr = Thread.currentThread();
		tr.setName("thread3");
		System.out.println(tr);
		
		
		System.out.println("Active threads are "+tr.activeCount());
		
		System.out.println(tr.isAlive());
		//System.out.println(Thread.getAllStackTraces());
		System.out.println(tr.getPriority());
		
		
		
		
		
		
	}



}
