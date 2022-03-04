package panyujie.practice.work4.two;

public class TestDemo {
    public static void main(String[] args) {
        EquationCompute e=new EquationCompute(5,1,4);
        e.computeRoot();

        EquationCompute ee=new EquationCompute(0,0,4);
        ee.computeRoot();

        EquationCompute eee=new EquationCompute(4,12,-1);
        eee.computeRoot();
    }

}
