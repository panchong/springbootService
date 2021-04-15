package sun.socket;

public class Main {

    private static Integer same(Integer m, Integer n){
        System.err.println(String.format("%3.0d-%3.0d", m, n));
        int r = m % n;
        if (r == 0)
            return n;
        return same(n, r);
    }

    public static void main(String[] args) {
        System.out.println(same(119, 544));
    }
}
