/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.Edge;

/**
 *
 * @author Rodrigo
 */
public interface EstrategiaCalcularSolucao<E, V> {
    
    public Iterable<Edge<E, V>> encontrarSolucao();
}
