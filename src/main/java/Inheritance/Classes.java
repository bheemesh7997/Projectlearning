package Inheritance;

public class Classes {

	public static void main(String[] args) {
		
		Superclass obj = new Superclass();
		obj.booking();
		
		Superclass obj1 = new subclass();
		obj1.booking();

		Superclass obj2 = new Superclass();
		obj2.add();
		
		Superclass obj3 = new subclass();
		obj3.add();
	}

}
