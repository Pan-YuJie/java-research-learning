package panyujie.practice.work3_OOP2;
public class AbstractclassAndInterfaceDemo{
	public static void main(String[] args){
		//�̳����̬    
		Animal a;
		a=new Bird();
		System.out.println(a.cry());
	    a=new Superman();
	    System.out.println(a.cry());
  
	    Vehicle v;
	    v=new Car();
	    System.out.println(v.run());
	    v=new Airplane();
	    System.out.println(v.run()); 

	    Flyable f; 
	    f=new Bird(); 
	    System.out.println(f.land());
	    
	    f=new Airplane();
	    System.out.println(f.land()); 
	}  
}