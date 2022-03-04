package panyujie.practice.work4.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double avg=0;
        int tmp=0;int sum=0;

        for(int i=0;i<5;i++){

            while (true) {
                try{
                    System.out.println("请输入第" + (i+1) + "个数");
                    tmp= sc.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println(e.toString());
                    sc.next();
                }
            }
            sum+=tmp;
        }

        avg=1.0*sum/5;

        System.out.println(avg);
    }
}
