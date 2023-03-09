package figury;

import interfejsFigury.Figura;

public class Prostokat implements Figura {
    private double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return a+a+b+b;
    }

    @Override
    public double powierzchnia() {
        return a*b;
    }
}
