/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Helyes.Marton
 */
public class Festmeny extends KiallitasiTargy {

    private String eleresiUt;

    public Festmeny(LocalDate letrehozDatum, String keszito, String cim, String eleresiUt) {
        super(letrehozDatum, keszito, cim);
        this.eleresiUt = eleresiUt;

    }

    public Festmeny(LocalDate letrehozDatum, String keszito, String cim) {
        super(letrehozDatum, keszito, cim);
    }

    public Festmeny(String keszito, String cim) {
        super(keszito, cim);
    }

    public String megjelenit() {
        Path path = Paths.get(this.eleresiUt);
        String vissza;
        try {
            Files.readAllLines(path);
            vissza = "megjelenítés folyamatban";

        } catch (IOException ex) {
            vissza = "nem lehet megjeleníteni";
        }
        return vissza;
    }

    @Override
    public int compareTo(KiallitasiTargy arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
