package session_6;

import java.io.Console;

public class consoleDemo {
public static void main(String[] args) {
	Console c=System.console();
	System.out.println("enter your name");
	String nm=c.readLine();
	System.out.println("enter password");
	char[] pwd=c.readPassword();
	String pass=String.valueOf(pwd);
	System.out.println("password="+pass);
}
}
