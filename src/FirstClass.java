public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double a = 20.00;
        double b = 80.00;
        double c = a + b * 100.00;
        double d = c % 40.00;
        boolean result = (d == 20.00) ? true : false;
        System.out.println("double a : " + a);
        System.out.println("double b : " + b);
        System.out.println("double c : " + c);
        System.out.println(" d : " + d);
        System.out.println("Result : " + result);
        if (!result) {
            System.out.println("Got some remainder");
        }
        int p1 = 10;
        int p2 = 20;
        int p3 = 30;
        calculateSum(10.00);
        calculateSum(p1,p2,p3);
    }
    public static void calculateSum(int l) {
        int sum = l;
        System.out.println("Sum 1 : "+sum);
    }
    public static void calculateSum(double l) {
        double sum = l ;
        System.out.println("Sum 0 : "+sum);
    }
    public static void calculateSum(int l,int m) {
        int sum = l + m;
        System.out.println("Sum 2 : "+sum);
    }
    public static void calculateSum(int l,int m,int n) {
        int sum = l + m + n;
        System.out.println("Sum 3 : "+sum);
    }
}