/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.GraphImpl;

/**
 *
 * @author rmlai
 */
public class MiniJogoImp implements MiniJogo{
    private GraphImpl graph;
    private Local origem;
    private Local destino;
    private boolean estadoJogo;

    public MiniJogoImp(GraphImpl graph, Local origem, Local destino) {
        this.graph = graph;
        this.origem = origem;
        this.destino = destino;
        graph.insertVertex(origem);
        graph.insertVertex(destino);
        estadoJogo = false;
    }
    
    @Override
    public void comecarJogo() {
        estadoJogo = true;
    }

    @Override
    public boolean estadoJogo() {
        return estadoJogo;
    }

    @Override
    public void acabarJogo() {
        estadoJogo = false;
    }
}