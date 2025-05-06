package Knihovna;

public class Roman extends Publikace{

    public String zanr;

    public Roman() {
        super();
        System.out.println("Jaký je žánr?");
        zanr = sc.nextLine();
        this.zanr = zanr;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Žánr: " + zanr);
    }



    public String getZanr() {
        return zanr;
    }
}


