
package galeriaprojekt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        Galeria g1 = new Galeria();
        g1.berak(new Festmeny("Alfonz","Kép a tájról"));
        g1.berak(new Festmeny(LocalDate.now(),"Gabor", "A kép a mezőről"));
        g1.berak(new Festmeny(LocalDate.of(2023, Month.MARCH, 12),"Laszlo"," Művel"));
        g1.berak(new Festmeny(LocalDate.now(),"János","Olvasás","src/kep.txt"));

        System.out.println("\n----------------\nKészítő rendezés\n");
        Collections.sort(g1.getKiallitasiTargyak(), KiallitasiTargy.keszitoRendezes());
        System.out.println(g1.getKiallitasiTargyak());
        System.out.println("\n----------------\nCím rendezés\n");
        Collections.sort(g1.getKiallitasiTargyak(), KiallitasiTargy.cimRendezes());
        System.out.println(g1.getKiallitasiTargyak());
        
        System.out.println("\n----------------\nMentés és beolvasás\n");
        ment(g1);
        g1=null;
        g1=beolvas();
        System.out.println(g1.getKiallitasiTargyak());
        

        

    }
    private static void ment(Galeria galeria) {
        try {
            FileOutputStream fajlKi = new FileOutputStream("galeria.ser");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(galeria);
            objKi.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
    private static Galeria beolvas() {
        Galeria galeria = null;
        try {
            galeria = (Galeria) new ObjectInputStream(new FileInputStream("galeria.ser")).readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        } finally {
            return galeria;
        }
    }
}
