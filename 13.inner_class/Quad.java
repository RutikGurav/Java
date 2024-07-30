public class Quad {
    int a, b, c;
    double d;

    public Quad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = calc(a, b, c);
    }

    public double calc(int a, int b, int c) {
        // Calculate the discriminant
        return Math.pow(b, 2) - 4 * a * c;
    }

    class Disc {
        public void cal() {
            if (d < 0) {
                System.out.println("No real roots");
            } else {
                double sqrtD = Math.sqrt(d);
                double x1 = (-b + sqrtD) / (2 * a);
                double x2 = (-b - sqrtD) / (2 * a);

                System.out.println("+ve root is : " + x1);
                System.out.println("-ve root is : " + x2);
            }
        }
    }

    public static void main(String[] args) {
        Quad quad = new Quad(1, -3, 2);  // Example values: a=1, b=-3, c=2
        System.out.println("Discriminant: " + quad.d);

        Quad.Disc disc = quad.new Disc();
        disc.cal();
    }
}
