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
public class CalcularMaisBarato implements EstrategiaCalcularSolucao<Ligacao, Local> {
    
    private Graph<Local, Ligacao> graph;
    private Vertex<Local> origem;
    private int valorSolucao;
    
    private void encontrarSolucao(Graph<Local, Ligacao> graph, Vertex<Local> origem){
        this.graph = graph;
        this.origem = origem; 
        
    }

    @Override
    public String dijktra(Graph<Local, Ligacao> graph, Vertex<Local> origem, Vertex<Local> destino) {
        encontrarSolucao(graph, origem);
        return "";
    }
}
