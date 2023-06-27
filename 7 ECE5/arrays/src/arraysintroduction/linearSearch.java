package arraysintroduction;

public class linearSearch {
public static void main(String[] args) {
	int[]a= {2,3,4,7,8,3,4};
	int b=linearSearch(a,4);
	System.out.println(b);
}

public static int linearSearch(int[]a,int b) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) return i;
	}
	return -1;
	
}


}
