/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.Edge;

/**
 *
 * @author rmlai
 */
public class Ligacao{
    
    private String TipoLigacao;
    private String nomeLigacao;
    //private Local local1;
    //private Local local2;
    private int distancia;
    private int preco;

    public Ligacao(String TipoLigacao, String nomeLigacao, int distancia, int preco) {
        this.TipoLigacao = TipoLigacao;
        //this.nomeLigacao = verificarNomeLigacao(local1, local2);        
        this.distancia = distancia;
        this.preco = preco;
    }
    
//    private String verificarNomeLigacao(Local local1, Local local2){
//        return local1.toString() + local2.toString();
//    }
        
    public String getNomeLigacao(){
        return nomeLigacao;
    }
}
