/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author rmlai
 */
public interface MiniJogo<V, E> {
    
    public Edge<E, V> insertEdge(V elem1, V elem2, E o);
    
    public Vertex<V> insertVertex(V elem);
    
//    public Iterable<Edge<E, V>> encontrarCaminhoCurto();
//    
//    public Iterable<Edge<E, V>> encontrarCaminhoBarato();
//    
//    public Iterable<Edge<E, V>> encontrarCaminhoDeslocacao();
    
}
