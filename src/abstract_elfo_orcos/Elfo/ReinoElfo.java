/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos.Elfo;

import abstract_elfo_orcos.Orco.Orco;
import abstract_elfo_orcos.Elfo.Elfo;
import abstract_elfo_orcos.Reino;



/**
 *
 * @author Lucho
 */
public class ReinoElfo implements Reino{

    @Override
    public Elfo getElfo(String tipo) {
        switch (tipo) {
            case "arquero":
                return new Arquero();
            case "mago":
                return new Mago();
            case "reyelfo":
                return new ReyElfo();
        }
        return null;
    }

    @Override
    public Orco getOrco(String type) {
        return null;
    }

  
    /*
    public Orco getOrco(String tipo) {
        return null;
    }

    
    public Elfo getColor(String tipo) {
        switch (tipo) {
            case "arquero":
                return new Arquero();
            case "mago":
                return new Mago();
            case "reyelfo":
                return new ReyElfo();
        }
        return null;
    }*/
    
    

   
}
