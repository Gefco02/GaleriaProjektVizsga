/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Helyes.Marton
 */
public class Galeria implements Iterable<KiallitasiTargy> {

    private ArrayList<KiallitasiTargy> kiallitasiTargyak;

    public Galeria() {
    }

    public ArrayList<KiallitasiTargy> getKiallitasiTargyak() {
        return kiallitasiTargyak;
    }
    

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return getKiallitasiTargyak().iterator();
    }

}
