public class Quadratic {
    public static class QuadraticEquation {
        double a, b, c, delta, root1, root2;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void getDelta() {
            this.delta = b * b - 4 * a * c;
        }

        public String getRoots() {
            if (this.a == 0) {
                if (this.b == 0) {
                    return "The equation has no real roots";
                } else {
                    return "The equation has 1 root: \n" + String.valueOf(rootPTB1());
                }
            } else {
                getDelta();
                if (this.delta > 0) {
                    return "The equation has 2 roots: \n " + String.valueOf(root1()) + " and " + String.valueOf(root2());
                } else if (this.delta == 0) {
                    return "The equation has two equal roots : \n " + String.valueOf(rootDeltaZero());
                } else {
                    return  "The equation has no real roots";
                }
            }
        }

        public double root1() {
            this.root1 = (-b + Math.sqrt(this.delta)) / (2 * a);
            return this.root1;
        }

        public double root2() {
            this.root2 = (-b - Math.sqrt(this.delta)) / (2 * a);
            return this.root2;
        }

        public double rootPTB1() {
            this.root1 = this.root2 = -c / b;
            return this.root1;
        }

        public double rootDeltaZero() {
            this.root1 = this.root2 = -b / (2 * a);
            return this.root1;
        }

    }
}
