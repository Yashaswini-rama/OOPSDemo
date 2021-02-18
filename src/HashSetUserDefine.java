import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefine {

    public static void main(String[] args) {
        
        Set<Emp> empset = new HashSet<Emp>();
        
        Employee4 e1=new Employee4(100,"\tjohn",5000);
        Employee4 e2=new Employee4(100,"\tmike",6000);
        Employee4 e3=new Employee4(100,"\tnik",7000);
        Employee4 e4=new Employee4(100,"\tjohn",5000);
        
      //  empset.add(e1);
       // empset.add(e2);
        //empset.add(e3);
        //empset.add(e4);
        
        for(Emp e:empset)
        {
            System.out.println(e.id+" "+e.name+" "+e.salary);
        }
    }

 

}
 