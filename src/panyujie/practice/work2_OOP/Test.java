package panyujie.practice.work2_OOP;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList arrayList=new ArrayList();
        
        //菜单
        while (true) {
            System.out.println("1.向数组中加入几何图形");
            System.out.println("2.统计几何图形个数");
            System.out.println("3.排序");
            System.out.println("4.按索引删除数组元素");
            System.out.println("5.查询平均面积");
            System.out.println("6.遍历数组元素");
            System.out.println("7.退出");
            System.out.print("请选择：");

            int op=0;
            op= sc.nextInt();
            if(op==1){
                System.out.println("创建图形 1.圆形 2.梯形 3.三角形");
                System.out.print("请选择: ");
                op= sc.nextInt();
                Geometry geometry = null;
                if(op==1){
                    double x=0;
                    System.out.print("请输入半径: ");
                    x= sc.nextDouble();
                    geometry=new Circle(x);
                }if(op==2){
                    double above = 0,bottom=0,height=0;
                    System.out.print("请输入上底，下底，高: ");
                    above=sc.nextDouble();
                    bottom=sc.nextDouble();
                    height=sc.nextDouble();
                    geometry=new Ladder(above,bottom,height);
                }if(op==3){
                   double bottom=0,height=0;
                    System.out.print("请输入底，高: ");
                    bottom=sc.nextDouble();
                    height=sc.nextDouble();
                    geometry=new Triangle(bottom,height);
                }
                    arrayList.add(geometry);
            }if(op==2){
                System.out.println("几个图形数量为："+arrayList.size());
            }if(op==3){
                arrayList.sort();
                System.out.println("排序成功");
                arrayList.toString();
            }if(op==4){
                int x=0;
                System.out.print("请输入索引下标：");
                x=sc.nextInt();
                Geometry g=arrayList.delete(x);
                System.out.println("成功删除元素： "+g.toString());
            }if(op==5){
                System.out.println(arrayList.averageArea());
            }if(op==6){
                System.out.println(arrayList.toString());
            }if(op==7){
                break;
            }

        }


    }

}
