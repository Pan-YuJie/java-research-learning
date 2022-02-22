package panyujie.practice.work2_OOP;
class Triangle extends  Geometry{
    private double bottom,height; 
    public Triangle(){
    }
    public Triangle(double b,double h){
    	 this.bottom=b; 
     	 this.height=h;  	
    }  
    
    public  double getArea(){
    	return bottom*height/2;
    }  
     public String toString(){  //��ʾ���������   
    	return  String.format("Triangle: bottom=%f,height=%f\n",bottom,height);
    } 
}
 