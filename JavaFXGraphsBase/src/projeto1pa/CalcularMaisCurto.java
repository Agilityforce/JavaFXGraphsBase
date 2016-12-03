/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Graph;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author Rodrigo
 */
public class CalcularMaisCurto implements EstrategiaCalcularSolucao<Ligacao, Local> {
    
    @Override
    public Iterable<Edge<Ligacao, Local>> encontrarSolucao(Graph<Local, Ligacao> graph, Vertex<Local> origem, Vertex<Local> destino){
        ArrayList<Edge<Ligacao, Local>> queue = new ArrayList<>();
        Iterable<Edge<Ligacao, Local>> iterable = graph.incidentEdges(origem);
        //Iterator<Edge<Ligacao, Local>> iterator = iterable.iterator();
        //Map<Vertex, Vertex> example = new HashMap<>(); guarda o vertex parent
        //example.put(adj, current);
        
        for(Edge<Ligacao, Local> e : graph.edges()){
            e.element().setVisitado(false);
            queue.add(e);
        }
        //distancia = 0 ao 1º vertice
        //parent = null ao 1º vertice
        
        /*
        for(Edge<Ligacao, Local> e : graph.edges()){
            e.element().setVisitado(false);
            e.vertices()[0].element().setVisitado(false);
            e.vertices()[1].element().setVisitado(false);
        }*/
        
        Vertex<Local> current = origem;
        Edge<Ligacao, Local> curto = removeMin(queue);
        
        while(!queue.isEmpty()){
            if(current.element().getVisitado()){
                current = graph.opposite(current, curto);
            }
            
            for(Edge<Ligacao, Local> e : graph.incidentEdges(current)){
                if(graph.areAdjacent(current, graph.opposite(current, e))){
                    // Fazer update da distancia menor nos vertices
                }
            }
        }
        
        return null;
    }
    
    private Edge<Ligacao, Local> removeMin(ArrayList<Edge<Ligacao, Local>> queue){
        Edge<Ligacao, Local> edge = queue.remove(0);
        int menorDistancia = edge.element().getDistancia();
        for(Edge<Ligacao, Local> e : queue){
            int eDistancia = e.element().getDistancia();
            if(eDistancia < menorDistancia){
                edge = e;
            }
        }
        return edge;
    }
}
