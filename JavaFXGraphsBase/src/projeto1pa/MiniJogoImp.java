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
public class MiniJogoImp<Local, Ligacao> implements MiniJogo<Local, Ligacao>{
    private Graph<Local, Ligacao> graph;
    private Vertex<Local> origem, destino;
    //private String tipoJogo;
    private EstrategiaCalcularSolucao strategy;

    public MiniJogoImp(EstrategiaCalcularSolucao strategy) {
        this.graph = new GraphImpl();
        this.strategy = strategy;
    }
    
    public MiniJogoImp(EstrategiaCalcularSolucao strategy, Graph<Local, Ligacao> graph, Vertex<Local> origem, Vertex<Local> destino){
        this.graph = graph;
        this.strategy = strategy;
        this.origem = origem;
        this.destino = destino;
    }
    
    //Talvez por isto no main
    

    public void selecionarOrigemDestino(){
        Iterable<Vertex<Local>> vertices = graph.vertices();
        Iterator<Vertex<Local>> iterator = vertices.iterator();
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
    
    public Vertex<Local> getOrigem(){
        return origem;
    }
    
    public Vertex<Local> getDestino(){
        return destino;
    }
    
    public void setStrategy(EstrategiaCalcularSolucao strategy){
        this.strategy = strategy;
    }
    
    @Override
    public Edge<Ligacao, Local> insertEdge(Local elem1, Local elem2, Ligacao o){
        return graph.insertEdge(elem1, elem2, o);
    }
    
    @Override
    public Vertex<Local> insertVertex(Local elem){
        return graph.insertVertex(elem);

    }
    
//    public Iterable<Edge<Ligacao, Local>> calcularSolucao(){
//        return strategy.encontrarSolucao(graph, origem, destino);
//
//    }
    
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
