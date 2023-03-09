package figury;

import interfejsFigury.Figura;

public class Trojkat implements Figura {
    private double a,b;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return a + b + a*2;
    }

    @Override
    public double powierzchnia() {
        return a * b /2;
    }
}
