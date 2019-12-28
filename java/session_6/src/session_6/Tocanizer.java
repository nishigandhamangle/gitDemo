package session_6;

import java.util.StringTokenizer;

public class Tocanizer {
public static void main(String[] args) {
	
	StringTokenizer st=new StringTokenizer("sea shell sea shore"," ");
	while(st.hasMoreElements())
	{
		System.out.println(st.nextToken());
	}
}
}
