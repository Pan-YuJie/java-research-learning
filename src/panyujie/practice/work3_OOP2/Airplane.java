package panyujie.practice.work3_OOP2;

public class Airplane  extends Vehicle implements Flyable{ 
	public  String run(){
		return "Airplane run";
	}
	public String fillFuel(){  
		return "Airplane fillfuel .....";
	}
	public String takeoff(){
		return "Airplane takeoff ....";
	}
	public String fly(){
		return "Airplane fly ....";
	}
	public String land(){
		return "Airplane land ....";
	}	 
}