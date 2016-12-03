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
public class Ligacao{
    
    private String nomeLigacao;
    private int distancia;
    private int preco;
    private boolean visitado;

    public Ligacao(String nomeLigacao, int distancia, int preco) {
        this.distancia = distancia;
        this.preco = preco;
        visitado = false;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public boolean getVisitado(){
        return visitado;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public double getPreco(){
        return preco;
    }
    
    @Override
    public String toString(){
        return nomeLigacao;
    }
}
