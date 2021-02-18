import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		Employee10 e=new Employee10();
		e.name="Michael Jackson";
		e.address="Castle Street";
		e.SSN=11122333;
		e.number=101;
		try
		{
			FileOutputStream fileOut=new FileOutputStream("C:/Test/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:/Test/employee.ser");
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
