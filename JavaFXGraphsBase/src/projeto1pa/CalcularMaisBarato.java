/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Graph;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author Rodrigo
 */
public class CalcularMaisBarato<E, V> implements EstrategiaCalcularSolucao<E, V> {
    
    @Override
    public Iterable<Edge<E, V>> encontrarSolucao(Graph graph, Vertex<V> origem, Vertex<V> destino){
        if(graph == null || origem == null || destino == null){
            return null;
        }
    }
}
