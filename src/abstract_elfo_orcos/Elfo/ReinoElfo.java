/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_elfo_orcos.Elfo;



/**
 *
 * @author Lucho
 */
public class ReinoElfo {
    @Override
    public Orco getOrco(String tipo) {
        return null;
    }

    @Override
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
    }
}
