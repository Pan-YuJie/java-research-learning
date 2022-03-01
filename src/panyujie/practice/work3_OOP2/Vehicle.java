package panyujie.practice.work3_OOP2;
public abstract class Vehicle{
	private double color;
	private double weight;
	public double  getColor(){
		return color;
	}
	public double  getWeight(){
		return weight;
	}  
	public abstract String run();
}