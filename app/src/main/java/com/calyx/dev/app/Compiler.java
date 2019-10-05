package com.calyx.dev.app;

public class Compiler
{
	public String code;
	public Compiler(String code){
		this.code=code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getCode()
	{
		return this.code;
	}
	
	public String Compile()
	{
	  String retVal="";
		//int[] currentIndex= new int[32];
	  int currentValue=0;
	  for(char c:code.toCharArray())
	  {
		  switch(c)
		  {
			  case '+':
				  currentValue++;
				  break;
			  case '-':
				  currentValue--;
				  break;
			  case '.':
				  char x=(char)(currentValue);
				  retVal+=""+x;
				  System.out.println(x);
				  break;
		  }
	  }
	  return retVal;
	}
	
	
	
}
