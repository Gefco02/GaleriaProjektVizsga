/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Helyes.Marton
 */
public class Galeria implements Iterable<KiallitasiTargy>, Serializable{

    private ArrayList<KiallitasiTargy> kiallitasiTargyak;

    public Galeria() {
        kiallitasiTargyak= new ArrayList<KiallitasiTargy>();

        
    }

    public ArrayList<KiallitasiTargy> getKiallitasiTargyak() {
        return kiallitasiTargyak;
    }
    public void berak(KiallitasiTargy kt) {
        kiallitasiTargyak.add(kt);
    }

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return getKiallitasiTargyak().iterator();
    }

    @Override
    public String toString() {
        return "Galeria{" + "kiallitasiTargyak=" + kiallitasiTargyak + '}';
    }

}
