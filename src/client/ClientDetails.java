/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Daniel
 */
public class ClientDetails {
    
    private String _nome;
    public ClientDetails(){
        _nome = "";
    }
    
    public String getCliente(){
        return _nome;
    }
    
    public void setCliente(String c){
        _nome = c;
    }
}
