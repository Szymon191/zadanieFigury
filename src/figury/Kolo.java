package figury;

import interfejsFigury.Figura;

public class Kolo implements Figura {
    private double promienKola;

    public Kolo(double promienKola) {
        this.promienKola = promienKola;
    }

    @Override
    public double obwod() {
        return 2*3.14*promienKola;
    }

    @Override
    public double powierzchnia() {
        return 3.14 * (promienKola*promienKola);
    }


}
