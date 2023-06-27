package trickyquestions;

public class Constructor {
	int i;
	int j;
	String s;
	String s1;
	
public Constructor(int i, int j, String s, String s1) {
		this(i,j);
//		this(s,s1);
	}

public Constructor(String s, String s1) {
		super();
		this.s = s;
		this.s1 = s1;
//		this();
	}

public Constructor(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

public static void main(String[] args) {
	Constructor a=new Constructor (10,20,"ram","sam");
}
}
