public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //System.out.println(2);
        int a = 1;
        int b = 2;
        //add two numbers
        int c = a + b;
        //print number c
        System.out.println(c);
        Tm my = new Tm(9, " dd");

        System.out.println(my.getM());
    }
}
