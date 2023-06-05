package Assignment0405;

public class KeyStatic {
    private static int a;

    static {
        a = staticMethod();
    }

    public static int getVariable() {
        return a;
    }

    private static int staticMethod() {

        return 100;
    }

    public static void main(String[] args) {
        System.out.println(getVariable());
    }
}