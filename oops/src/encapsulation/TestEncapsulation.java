package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Encapsulate obj = new Encapsulate(); 
        obj.setName("shanu"); 
        obj.setAge(21); 
        obj.setRoll(40); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 

	}
