import figury.Kolo;
import figury.Prostokat;
import figury.Trojkat;
import interfejsFigury.Figura;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figura> figury = new ArrayList<>();

        System.out.println("Podaj promien kola");
        double promien = scanner.nextDouble();
        figury.add(new Kolo(promien));

        System.out.println("Podaj dlugosc boku a trojkta:");
        System.out.println("podaj dlugosc boku b trojkata");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        figury.add(new Trojkat(a,b));

        System.out.println("Podaj dlugosc boku a prostokata:");
        System.out.println("podaj dlugosc boku b prostokata");
        double bt = scanner.nextDouble();
        figury.add(new Prostokat(scanner.nextDouble(),bt));

        for(Figura wys : figury){
            System.out.println(wys.getClass().getSimpleName() +": obwod: " + wys.obwod() + " powierzchnia " + wys.powierzchnia() );
        }
    }
}