package OOPS.animal;

public  class Animal  {
	static int age;

	public static void main(String[] args) {
		Car kia = new Car("Kia seltos" , 1021 , 1200000 , 10);
		kia.display();

		int n =Animal.age = 18;
		System.out.println(n);
	}		
}
