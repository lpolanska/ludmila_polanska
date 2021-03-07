public class Calculator {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for (Operator operator : Operator.values())

        System.out.printf("%f %s %f = %f%n", n, operator, m, operator.eval(n,m));

    }
}