import java.io.*;
public class Employee10 implements Serializable
{
	public String name,address;
	public  int SSN;
	public int number;
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+name+" "+address);
	}
}
