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
public class CalcularMenosDeslocacoes<Ligacao, Local> implements EstrategiaCalcularSolucao<Ligacao, Local>{
    
    @Override
    public Iterable<Edge<Ligacao, Local>> encontrarSolucao(Graph<Local, Ligacao> graph, Vertex<Local> origem, Vertex<Local> destino){
        if(graph == null || origem == null || destino == null){
            return null;
        }
        return null;
    }
}
