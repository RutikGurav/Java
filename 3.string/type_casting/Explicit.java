package type_casting;

class Explicit {
    public static void main(String[] args) {
        int a = 12;
        float b = a;
        System.out.println(a);
        System.out.println(b);

        float d = 16.5f;
        int e = (int) d;
        System.out.println(d);
        System.out.println(e);

        float g = 9.3f;
        double h = (double) g;
        System.out.println(g);
        System.out.println(h);

        char c = '6';
        int c1 = (int) c;
        System.out.println(c);
        System.out.println(c1);
    }
}


