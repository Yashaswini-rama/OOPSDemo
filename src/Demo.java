class Demo
{
 Demo ()
 {
   this("Java Flair");
 }
 
 Demo(String str){
     
     System.out.println(str);   
 }
 
 public static void main(String[] args) {
     @SuppressWarnings("unused")
	Demo d = new Demo();
 }
}