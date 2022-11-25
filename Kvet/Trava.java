public class Trava {
    private Trojuholnik trava;
    private Trojuholnik trava1;
    private Trojuholnik trava2;
    private Trojuholnik trava3;
    private int x, y;
    public Trava(int x, int y) {
        this.trava = new Trojuholnik();
        this.trava1 = new Trojuholnik();
        this.trava2 = new Trojuholnik();
        this.trava3 = new Trojuholnik();
        this.x = x;
        this.y = y;
        poskladaj();
    }
    
    public void poskladaj() {
        this.trava.posunVodorovne(-60 + this.x);
        this.trava.posunZvisle(50 + this.y);
        this.trava.zmenFarbu("green");
        this.trava.zmenRozmery(70, 10);
        this.trava.zobraz();
        this.trava1.posunVodorovne(-50 + this.x);
        this.trava1.posunZvisle(50 + this.y);
        this.trava1.zmenFarbu("green");
        this.trava1.zmenRozmery(70, 10);
        this.trava1.zobraz();
        this.trava2.posunVodorovne(-40 + this.x);
        this.trava2.posunZvisle(50 + this.y);
        this.trava2.zmenFarbu("green");
        this.trava2.zmenRozmery(70, 10);
        this.trava2.zobraz();
        this.trava3.posunVodorovne(-30 + this.x);
        this.trava3.posunZvisle(50 + this.y);
        this.trava3.zmenFarbu("green");
        this.trava3.zmenRozmery(70, 10);
        this.trava3.zobraz();
    }
}
