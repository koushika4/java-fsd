import java.util.*;

public class collections {

	public static void main(String[] args) {
		//creating array list
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("punjab");//
	      city.add("gujarath");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(18); 
	      vec.addElement(26); 
	      System.out.println(vec);
		
		//creating linked list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("koushi");  
	      names.add("prince");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hash set
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linked hash set
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(15);  
	       set2.add(14);
	       set2.add(12);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
