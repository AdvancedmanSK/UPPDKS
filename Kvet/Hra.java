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
    private Trava trava;
    private int pocetTravy;
    public Hra(int pocetKvetov, int pocetMravcovNaMravenisko) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.vyska = (int)screenSize.getHeight();
        this.sirka = (int)screenSize.getWidth();
        this.vyska = this.vyska / 5 * 4;
        this.sirka = this.sirka / 5 * 4;
        this.pocetTravy = pocetKvetov / 2; 
        String farba = "";
        Random rand = new Random();
        for (int i = 0; i < pocetTravy; i++) {
            int randomSurX = rand.nextInt(this.sirka);
            int randomSurY = rand.nextInt(this.vyska);
            this.vytvorTravu(randomSurX, randomSurY);
        }
        for (int i = 0; i < pocetKvetov; i++) {
            int randomSurX = rand.nextInt(this.sirka);
            int randomSurY = rand.nextInt(this.vyska);
            this.vytvorKvet(randomSurX, randomSurY);
        }
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < pocetMravcovNaMravenisko; i++) {
                int randomSurX = rand.nextInt(this.sirka);
                int randomSurY = rand.nextInt(this.vyska);
                if (i % 2 == 0) {
                    farba = "blue";
                } else {
                    farba = "magenta";
                }
                this.vytvorMravca(randomSurX, randomSurY, farba);
            }
        }    
        this.vytvorMravenisko((this.sirka / 4), (this.vyska / 2), "blue");
        this.vytvorMravenisko((this.sirka / 4 * 3), (this.vyska / 2), "magenta");
    }
    
    private void vytvorMravenisko(int polohaX, int polohaY, String farba) {
        this.mravenisko = new Mravenisko(polohaX, polohaY, farba);
    }
    
    private void vytvorKvet(int surX, int surY) {
        this.kvet = new Kvet(surX, surY);
    }
    
    private void vytvorTravu(int surX, int surY) {
        this.trava = new Trava(surX, surY);
    }
    
    private void vytvorMravca(int surX, int surY, String farba) {
        this.mravec = new Mravce(surX, surY, farba);
    }
}
