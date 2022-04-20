
package galeriaprojekt;

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
        


        

    }
    
}
