package in.raghava.patterns;
public class FullPyramid {
	public static void main(String[] args) {
	System.out.println("enter row size");
	 int n=4;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("h");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
		System.out.println();
	 }
   }
}
		
	
//	public static void main(String[] args) {
//		  Scanner cs=new Scanner(System.in);
//
//		     System.out.println("Enter the row size:");
//		     int row_size=cs.nextInt();
//		        int star_print=1;
//		     for(int out=0;out<row_size;out++)
//		     {
//		      for(int in=row_size-1;in>out;in--)
//		       System.out.printf(" ");
//		      for(int p=0;p<star_print;p++)
//		       System.out.printf("*");
//		      star_print+=2;
//		      System.out.println();
//
//		     }
//		     cs.close();
//		  }



