/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos;

import abstract_elfo_orcos.Elfo.ReinoElfo;
import abstract_elfo_orcos.Orco.ReinoOrco;

/**
 *
 * @author Lucho
 */
public class Reinos {
    public static Reino getReino(String type){
        switch (type){
           case "elfo":
                return (Reino) new ReinoElfo();
            case "orco":
                return  (Reino) new ReinoOrco();
        }
       
        return null;
    }
}
