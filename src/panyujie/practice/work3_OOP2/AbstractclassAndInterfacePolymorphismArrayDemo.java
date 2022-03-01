package panyujie.practice.work3_OOP2;

import java.util.Random;
public class AbstractclassAndInterfacePolymorphismArrayDemo{
	public static void main(String[] args){ 
	     Random r=new Random();
	     Animal[] a=new Animal[10];
	     for(int i=0; i<a.length; i++){
	     	int index=r.nextInt(3); 
	     	if(index==0) a[i]=new Bird();
	     	if(index==1) a[i]=new Superman();
	     	if(index==2) a[i]=new Dog();
	    } 
	    System.out.println(a[0].cry()); 
	    
	      Flyable[] f=new Flyable[3]; 
	      f[0]=new Bird();
	      f[1]=new Superman();
	      f[2]=new Airplane(); 
	      int index=r.nextInt(3);
	      System.out.println(f[index].fly());  
	      
	     System.out.println("\n-------------------");
	      for(Animal e: a ){
	       	System.out.println(e.cry());
	      } 
	} 
}