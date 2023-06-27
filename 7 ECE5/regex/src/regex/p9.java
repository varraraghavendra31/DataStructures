package regex;

	import java.util.Scanner;
	public class p9 {

	 public static void main(String[] args) {
	  Scanner cs=new Scanner(System.in);
	  String str1;
	  System.out.println("Enter your String:");
	  str1=cs.nextLine();
	  char[] str=str1.toCharArray();
	  for(int i=0;i<str.length;i++) {
	     
	     if(i==0 || str[i-1]==' ') str[i]=Character.toUpperCase(str[i]);
	  }
	  System.out.print("After Converting String is: ");
	  for(int i=0;i<str.length;i++)
//		  String s=new String(str);
	  System.out.print(str[i]);
	  cs.close();
	 }
	}


