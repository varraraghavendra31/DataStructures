package Programs;

public class PrimeRecursion {
public static void main(String[] args) {
	int x=prime(3,2);
	if(x == 1)
    {
        System.out.println(" is prime number");
    }
    else
    {
        System.out.println(" is not prime number");
    }
}
static int prime(int n,int i)
	    {
	         if(i < n)
	        {
	            if(n % i != 0) 
	            {
	                return(prime(n,++i));
	            } 
	            else
	            {
	                return 0; 
	            }
	        }
	        return 1;
	    }
	
}
