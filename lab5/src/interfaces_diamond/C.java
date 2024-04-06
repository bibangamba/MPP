package interfaces_diamond;

public class C implements A, B{

    @Override
    public void print() {
        A.super.print();
        B.super.print();
    }
}
