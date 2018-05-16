/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos.Orco;

import abstract_elfo_orcos.Orco.BestiaMayor;
import abstract_elfo_orcos.Elfo.Elfo;
import abstract_elfo_orcos.Orco.Hechicero;
import abstract_elfo_orcos.Orco.Lanzador;

/**
 *
 * @author Lucho
 */
public class ReinoOrco {
    public class ReinoElfo {
    //@Override
    public Orco getOrco(String tipo) {
        return null;
    }

    //@Override
    public Elfo getColor(String tipo) {
        switch (tipo) {
            case "bestia":
                return new BestiaMayor();
            case "hechicero":
                return new Hechicero();
            case "lanzador":
                return new Lanzador();
        }
        return null;
    }
}

}
