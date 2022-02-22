package panyujie.practice.work2_OOP;
public class Demo{
    public static void main(String[] args){
    	  ArrayList list=new ArrayList();

    	  list.add(new Circle(1.0));
    	  list.add(new Triangle(1.0,  2.0));
	      list.add(new Ladder(1.0,  2.0, 3.0));
    	  list.add(new Circle(11.0));
    	  list.add(new Triangle(11.0, 22.0));
	      list.add(new Ladder(11.0,  22.0, 33.0));

 	    System.out.println( list.toString());
    	System.out.println( list.size()); 
    	System.out.println( list.averageArea());
    	
         list.sort();
    	 System.out.println( list.averageArea());
    	 System.out.println( list.toString());
    	 
        Geometry g=list.delete(0);
        System.out.println( g.toString());
        System.out.println( list.size());
       	System.out.println( list.toString());
    }
} 
