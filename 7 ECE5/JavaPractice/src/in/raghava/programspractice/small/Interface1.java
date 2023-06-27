package in.raghava.programspractice.small;

interface Interface1 {
	 default void  m1(){
		System.out.println("helo");
	}
	 static int m2() {
		return 0;
		 
	 }
	 private void m3() {
	 }
	 int m4();
}
