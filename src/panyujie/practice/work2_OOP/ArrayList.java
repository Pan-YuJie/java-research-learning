package panyujie.practice.work2_OOP;

import java.util.Arrays; 
public class ArrayList {
    private Geometry[] elems;
    private int next;
   
    public ArrayList(int capacity) {
        elems = new Geometry[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Geometry g) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = g;
    } 
    public Geometry get(int index) {
    	if(index>=next) return null;
        return elems[index];
    }
    public void sort(){    //��elems���飬���������     
    	for(int i=0; i<next; i++){
    		for(int j=i; j<next; j++){ 
    			if(elems[i].getArea()<elems[j].getArea()){
    				Geometry temp;
    				temp=elems[i];
    				elems[i]=elems[j];
    				elems[j]=temp;
    			}
    		}
    	}
    } 
    public double averageArea(){  //�������ƽ��ֵ  
    	double sum=0.0;
    	for(int i=0; i<next; i++){
    		sum +=elems[i].getArea();
    	}
    	return sum/next;
    }
    public Geometry delete(int index){
    	Geometry g=get(index);  
    	if(g!=null){
    			for(int i=index; i<next-2; i++){
    	        	elems[i]=elems[i+1];
    	        }
				next--;
    	} 
    	return g;
    }
    public String toString(){
    	StringBuilder sb=new StringBuilder("");   //���ȥѧѧStringBuilder��   
    	sb.append("[").append("\n");
    	for(int i=0; i<next; i++){ 
    	    sb.append(elems[i].toString()); 
    	}
    	sb.append("]");
    	return sb.toString(); 
    }
    public int size() {  //���鳤��    
        return next;
    }
}