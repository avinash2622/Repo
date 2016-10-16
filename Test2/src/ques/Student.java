package ques;

public class Student {
	
	public String name = "";
	public int age=0;
	public String major= "undeclared";
	
	public boolean fulltime = true;
	
	public void display()
	{
		System.out.println("Name: " + name + "Major: " + major);
	}
	
	public boolean fulltime()
	{
		return fulltime;
	}
	
}
