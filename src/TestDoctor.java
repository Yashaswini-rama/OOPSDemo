
public class TestDoctor {

	public static void main(String[] args) {
		Specialist spObj=new Specialist("Mary",1234,"Newyork","Medicine");
		spObj.display();
		NonSpecialist nonSpObj=new NonSpecialist("John",5231,"Sydney");
		nonSpObj.display();

	}

}
