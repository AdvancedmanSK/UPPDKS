public class Mravenisko {
    private Stvorec telo;
    private Elipsa hlava;
    private Obdlznik spodok;
    private Obdlznik tyc;
    private Stvorec vlajka;
    private int x, y;
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
        poskladaj();
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
        this.vlajka.posunVodorovne(-60 + this.x);
        this.vlajka.posunZvisle(-50 + this.y);
        this.vlajka.zmenFarbu("brown");
        this.vlajka.zmenStranu(100);
        this.tyc.posunVodorovne(-60 + this.x);
        this.tyc.posunZvisle(50 + this.y);
        this.tyc.zmenFarbu(this.farba);
        this.tyc.zmenStrany(100, 15);
        this.vlajka.zobraz();
        this.tyc.zobraz();
        this.spodok.zobraz();
        this.telo.zobraz();
        this.hlava.zobraz();
    }
}
