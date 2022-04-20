/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Helyes.Marton
 */
public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy> {

    private LocalDate letrehozDatum;
    private String keszito;
    private String cim;

    public KiallitasiTargy(LocalDate letrehozDatum, String keszito, String cim) {
        if(letrehozDatum.compareTo(LocalDate.now())==1){
        }
        this.letrehozDatum = letrehozDatum;
        
        this.keszito = keszito;
        this.cim = cim;
    }

    public KiallitasiTargy(String keszito, String cim) {
        this(LocalDate.now(), keszito, cim);
    }

    public static keszitoComparator keszito() {
        return new keszitoComparator();
    }
    public static cimComparator cim() {
        return new cimComparator();
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

}
