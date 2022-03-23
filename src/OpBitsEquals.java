public class OpBitsEquals {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;
        a |=4;
        b >>=1;
        c <<= 1;
        a ^=c;
        System.out.println("a = "+ a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        int v = 4;
        int m = 1;
        boolean j = a<b;
        System.out.println((boolean) (v > m));
    }
}
