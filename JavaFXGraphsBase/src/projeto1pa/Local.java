/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1pa;

import javafxgraphs.tad.InvalidEdgeException;
import javafxgraphs.tad.Vertex;

/**
 *
 * @author rmlai
 */
public class Local {
    
    private String nomeLocal;
    
    public Local(String nomeLocal){
        this.nomeLocal = nomeLocal;
    }
    
    public String getNomeLocal(){
        System.out.println("Test");
        return nomeLocal;
    }
}
