import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Single_Operation_part1 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while(t>0){
                int n = s.nextInt();
                String str = s.next();
                int count=0;
                for(int i=0; i<n; i++){
                    if(str.charAt(i)=='1'){
                        count++;
                    }else{
                        break;
                    }
                }
                
                System.out.println(count);
                t--;
            }
        }
	}
}
