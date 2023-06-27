package Programs;

public class StateRecursion {
public static void main(String[] args) {
	sta(1);
}
static void sta(int n) {
	if(n==101) return;
	System.out.println("i love java "+n);
	sta(n+1);
}
}
