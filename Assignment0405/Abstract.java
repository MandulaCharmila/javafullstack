package Assignment0405;

interface A{
    void method1();
}
interface B{
    void method2();
}

class Test implements A,B{
    public void method1() {
        System.out.println("Method 1 implemented");
    }
    public void method2() {
        System.out.println("Method 1 implemented");
    }
}


public class Abstract
{
    public static void main(String[] args){
        Test object = new Test();
        object.method1();
        object.method2();
    }
}


