
/**
 * Write a description of class Kvet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kvet {
    private int x;
    private int y;
    private Kruh kvet;
    private Kruh kvet2;
    private Kruh lupienok1;
    private Kruh lupienok2;
    private Kruh lupienok3;
    private Kruh lupienok4;
    private Kruh lupienok5;
    private Kruh lupienok6;
    private Kruh lupienok7;
    private Kruh lupienok8;
    private Obdlznik stonka;
    public Kvet(int x, int y) {
        this.x = x;
        this.y = y;
        this.kvet = new Kruh();
        this.kvet2 = new Kruh();
        this.lupienok1 = new Kruh();
        this.lupienok2 = new Kruh();
        this.lupienok3 = new Kruh();
        this.lupienok4 = new Kruh();
        this.lupienok5 = new Kruh();
        this.lupienok6 = new Kruh();
        this.lupienok7 = new Kruh();
        this.lupienok8 = new Kruh();
        this.stonka = new Obdlznik();
        
        this.stonka.zmenStrany(12, 50);
        this.stonka.posunZvisle(y - 60 + 80);
        this.stonka.posunVodorovne(x - 20 - 16);
        this.stonka.zmenFarbu("green");
        this.stonka.zobraz();
        
        this.kvet.zmenPriemer(60);
        this.kvet.posunZvisle(y - 60);
        this.kvet.posunVodorovne(x - 20);
        this.kvet.zmenFarbu("yellow");
        this.kvet.zobraz();
        
        this.kvet2.zmenPriemer(45);
        this.kvet2.posunZvisle(y - 60 + 7);
        this.kvet2.posunVodorovne(x - 20 + 7);
        this.kvet2.zmenFarbu("black");
        this.kvet2.zobraz();
        
        this.lupienok1.zmenPriemer(18);
        this.lupienok1.posunZvisle(y - 60 - 12);
        this.lupienok1.posunVodorovne(x - 20 + 22);
        this.lupienok1.zmenFarbu("yellow");
        this.lupienok1.zobraz();
        
        this.lupienok2.zmenPriemer(18);
        this.lupienok2.posunZvisle(y - 60 - 4);
        this.lupienok2.posunVodorovne(x - 20 + 46);
        this.lupienok2.zmenFarbu("yellow");
        this.lupienok2.zobraz();
        
        this.lupienok3.zmenPriemer(18);
        this.lupienok3.posunZvisle(y - 60 + 20);
        this.lupienok3.posunVodorovne(x - 20 + 54);
        this.lupienok3.zmenFarbu("yellow");
        this.lupienok3.zobraz();
        
        this.lupienok4.zmenPriemer(18);
        this.lupienok4.posunZvisle(y - 60 + 44);
        this.lupienok4.posunVodorovne(x - 20 + 46);
        this.lupienok4.zmenFarbu("yellow");
        this.lupienok4.zobraz();
        
        this.lupienok5.zmenPriemer(18);
        this.lupienok5.posunZvisle(y - 60 + 55);
        this.lupienok5.posunVodorovne(x - 20 + 20);
        this.lupienok5.zmenFarbu("yellow");
        this.lupienok5.zobraz();
        
        this.lupienok6.zmenPriemer(18);
        this.lupienok6.posunZvisle(y - 60 + 44);
        this.lupienok6.posunVodorovne(x - 20 - 6);
        this.lupienok6.zmenFarbu("yellow");
        this.lupienok6.zobraz();
        
        this.lupienok7.zmenPriemer(18);
        this.lupienok7.posunZvisle(y - 60 + 20);
        this.lupienok7.posunVodorovne(x - 20 - 12);
        this.lupienok7.zmenFarbu("yellow");
        this.lupienok7.zobraz();
        
        this.lupienok8.zmenPriemer(18);
        this.lupienok8.posunZvisle(y - 60 - 4);
        this.lupienok8.posunVodorovne(x - 20 - 2);
        this.lupienok8.zmenFarbu("yellow");
        this.lupienok8.zobraz();
    }
}
