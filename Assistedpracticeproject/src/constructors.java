public class constructors {
	String a, b;
	constructors()
	{
		System.out.println("No arguments Constructor");
	}
	constructors(String a,String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		constructors c=new constructors();
		constructors c1=new constructors("hii","hello who is this?");
	}

}



