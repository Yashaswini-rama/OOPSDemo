import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		try
		{
			Writer w=new FileWriter("c:/Test/data.txt");
			String content="She sells sea shells on the sea shore";
			w.write(content);
			w.close();
			System.out.println("Data written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
