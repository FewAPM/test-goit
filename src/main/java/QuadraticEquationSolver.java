import java.util.Arrays;

class QuadraticEquationSolver{
    public double[] solve(int a, int b, int c) {
        // ax2 + bx +c = 0
        // спочатку знайдемо дискримінант
        //  D = b2 - 4ac
        double d = (Math.pow(b, 2)) - (4 * a * c);
        double [] arr = new double[] {};

        if (d < 0) {
            arr = new double[]{};
        } else if (d > 0) {
            double x1 = (- b - Math.sqrt(d)) / (2 * a);
            double x2 = (- b + Math.sqrt(d)) / (2 * a);
            double max = Math.max(x1,x2);
            double min = Math.min(x1,x2);
            arr = new double[]{max, min};
        } else if ( d == 0) {
            double x1 = (- b - Math.sqrt(d)) / (2 * a);
                arr = new double[]{x1};
        }

        return arr;
    }
}
class QuadraticEquationSolverTest{
    public static void main(String[] args) {
        QuadraticEquationSolver qes = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(qes.solve(-1, -2, -3)));
    }
}