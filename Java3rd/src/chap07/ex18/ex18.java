package chap07.ex18;

public class ex18 {

	public static void main(String[] args) {
		Parent P = new Child();
		Child c = new Child();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println();
        c.method();
	}
}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{}