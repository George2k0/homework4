package demo3;

public class Main {
    public static void main(String[] args) {

        SamsungNote samsungNote = new SamsungNote();
        printSmartphone(samsungNote);

        Panasonic panasonic = new Panasonic();
        printSmartphone(panasonic);

        IphoneX iphoneX = new IphoneX();
        printSmartphone(iphoneX);

        Nokia nokia = new Nokia();
        printSmartphone(nokia);
    }

    public static <s extends Smartphone> void printSmartphone(Smartphone S) {
        System.out.println("Smart");
    }

    public static <s extends Smartphone> void printSmartphone(Simbian s) {
        System.out.println("Simbian");
    }
}
