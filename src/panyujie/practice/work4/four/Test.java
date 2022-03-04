package panyujie.practice.work4.four;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int a=0,b=0;
        a=random.nextInt(100);//产生0~100的随机数

        System.out.println("随机数已产生！");

        while (true){
            System.out.println("--------请输入您猜的数字(整数)--------");
            while (true) {
                try {
                    b=sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println(e.toString());
                    sc.next();
                }
            }
            if (a==b){
                System.out.println("恭喜你，答对了！");
                break ;
            }
            if (a>b){
                System.out.println("sorry,您猜小了！");
            }
            if (a<b){
                System.out.println("sorry,您猜大了！");
            }
        }
    }
}