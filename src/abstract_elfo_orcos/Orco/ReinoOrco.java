/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos.Orco;


import abstract_elfo_orcos.Elfo.Elfo;
import abstract_elfo_orcos.Orco.Orco;
import abstract_elfo_orcos.Reino;


/**
 *
 * @author Lucho
 */
public class ReinoOrco implements Reino{

    @Override
    public Elfo getElfo(String type) {
        return null;
    }

    @Override
    public Orco getOrco(String tipo) {
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
  /*  public class ReinoElfo {
    //@Override
    public Elfo getElfo(String tipo) {
        return null;
    }

    //@Override
    public Orco getOrco(String tipo) {
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
}*/

}
