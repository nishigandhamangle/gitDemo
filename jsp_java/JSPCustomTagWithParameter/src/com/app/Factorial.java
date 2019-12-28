package com.app;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class Factorial extends TagSupport{
private int number;

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}
public int doStartTag()
{
	JspWriter out=pageContext.getOut();
	int fact=1;
	try
	{
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			
		}
		out.print(fact);
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}
