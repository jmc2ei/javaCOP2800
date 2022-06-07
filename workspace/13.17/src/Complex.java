public class Complex {
    double x;
    double y;

    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Complex(double x) {
        this.x = x;
        y = 0.0;
    }

    Complex() {
        x = 0.0;
        y = 0.0;
    }

    double getReal() {
        return x;
    }

    double getI() {
        return y;
    }

    Complex add(Complex z) {
        Complex addResult = new Complex(x + z.x, y + z.y);
        return addResult;
    }

    Complex subtract(Complex z) {
        Complex subtractResult = new Complex(x - z.x, y - z.y);
        return subtractResult;
    }

    Complex multiply(Complex z) {
        Complex multiplyResult = new Complex(x * z.x - y * z.y, y * z.x + x * z.y);
        return multiplyResult;
    }

    Complex divide(Complex z) {
        Complex divisionResult = new Complex((x * z.x + y * z.y)
                / (z.x * z.x + z.y * z.y), (y * z.x - x * z.y)
                / (z.x * z.x + z.y * z.y));
        return divisionResult;
    }

    double absolute() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        if (y == 0){
            return "" + x;
        }
        else{
           
            return "(" + x + " + " + y + "i)";
        }
    }
   
}
