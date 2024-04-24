package d.operators;

public class Assignment {

    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c;
        System.out.println(c = a + b);// c=70
        System.out.println(c += a);// c=c+a 100
        System.out.println(c -= a);// c=c-a 70
        System.out.println(c *= a);// c=c*a 2100
        System.out.println(c /= a);// c=c/a 70
        System.out.println(c %= a);// c=c%a 10
        System.out.println(c ^= a);// c=c^a 20
    }

}


