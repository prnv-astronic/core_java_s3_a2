package CORE_JAVA_WELCOM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class core_java_session3_assignment2 {
	static Boolean same;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1st String");
		
		String s1=obj.readLine();
		
		System.out.println("Enter 2nd String");
		
		String s2=obj.readLine();
		
		if(s1.equals(s2))
		{
			same=true;
			System.out.println("Strings match");
		}
		else
		{
			same=false;
			System.out.println("Strings do not match");
		}
		
		System.out.println(s1.equals(s2));
		
	}

}
