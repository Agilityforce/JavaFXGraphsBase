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
public interface MiniJogo<Local, Ligacao> {
    
    public Edge<Ligacao, Local> insertEdge(Local elem1, Local elem2, Ligacao o);
    
    public Vertex<Local> insertVertex(Local elem);
    
//    public Iterable<Edge<E, V>> encontrarCaminhoCurto();
//    
//    public Iterable<Edge<E, V>> encontrarCaminhoBarato();
//    
//    public Iterable<Edge<E, V>> encontrarCaminhoDeslocacao();
    
}
