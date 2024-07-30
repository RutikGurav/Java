package type_casting;

class Implicit{
    public static void main(String[] args) {
        String c = "66";
        int i = Integer.parseInt(c);
        System.out.println(c);
        System.out.println(i);

        String a = "9";
        float b = Float.parseFloat(a);
        System.out.println(a);
        System.out.println(b);

        // String f = "45.33";
        // int g = Integer.parseInt(f);
        // System.out.println(f);
        // System.out.println(g);

         String f = "45.33";
        float g = Float.parseFloat(f);
        System.out.println(f);
        System.out.println(g);

        String s = "24.3";
        double d = Double.parseDouble(s);
        System.out.println(s);
        System.out.println(d);
    }
}