package Programs;

public class PowerUsingRecursion {
public static void main(String[] args) {
 	System.out.println(power(2,3,1));
//	System.out.println(power(2,3));
}

//private static int power(int b, int e) {
//	if(e==0)return b;
//	b *=power(b,e-1);
//	return b;
//	
//}

private static int power(int b, int e,int res) {
	if(e==0)return res;
	res*=b;
	return power(b,--e,res);
}
}
