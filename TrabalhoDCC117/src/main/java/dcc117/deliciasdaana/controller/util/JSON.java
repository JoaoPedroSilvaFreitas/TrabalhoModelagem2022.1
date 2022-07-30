/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller.util;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.*;
import com.google.gson.Gson;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSON 
{
    //Objetos
    public static String clienteToJSON(Cliente cliente)
    {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        return json;
    }
    
    public static Cliente JSONtoCliente(String json)
    {
        Gson gson = new Gson();
        Cliente aluno = gson.fromJson(json, Cliente.class);
        return aluno;
    }

    public static String produtoToJSON(Produto produto)
    {
        Gson gson = new Gson();
        String json = gson.toJson(produto);
        return json;
    }
    
    public static Produto JSONtoProduto(String json)
    {
        Gson gson = new Gson();
        Produto produto = gson.fromJson(json, Produto.class);
        return produto;
    }
    
    public static String encomendaToJSON(Encomenda encomenda)
    {
        Gson gson = new Gson();
        String json = gson.toJson(encomenda);
        return json;
    }
    
    public static Encomenda JSONtoEncomenda(String json)
    {
        Gson gson = new Gson();
        Encomenda encomenda = gson.fromJson(json, Encomenda.class);
        return encomenda;
    }
    
    
    public static String doceToJSON(Doce doce)
    {
        Gson gson = new Gson();
        String json = gson.toJson(doce);
        return json;
    }
    
    public static Doce JSONtoDoce(String json)
    {
        Gson gson = new Gson();
        Doce doce = gson.fromJson(json, Doce.class);
        return doce;
    }
    
    public static String boloToJSON(Bolo bolo)
    {
        Gson gson = new Gson();
        String json = gson.toJson(bolo);
        return json;
    }
    
    public static Bolo JSONtoBolo(String json)
    {
        Gson gson = new Gson();
        Bolo bolo = gson.fromJson(json, Bolo.class);
        return bolo;
    }
    
    
    //Listas
    public static String clientesToJSON(List<Cliente> clientes)
    {
        Gson gson = new Gson();
        String json = gson.toJson(clientes);
        return json;
    }
    
    public static String produtosToJSON(List<Produto> produtos)
    {
        Gson gson = new Gson();
        String json = gson.toJson(produtos);
        return json;
    }
    
    public static String encomendasToJSON(List<Encomenda> encomendas)
    {
        Gson gson = new Gson();
        String json = gson.toJson(encomendas);
        return json;
    }
    
    public static String bolosToJSON(List<Bolo> bolos)
    {
        Gson gson = new Gson();
        String json = gson.toJson(bolos);
        return json;
    }
    
    public static String docesToJSON(List<Doce> doces)
    {
        Gson gson = new Gson();
        String json = gson.toJson(doces);
        return json;
    }

    public static List<Cliente> toClientes(String json)
    {
        Gson gson = new Gson();
        Type clientesTipo = new TypeToken<ArrayList<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(json, clientesTipo);
        return clientes;
    }
    
    public static List<Produto> toProdutos(String json)
    {
        Gson gson = new Gson();
        Type produtosTipo = new TypeToken<ArrayList<Produto>>(){}.getType();
        List<Produto> produtos = gson.fromJson(json, produtosTipo);
        return produtos;
    }
    
    public static List<Encomenda> toEncomendas(String json)
    {
        Gson gson = new Gson();
        Type encomendasTipo = new TypeToken<ArrayList<Encomenda>>(){}.getType();
        List<Encomenda> encomendas = gson.fromJson(json, encomendasTipo);
        return encomendas;
    }
    
    public static List<Doce> toDoces(String json)
    {
        Gson gson = new Gson();
        Type docesTipo = new TypeToken<ArrayList<Doce>>(){}.getType();
        List<Doce> doces = gson.fromJson(json, docesTipo);
        return doces;
    }
    
    public static List<Bolo> toBolos(String json)
    {
        Gson gson = new Gson();
        Type bolosTipo = new TypeToken<ArrayList<Bolo>>(){}.getType();
        List<Bolo> bolos = gson.fromJson(json, bolosTipo);
        return bolos;
    }
}
