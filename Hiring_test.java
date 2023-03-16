import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hiring_test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner s = new Scanner(System.in)) {
            int t=s.nextInt();
            while(t>0){
                int n=s.nextInt();
                int m=s.nextInt();
                int x=s.nextInt();
                int y=s.nextInt();
                String[] str=new String[n];
                for(int i=0;i<n;i++){
                    str[i]=s.next();
              }
              for(int i=0; i<n; i++){
                    int p = 0, f = 0;
                    for(int j=0; j<m; j++){
                        if(str[i].charAt(j) == 'P'){
                            p++;
                        }
                        else if(str[i].charAt(j) == 'F'){
                            f++;
                        }
                    }
                    if(f>=x || (f == x-1 && p>=y)){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                System.out.print("\n");
                t--;
            }
        }
	}
}
