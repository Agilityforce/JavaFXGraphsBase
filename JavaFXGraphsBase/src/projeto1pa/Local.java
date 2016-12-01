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
    
    public Local(String nomeLocal){
        this.nomeLocal = nomeLocal;
    }
    
    @Override
    public String toString(){
        return nomeLocal;
    }
}
