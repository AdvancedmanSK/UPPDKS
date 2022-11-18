
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
    private int x, y;
    public Mravce(int x, int y) {
        // initialise instance variables
        this.hlava = new Kruh();
        this.telo = new Kruh();
        this.zadok = new Kruh();
        this.krk = new Obdlznik();
        this.chrbat = new Obdlznik();
        this.x = x;
        this.y = y;
    }
}
