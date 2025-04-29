import Knihovna.Publikace;
import Knihovna.Roman;
import Knihovna.Ucebnice;

import java.util.ArrayList;
import java.util.Scanner;

public class KnihovnaApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Roman> romany = new ArrayList<>();
        ArrayList<Ucebnice> ucebnice = new ArrayList<>();

        for (boolean behZapisu = true; behZapisu == true; ) {

            System.out.println("Jaký typ publikace cheš zadat?");
            System.out.println("1 - Román");
            System.out.println("2 - Učebnice");
            int vyberPublikace = sc.nextInt();
            sc.nextLine();
            switch (vyberPublikace) {

                case 1:
                    romany.add(new Roman());
                    break;


                case 2:
                    ucebnice.add(new Ucebnice());
                    break;
            }
            System.out.println("Chceš zapsat další publikaci?");
            System.out.println("ano");
            System.out.println("ne");
            String pokracovat = sc.nextLine();
            pokracovat = pokracovat.toLowerCase();
            if (pokracovat.equals("ano")) {

            } else if (pokracovat.equals("ne")) {
                behZapisu = false;
            } else {
                System.err.println("ŠPATNĚ - ZA TREST MUSÍŠ ZAPSAT DALŠÍ PUBLIKACI");
            }

        }


        for (Roman r : romany) {
            r.getInfo();
            System.out.println();
        }

        for (Ucebnice u : ucebnice) {
            u.getInfo();
            System.out.println();
        }


        //NEJSTARŠÍ UČEBNICE
        Ucebnice nejstarsi = null;

        for (Ucebnice u : ucebnice) {

            if (nejstarsi == null || u.getRokVydani() < nejstarsi.getRokVydani()) {
                nejstarsi = u;
            }
        }

        if (nejstarsi != null) {
            System.out.println("Nejstarší učebnice je: " + nejstarsi.getNazev());
        } else {
            System.out.println("Žádná učebnice v knihovně není");
        }

        //CELKOVÝ POČET STRAN
        int celkovyPocetStran = 0;
        for (Ucebnice u : ucebnice) {
            celkovyPocetStran = celkovyPocetStran + u.getPocetStran();
        }
        System.out.println("Knihy mají celkově " +celkovyPocetStran+ " stran");

        //JMÉNA AUTORŮ MATEMATICKÝCH
        System.out.println("Autoři s matematickýmu učebnicemi jsou:");

        for (Ucebnice u : ucebnice) {
            String zanr = u.getPredmet().toLowerCase();

            if (zanr.equals("matematika")) {
                System.out.println(u.getAutor());
            }
        }

        //JMÉNO AUTORA NEJDELŠÍHO ROMÁNU
        Roman nejdelsi = null;

        for (Roman r : romany) {

            if (nejdelsi == null || r.getPocetStran() > nejdelsi.getPocetStran()) {
                nejdelsi = r;
            }
        }

        if (nejdelsi != null) {
            System.out.println("Autor s nejstarším románem je: " + nejdelsi.getAutor());
        } else {
            System.out.println("Žádný román v knihovně není");
        }

        //FANTASY ANO/NE
        for (Roman r : romany) {
            String zanr = r.getZanr().toLowerCase();
            if (zanr.equals("fantasy")) {
                System.out.println("Kniha s žýánrem fantadsy existuje");
            }
        }

























    }
}