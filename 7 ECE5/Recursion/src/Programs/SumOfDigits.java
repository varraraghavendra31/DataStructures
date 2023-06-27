package Programs;

public class SumOfDigits {
public static void main(String[] args) {
 int n=sum(-1234);
 System.out.println(n);
}
static int sum(int n) {
	int s=0;
	if(n<=9)return n;
	s+=n%10+sum(n/10);
	return s;
	
}


}
