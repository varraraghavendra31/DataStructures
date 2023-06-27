import java.util.Scanner;
class Cross{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for (int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i==j || i+j==size+1)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
			
	}

}