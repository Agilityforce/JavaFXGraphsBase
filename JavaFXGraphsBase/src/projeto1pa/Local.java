/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

/**
 *
 * @author rmlai
 */
public class Local {
    
    private String nomeLocal;
    private int distanciaOrigem;
    private double precoOrigem;
    private boolean visitado;
    
    public Local(String nomeLocal){
        this.nomeLocal = nomeLocal;
        visitado = false;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public boolean getVisitado(){
        return visitado;
    }
    public int getDistanciaOrigem(){
        return distanciaOrigem;
    }
    
    public double getPrecoOrigem(){
        return precoOrigem;
    }
    
    
    @Override
    public String toString(){
        return nomeLocal;
    }
}
