package Abstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Shape s1 = new Circle("black", 3.2); 
        Shape s2 = new Rectangle("whhite", 2, 4);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 

	}