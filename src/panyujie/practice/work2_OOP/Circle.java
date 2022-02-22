package panyujie.practice.work2_OOP;
class Circle extends Geometry { 
   private double r;
   public Circle() {
   } 
   public Circle(double r){
   	  this.r=r;
   }
 
   public  double getArea(){
    	return 3.14*r*r;
    }
    public String toString(){  //��ʾ���������   
    	return  String.format("Circle: radius=%f\n",r);
    } 
}
 