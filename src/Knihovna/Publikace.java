package Knihovna;
import java.util.Scanner;

public class Publikace {
    static Scanner sc = new Scanner(System.in);

    private String nazev;
    private String autor;
    private int rokVydani;
    private String ISBN;
    private int pocetStran;

    public Publikace() {
        System.out.println("Jaký je název?");
        nazev = sc.nextLine();
        this.nazev = nazev;
        System.out.println("Jaký je autor?");
        autor = sc.nextLine();
        this.autor = autor;
        System.out.println("Jaký je rok vydání?");
        rokVydani = sc.nextInt();
        sc.nextLine();
        this.rokVydani = rokVydani;
        System.out.println("Jaký je počet stran?");
        pocetStran = sc.nextInt();
        sc.nextLine();
        this.pocetStran = pocetStran;
        System.out.println("Jaký je ISBN kód?");
        ISBN = sc.nextLine();
        this.ISBN = ISBN;



    }


    public void getInfo(){
        System.out.println("Název: " + nazev);
        System.out.println("Autor: " + autor);
        System.out.println("Rok vydání: " + rokVydani);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Počet Stránek: " + pocetStran);
    }













    public String getNazev() {
        return nazev;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPocetStran() {
        return pocetStran;
    }
}
