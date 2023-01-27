public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Main.main(null);
        /*int i;
        i = 1;*/
        int i = 1;
        System.out.println(i);

//        A.i = 1;
        A a;
        a = new A();
//        a.i = 1;
        a.setI(1);
        A a2;
        a2 = new A();
        a2.setI(2);
    }
}
