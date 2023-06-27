package trys;

public  class A{
	public static void main(String[] args) {
		//all these methods present in throwable class 
	
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
//		e.printStackTrace();//name of exception description and printStackTrace
		System.out.println(e.toString());//only name of exception and description 
		System.out.println(e.getMessage());//only message
					
				}
			}
	}




