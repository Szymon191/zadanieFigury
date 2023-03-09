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
        figury.add(new Kolo(scanner.nextDouble()));

        System.out.println("Podaj dlugosc boku a trojkta:");
        System.out.println("podaj dlugosc boku b trojkata");
        figury.add(new Trojkat(scanner.nextDouble(),scanner.nextDouble()));

        System.out.println("Podaj dlugosc boku a prostokata:");
        System.out.println("podaj dlugosc boku b prostokata");
        figury.add(new Prostokat(scanner.nextDouble(),scanner.nextDouble()));

        for(Figura wys : figury){
            System.out.println(wys.getClass().getSimpleName() +": obwod: " + wys.obwod() + " powierzchnia " + wys.powierzchnia() );
        }
    }
}