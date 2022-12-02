import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Random;
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private int vyska;
    private int sirka;
    private Kvet kvet;
    private Mravce mravec;
    private Mravenisko mravenisko;
    public Hra(int pocetKvetov, int pocetMravcovNaMravenisko) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.vyska = (int)screenSize.getHeight();
        this.sirka = (int)screenSize.getWidth();
        this.vyska = this.vyska / 5 * 4;
        this.sirka = this.sirka / 5 * 4;
        
        Random rand = new Random();
        for (int i = 0; i < pocetKvetov; i++) {
            int randomSurX = rand.nextInt(this.sirka);
            int randomSurY = rand.nextInt(this.vyska);
            this.kvet = new Kvet(randomSurX, randomSurY);
        }
        mravenisko(this.sirka, this.vyska);
    }
    
    private void mravenisko(int platnoX, int platnoY) {
        int y1 = platnoY / 2;
        int x1 = platnoX / 4;
        int y2 = platnoY / 2;
        int x2 = platnoX / 4 * 3;
        this.mravenisko = new Mravenisko(x1, y1,"blue");
        this.mravenisko = new Mravenisko(x2, y2,"red");
    }
}
