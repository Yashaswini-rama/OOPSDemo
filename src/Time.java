public class Time {
    int hour,min,sec;
    
    public Time(int h,int m,int s)
    {
        hour=h;
        min=m;
        sec=s;
        
    }
    void add(Time obj2) {
        this.hour+=obj2.hour;
        this.min+=obj2.min;
        this.sec+=obj2.sec;
    }
    void check() {
        if(this.sec>=60)
        {
            this.min+=1;
            this.sec=this.sec-60;
        }
        if(this.min>=60)
        {
            this.hour+=1;
            this.min=this.min-60;
        }
        if(this.hour>12)
        {
            
            this.hour=this.hour-12;
        }
    }
    void display() {
        System.out.print("Addition is: ");
        System.out.println(this.hour+":"+this.min+":"+this.sec);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Time obj1=new Time(10,45,60);
        Time obj2=new Time(3,55,5);        
        
        obj1.add(obj2);
        obj1.check();
        obj1.display();
        
    }
    

 

}