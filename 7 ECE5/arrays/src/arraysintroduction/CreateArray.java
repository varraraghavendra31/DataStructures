package arraysintroduction;

public class CreateArray {
public static void main(String[] args) {
	int [] a=new int[256];
	a[0]=1;
	a[1]=3;
	a[2]=4;
	a[3]=5;
	a[4]=6;
	for(int i=0;i<a.length;i++) {
		System.out.print("Element at the index "+a.length+" ");
	}
}
}
