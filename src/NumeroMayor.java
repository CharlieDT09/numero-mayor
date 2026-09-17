public class NumeroMayor {

    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double num5;

    public NumeroMayor(double num1, double num2, double num3, double num4, double num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    // Versión 1: solo con sentencias if
    public double mayorConIf() {
        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        }
        if (num5 > mayor) {
            mayor = num5;
        }

        return mayor;
    }

    // Versión 2: usando Math.max
    public double mayorConMath() {
        double mayor = Math.max(num1, num2);
        mayor = Math.max(mayor, num3);
        mayor = Math.max(mayor, num4);
        mayor = Math.max(mayor, num5);

        return mayor;
    }
}