package test.code;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!");
		
		String s1 = "Dhoni";
		int lenght = s1.toLowerCase().length();
		System.out.println(lenght);
		
		StringBuffer sb = new StringBuffer("Sachin");
		
		int lenght1  = sb.reverse().length();
		System.out.println(lenght1);
	}

}
