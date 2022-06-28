/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.obj;

import java.util.*;

/**
 *
 * @author joaop
 */
public class Usuario 
{
    private String senha;
    private List<Encomenda> encomendas;
    private List<Cliente> clientes;
    private List<Ingrediente> ingredientes;
    
    public String getSenha()
    {
        return this.senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    
}
