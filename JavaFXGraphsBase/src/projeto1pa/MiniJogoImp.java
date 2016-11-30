/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import java.util.Iterator;
import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Graph;
import javafxgraphs.tad.GraphImpl;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author rmlai
 */
public class MiniJogoImp<V, E> implements MiniJogo<V, E>{
    private Graph graph;
    private Vertex<V> origem, destino;
    //private String tipoJogo;
    private EstrategiaCalcularSolucao strategy;

    public MiniJogoImp(EstrategiaCalcularSolucao strategy) {
        this.graph = new GraphImpl();
        this.strategy = strategy;
    }
    
    public MiniJogoImp(Graph graph, EstrategiaCalcularSolucao strategy){
        this.graph = graph;
        this.strategy = strategy;
        selecionarOrigemDestino();
    }
        
    private void selecionarOrigemDestino(){
        Iterable<Vertex<V>> vertices = graph.vertices();
        Iterator<Vertex<V>> iterator = vertices.iterator();
        boolean first = true;
        while(iterator.hasNext()){
            if(first){
                origem = iterator.next();
                iterator.remove();
                first = false;
            }
            destino = iterator.next();
            break;
        }
    }
    
    public Vertex<V> getOrigem(){
        return origem;
    }
    
    public Vertex<V> getDestino(){
        return destino;
    }
    
    public void setStrategy(EstrategiaCalcularSolucao strategy){
        this.strategy = strategy;
    }
    
    @Override
    public Edge<E, V> insertEdge(V elem1, V elem2, E o){
        return graph.insertEdge(elem1, elem2, o);
    }
    
    @Override
    public Vertex<V> insertVertex(V elem){
        return graph.insertVertex(elem);
    }
    
//    @Override
//    public Iterable<Edge<E, V>> encontrarCaminhoCurto() {
//        Iterable<Edge<E, V>> edges = graph.edges();
//        
//    }
//
//    @Override
//    public Iterable<Edge<E, V>> encontrarCaminhoBarato() {
//        
//    }
//
//    @Override
//    public Iterable<Edge<E, V>> encontrarCaminhoDeslocacao() {
//        
//    }
    
    

    
}
