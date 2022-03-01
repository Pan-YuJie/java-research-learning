package panyujie.practice.work3_OOP2;
public class Bird  extends Animal  implements Flyable{ 
	public  String eat(){
		return "Bird eat...";
	}
	public String cry(){  
		return "Bird cry ....";
	}
	public String layEggs(){
		return "Bird lay eggs";
	}
 
	public String takeoff(){
		return "Bird takeoff ....";
	}
	 
	public String fly(){
		return "Bird fly ....";
	}
	 
	public String land(){
		return "Bird land ....";
	}	 
}