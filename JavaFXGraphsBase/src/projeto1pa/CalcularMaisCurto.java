/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Graph;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author Rodrigo
 */
public class CalcularMaisCurto implements EstrategiaCalcularSolucao<Ligacao, Local> {
    
    private Graph<Local, Ligacao> graph;
    private Vertex<Local> origem;
    private int valorSolucao;
    
    private void encontrarSolucao(Graph<Local, Ligacao> graph, Vertex<Local> origem){
        this.graph = graph;
        this.origem = origem; 
        
        ArrayList<Vertex<Local>> queue = new ArrayList<>();
        Map<Vertex, Vertex> parents = new HashMap<>();
        Local elemOrigem = origem.element();
        
        for(Vertex<Local> v : graph.vertices()){
            Local elemV = v.element();
            if(v.equals(origem)){
                elemOrigem.setDistanciaOrigem(0);
                parents.put(origem, null);
            }else{
                elemV.setDistanciaOrigem(Integer.MAX_VALUE);
            }
            elemV.setVisitado(false);
            queue.add(v);
        }
        
        while(!queue.isEmpty()){
            Vertex<Local> curto = removeMin(queue);
            Local elemCurto = curto.element();
            
            for(Edge<Ligacao, Local> e : graph.incidentEdges(curto)){
                Ligacao elemE = e.element();
                Vertex<Local> adj = graph.opposite(curto, e);
                Local elemAdj = adj.element();
                
                if(graph.areAdjacent(curto, adj)){
                    if(!elemAdj.getVisitado()){
                        int distancia = elemCurto.getDistanciaOrigem() + elemE.getDistancia();
                        if(distancia < elemAdj.getDistanciaOrigem()){
                            elemAdj.setDistanciaOrigem(distancia);
                            parents.put(adj, curto);
                        }
                    }
                }
            }
            elemCurto.setVisitado(true);
        }
    }
    
    private Vertex<Local> removeMin(ArrayList<Vertex<Local>> queue){
        Vertex<Local> vertex = null;
        int menorDistancia = Integer.MAX_VALUE;
        
        for(Vertex<Local> v : queue){
            int distV = v.element().getDistanciaOrigem();
            if(distV < menorDistancia){
                menorDistancia = distV;
                vertex = v;
            }
        }
        int pos = queue.lastIndexOf(vertex);
        return queue.remove(pos);
    }
    
    @Override
    public String dijktra(Graph<Local, Ligacao> graph, Vertex<Local> origem, Vertex<Local> destino){
        encontrarSolucao(graph, origem);
        
        Vertex<Local> atual = destino;
        Local elemAtual = destino.element();
        
        String str = "Custo do caminho mais curto: " + elemAtual.getDistanciaOrigem();
        str = str + "\nCaminho mais curto: ";
        String strAux = elemAtual.getNomeLocal();
        
        while(atual != origem){
            
        }
        
        return "";
    }
}
