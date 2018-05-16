/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos;

import abstract_elfo_orcos.Elfo.Elfo;
import abstract_elfo_orcos.Orco.Orco;

/**
 *
 * @author Lucho
 */
public class Abstract_Elfo_Orcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reino reino;

        reino =  Reinos.getReino("elfo");
        Elfo Arquero = reino.getElfo("arquero");
        Arquero.speak();


        reino = Reinos.getReino("orco");
        Orco Hechicero = reino.getOrco("hechicero");
        Hechicero.grito();
    }
    
}
