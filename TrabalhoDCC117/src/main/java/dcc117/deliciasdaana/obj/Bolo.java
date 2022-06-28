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
public class Bolo extends Produto
{
    private String saborMassa;
    private String saborRecheio;
    private String tamanho;
    private float valor;
    private List<Ingrediente> ingredientes;
   
    public void setSaborMassa(String saborMassa)
    {
        this.saborMassa = saborMassa;
    }
    
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }
    
    public void setSaborRecheio(String saborRecheio)
    {
        this.saborRecheio = saborRecheio;
    }
    
    public String getSaborMassa()
    {
        return this.saborMassa;
    }
    
    public String getSaborRecheio()
    {
        return this.saborRecheio;
    }
    
    public String getTamanho()
    {
        return this.tamanho;
    }

}
