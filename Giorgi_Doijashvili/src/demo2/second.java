package demo2;

public class second {
    public static void main(String[] args) {

        sumable lmbd = (int x, int y) -> x + y;

        System.out.println(lmbd.sum(15,5));
    }
}