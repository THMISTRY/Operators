package d.operators;

public class Logical {

    public static void main(String[] args) {

        int i=96;
        System.out.println(i<85 && i>38); // false
        System.out.println(i<94 || i>78); // true
        System.out.println(!(i<107 && i>135));// true
    }
}
