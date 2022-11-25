
/**
 * Write a description of class Mravce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mravce {
    /**
     * Constructor for objects of class Mravce
     */
    private Kruh hlava;
    private Kruh telo;
    private Kruh zadok;
    private Obdlznik krk;
    private Obdlznik chrbat;
    private Obdlznik nohy1;
    private Obdlznik nohy2;
    private int x, y;
    private String farba;
    public Mravce(int x, int y, String farba) {
        // initialise instance variables
        this.hlava = new Kruh();
        this.telo = new Kruh();
        this.zadok = new Kruh();
        this.krk = new Obdlznik();
        this.chrbat = new Obdlznik();
        this.nohy1 = new Obdlznik();
        this.nohy2 = new Obdlznik();
        this.x = x;
        this.y = y;
        this.farba = farba;
        zostroj();
    }
    public void zostroj() {
        this.nohy1.posunVodorovne(-8 + this.x);
        this.nohy1.posunZvisle(-45 + this.y);
        this.nohy1.zmenStrany(5, 40);
        this.nohy1.zobraz();
        this.nohy2.posunVodorovne(32 + this.x);
        this.nohy2.posunZvisle(-45 + this.y);
        this.nohy2.zmenStrany(5, 40);
        this.nohy2.zobraz();
        this.hlava.posunVodorovne(-19 + this.x);
        this.hlava.posunZvisle(-50 + this.y);
        this.hlava.zmenFarbu(this.farba);
        this.hlava.zobraz();
        this.krk.posunVodorovne(-60 + this.x + 20);
        this.krk.posunZvisle(-26 + this.y);
        this.krk.zmenFarbu(this.farba);
        this.krk.zmenStrany(35, 5);
        this.krk.zobraz();
        this.telo.posunVodorovne(20 + this.x);
        this.telo.posunZvisle(-50 + this.y);
        this.telo.zmenFarbu(this.farba);
        this.telo.zobraz();
        this.chrbat.posunVodorovne(this.x - 10);
        this.chrbat.posunZvisle(-26 + this.y);
        this.chrbat.zmenFarbu(this.farba);
        this.chrbat.zmenStrany(35, 5);
        this.chrbat.zobraz();
        this.zadok.posunVodorovne(60 + this.x);
        this.zadok.posunZvisle(-50 + this.y);
        this.zadok.zmenFarbu(this.farba);
        this.zadok.zobraz();
    }
}
