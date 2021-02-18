
public class Contact {
	void createContact(String name,int num)
	{
		System.out.println("Name:"+name+" Num:"+num);
	}
	void createContact(String name,int num1,int num2)
	{
		System.out.println("Name:"+name+" Num1:"+num1+" Num2:"+num2);
	}
	

	public static void main(String[] args) {
		Contact a=new Contact();
		a.createContact("Yash", 12345678);
		a.createContact("Abc",541638126,648768937);  

	}

}
