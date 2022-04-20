/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Helyes.Marton
 */
public class keszitoComparator implements Comparator<KiallitasiTargy> {



    @Override
    public int compare(KiallitasiTargy egyik, KiallitasiTargy masik) {
        Collator col = Collator.getInstance();
        return col.compare(egyik.getKeszito(), masik.getKeszito());
    }
}
