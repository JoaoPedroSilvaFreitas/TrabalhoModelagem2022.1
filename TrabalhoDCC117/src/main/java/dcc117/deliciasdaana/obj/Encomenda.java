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
public class Encomenda 
{
    private int id;
    private Cliente cliente;
    private Data dataDoPedido;
    private Data dataDeEntrega;
    private double valorTotal;
    private String info;
    private List<Produto> produtos;
    
    public int getId()
    {
        return this.id;
    }
    
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    public Data getDataDoPedido()
    {
        return this.dataDoPedido;
    }
    
    public Data getDataDeEntrega()
    {
        return this.dataDeEntrega;
    }
    
    public double getValorTotal()
    {
        return this.valorTotal;
    }
    
    public String getInfo()
    {
        return this.info;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public void setDataDoPedido(Data dataDoPedido)
    {
        this.dataDoPedido = dataDoPedido;
    }
    
    public void setDataDeEntrega(Data dataDeEntrega)
    {
        this.dataDeEntrega = dataDeEntrega;
    }
    
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }
    
    public void setInfo(String info)
    {
        this.info = info;
    }
}
