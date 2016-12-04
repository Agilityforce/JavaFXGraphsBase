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
    private double preco;

    public Ligacao(String nomeLigacao, int distancia, double preco) throws IllegalArgumentException{
        if(distancia <= 0 || preco < 0){
            throw new IllegalArgumentException("Argumentos invalidos.");
        }else{
            this.distancia = distancia;
            this.preco = preco;
        }
    }

    public String getNomeLigacao() {
        return nomeLigacao;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public double getPreco(){
        return preco;
    }
}
