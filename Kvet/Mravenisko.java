public class Mravenisko {
    private Stvorec telo;
    private Elipsa hlava;
    private Obdlznik spodok;
    private Obdlznik tyc;
    private Stvorec vlajka;
    private int x;
    private int y;
    private String farba;
    public Mravenisko(int x, int y, String farba) {
        this.telo = new Stvorec();
        this.hlava = new Elipsa();
        this.spodok = new Obdlznik();
        this.tyc = new Obdlznik();
        this.vlajka = new Stvorec();
        this.x = x;
        this.y = y;
        this.farba = farba;
        this.poskladaj();
    }
    
    public void poskladaj() {
        this.telo.posunVodorovne(-60 + this.x);
        this.telo.posunZvisle(-50 + this.y);
        this.telo.zmenFarbu("brown");
        this.telo.zmenStranu(100);
        this.hlava.posunVodorovne(-20 + this.x);
        this.hlava.posunZvisle(-70 + this.y);
        this.hlava.zmenFarbu("black");
        this.hlava.zmenOsi(100, 20);
        this.spodok.posunVodorovne(-60 + this.x);
        this.spodok.posunZvisle(50 + this.y);
        this.spodok.zmenFarbu(this.farba);
        this.spodok.zmenStrany(100, 15);
        this.vlajka.posunVodorovne(30 + this.x);
        this.vlajka.posunZvisle(-90 + this.y);
        this.vlajka.zmenFarbu(this.farba);
        this.vlajka.zmenStranu(20);
        this.tyc.posunVodorovne(30 + this.x);
        this.tyc.posunZvisle(-80 + this.y);
        this.tyc.zmenFarbu("brown");
        this.tyc.zmenStrany(5, 30);
        this.tyc.zobraz();
        this.vlajka.zobraz();
        this.spodok.zobraz();
        this.telo.zobraz();
        this.hlava.zobraz();
    }
}
