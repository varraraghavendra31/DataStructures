package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordValidation {
public static void main(String[] args) {
	System.out.println("password");
	String password=(new Scanner(System.in)).next();
	String exp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}";
	
//	String exp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(password);
	if(m.matches()) 
		System.out.println("valid password");
	else System.out.println("not a valid password");
}
}

