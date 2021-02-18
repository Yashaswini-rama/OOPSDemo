
public class StaticDemo {
static int count;
//int count;

StaticDemo()
{
	count=count+1;
}
static void display()
{
	System.out.println("The No.Of Objects Created is: "+count);
}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StaticDemo s1=new StaticDemo();
		@SuppressWarnings("unused")
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		StaticDemo.display();
		s3.display();
	}

}
