package Knihovna;

public class Ucebnice extends Publikace{

    public String predmet;

    public Ucebnice() {
        super();
        System.out.println("Jaký je předmět?");
        predmet = sc.nextLine();
        this.predmet = predmet;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Předmět: " + predmet);
    }



    public String getPredmet() {
        return predmet;
    }
}