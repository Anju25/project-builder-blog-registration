package businesslogic;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegistrationValidation 
{
    public String pwd; String cnpwd; String e;
	public boolean checkUserDetails(String email,String password,String confirmPassword)
	{
        pwd=password;
		cnpwd=confirmPassword;
		e=email;
		if(validPassword(pwd,cnpwd) &&validEmail(e))
		{
		return true;
		}
		else
		{
	     return false;
		}
}
	private boolean validPassword(String password, String confirmPassword)
	{
		 String regex="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		Pattern p=Pattern.compile(regex);
		if(password.contentEquals(confirmPassword))
		{
			Matcher m1=p.matcher(password);
			Matcher m2=p.matcher(confirmPassword);
		
		    return(m1.matches() && m2.matches());
		}
		return false;
		
	}
	private boolean validEmail(String email)
	{
		String regex="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";//"^(?=.*[0-9a-zA-Z+_.])"+"(@(.+))"+"(?=\\s+$)";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(email);
		return m.matches();
		
	}
}