package asg1;
	
		import java.util.Scanner;
		public class A {

		 public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int num;
	      System.out.println("Enter a number:");
	      num=cs.nextInt();
	      int sqr=num*num;
	      int flag=0;
	     while(num>0)
	     {
	         if(num%10 != sqr%10)
	           {flag=1;
	             break;
	           }
	         num=num/10;
	         sqr=sqr/10;
	     }
	     if(flag==0)
	      System.out.println("It is an Automorphic Number");
	     else
	     System.out.println("It is not an Automorphic Number");
	  cs.close();
		 }
		}
