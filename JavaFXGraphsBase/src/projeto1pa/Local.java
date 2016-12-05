/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.Vertex;

/**
 *
 * @author rmlai
 */
public class Local {   
    
    private String nomeLocal;
    private boolean visitado;
    private Vertex<Local> parent;
    private int distanciaOrigem;
    private double precoOrigem;
    
    public Local(String nomeLocal){
        this.nomeLocal = nomeLocal;
        visitado = false;
        parent = null;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public boolean getVisitado(){
        return visitado;
    }

    public void setParent(Vertex<Local> parent) {
        this.parent = parent;
    }

    public Vertex<Local> getParent() {
        return parent;
    }
    
    public int getDistanciaOrigem(){
        return distanciaOrigem;
    }

    public void setDistanciaOrigem(int distanciaOrigem) {
        this.distanciaOrigem = distanciaOrigem;
    }
    
    public double getPrecoOrigem(){
        return precoOrigem;
    }

    public void setPrecoOrigem(double precoOrigem) {
        this.precoOrigem = precoOrigem;
    }
}
