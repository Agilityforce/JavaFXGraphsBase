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
    
    private String TipoLigacao;
    private String nomeLigacao;
    private int distancia;
    private int preco;

    public Ligacao(String TipoLigacao, String nomeLigacao, int distancia, int preco) {
        this.TipoLigacao = TipoLigacao;      
        this.distancia = distancia;
        this.preco = preco;
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
