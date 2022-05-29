/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.obj;

/**
 *
 * @author joaop
 */
public abstract class Produto 
{
    public double valor;
    public int quantidade;
    
    public double getValor()
    {
        return this.valor;
    }
    
    public int getQuantidade()
    {
        return this.quantidade;
    }
    
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    
}
