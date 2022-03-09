package panyujie.practice.work2_OOP;

public class Ladder extends Geometry{
    private double above,bottom,height;
    public  Ladder(){ 
    }
    public Ladder(double above,double bottom,double height){
        this.above=above;
        this.bottom=bottom;
        this.height=height; 
    }
    public double getAbove(){
        return above;
    }
    double getBottom(){
        return bottom;
    }    
    public double getHeight(){
        return height;
    }     
    public void setAbove(double a){
        this.above=a;
    }
    public void setBottom(double b){
        bottom=b;
    }
    public void setHeight(double h){
        height=h;
    } 
    public double getArea(){
       return (this.above+bottom)*height/2.0;
    }  
      public String toString(){
    	return  String.format("Ladder: above=%f,bottom=%f,height=%f\n",above,bottom,height);
    } 
}