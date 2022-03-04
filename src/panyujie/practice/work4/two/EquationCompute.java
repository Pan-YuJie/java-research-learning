package panyujie.practice.work4.two;

public class EquationCompute {
    EquationCompute(){

    }

    public EquationCompute(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double a,b,c;
    private double x1;
    private double x2;

    public void computeRoot(){
        double t=(b*b)-(4*a*c);
        if(a==0&&b==0&&c!=0)
            System.out.println("方程没有解");
        else if(a==0&&b!=0&&c!=0)
        {
            x1 =-c/b;
            System.out.println("方程有一个实数解：\n");
            System.out.printf("x1 = %.4f",x1);
        }
        else if(t>0)
        {
            x1=(-b+Math.sqrt(t))/(2*a);
            x2=(-b-Math.sqrt(t))/(2*a);
            System.out.printf("方程有两个实数解：\n");
            System.out.printf("x1 = %.4f\n",x1);
            System.out.printf("x2 = %.4f\n",x2);
        }
        else if(t==0)
        {
            x1 = -b / (2 * a);
            System.out.printf("方程有一个实数解：\n");
            System.out.printf("x1 = %.4f\n", x1);
            System.out.printf("x2 = %.4f\n", x1);
        }
        else if(t<0)
        {
            x1 =-b/(2*a);
            x2 =Math.sqrt(4*a*c-b*b)/(2*a);
            //System.out.printf("x1 =" + realPart + "+" + imgPart + "i,  x2 = " + realPart + "-" + imgPart + "i");
            System.out.printf("方程有复数解：\n ");
            System.out.printf("x1 = "+"%.4f",x1);
            System.out.printf(" + "+"%.4f"+"i\n",x2);
            System.out.printf(" x2 = "+"%.4f",x1);
            System.out.printf(" - "+"%.4f"+"i\n",x2);
        }

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
