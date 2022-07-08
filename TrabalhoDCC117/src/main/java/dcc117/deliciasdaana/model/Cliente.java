/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.model;

import java.util.*;

/**
 *
 * @author joaop
 */
public class Cliente 
{
    private int id;
    private String nome;
    private int telefone;
    private String endereco;
    private List<Encomenda> encomendas;
    
    
    public int getId()
    {
        return this.id;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }
    
    public String getEndereco()
    {
        return this.endereco;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
                            
}
