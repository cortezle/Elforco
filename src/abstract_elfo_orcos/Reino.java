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
public interface Reino {
    Elfo getElfo(String type);
    Orco getOrco(String type);
}