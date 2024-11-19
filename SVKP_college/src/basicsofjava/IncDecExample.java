package basicsofjava;

public class IncDecExample {

	public static void main(String[] args) {
		int a=7;
		
		//post increment
		System.out.println("a++  " + a++);//print first then increment
		System.out.println("after post-increment a   "+ a); //8
		
		//pre increment
		System.out.println("++a  " + ++a);//increment first ,then prints
		
		//post decrement
		System.out.println("a--  " + a--);//prints first then decrement 
		System.out.println("after post decrement a   " + a); 
		
		//pre decrement
		System.out.println("--a "+ --a);
		

	}

}
