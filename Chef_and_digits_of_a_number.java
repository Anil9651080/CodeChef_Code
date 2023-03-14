/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_digits_of_a_number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
		        int zeros = 0;
		        int ones = 0;
		        String str = s.next();
		        int str_len = str.length();
		        
		        for(int i = 0; i < str_len; ++i) {
		            
		            if(str.charAt(i) == '0'){
		                zeros++;
		            }
		            else{
		               ones++;
		            }
		        }
		        
		        if(ones == 1 || zeros == 1){
		            System.out.println("Yes");
		        }
		        else {
		          System.out.println("No");
		        }
		        t--;
		     }
	}
}
