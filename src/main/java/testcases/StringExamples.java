

package testcases;
import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="infosyss";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.next();
				
		int count=0;
		
		for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i)=='s')
            count++;
        } 
System.out.println(count);
    }

	}

