package regex;
	import java.util.Scanner;
	public class SmallestPalindromicSubstring {
		static String reverse(String str_rev)
		{
		String rev="";
		for(int i=str_rev.length();i>0;--i)
		{
		rev+=(str_rev.charAt(i-1)); 
		}
		return rev;
		}
		public static void main(String[] args) {
			Scanner cs=new Scanner(System.in);
			String str1;
			System.out.println("Enter your String:");
			str1=cs.nextLine();
			str1+=" ";
			
			String[] sub_str=str1.split(" ");
			String[] sub_str1=new String[50];
			int in,p=0,flag=0,len1,minInd=0,min=0;
			String str_rev="";
		    System.out.print("Palindrome Substrings are:\n");
		    for(in=0;in<sub_str.length;in++)
		    {
		    	str_rev=sub_str[in];
		    	if((reverse(str_rev).compareTo(sub_str[in]))==0)
		    	{
		    		sub_str1[p]=sub_str[in];
		            System.out.print(sub_str1[p]+"\n");
		    		p++;
		    		flag=1;
		    	}
		    }
		    int len=p;
		    
		    //finding min length palindrome string from splitting string length
		    if(flag==1)
		    {
		    	min=sub_str1[0].length();
		        for(in=0;in<len;in++)
		        {
		            len1=sub_str1[in].length();
		            if(len1<min)
		            {
		                min=len1;
		                minInd=in;
		            }
		        }
		       System.out.print("Smallest palindrome Substring is "+sub_str1[minInd]+"\n");
		    }
		    else{
		    	System.out.print("No palindrome Found\n");
		    }	
		    cs.close();
		}
}
