package OOPS.animal;



public class Cat extends Thread {
	
    public void run(){
		System.out.println("Code is running");
	}
	public static void main(String[] args){
		Cat c = new Cat();
		c.start();
	}
		
    }
