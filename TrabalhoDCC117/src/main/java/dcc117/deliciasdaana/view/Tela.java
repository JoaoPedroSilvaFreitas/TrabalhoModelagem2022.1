/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.view;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.*;
import javax.swing.*;
import java.awt.*;
import dcc117.deliciasdaana.controller.*;
import dcc117.deliciasdaana.controller.util.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Tela extends JFrame
{
    private Usuario usuario;
    private JPasswordField senha;
    
    private JPanel painelPrincipal;
    private JPanel painelLogin;
    private JPanel painelUsuario;
    private JPanel painelRegistraEncomenda;
    private JPanel painelRegistraCliente;
    
    private JPanel painelRegistraProduto;
    
    private JPanel painelRegistraIngrediente;
    private JPanel painelConsultaGastoLucro;
    private JPanel painelRelatorio;
    private JPanel painelCalendario;
    
    private JTextField cadastrarNomeCliente;
    private JTextField cadastrarTelefoneCliente;
    private JTextField cadastrarEnderecoCliente;
    
    private JTextField cadastrarNomeIngrediente;
    private JTextField cadastrarValorIngrediente;
    private JTextField cadastrarQuantidadeIngrediente;
    
    private JTextField cadastrarDataPedidoDia;
    private JTextField cadastrarDataPedidoMes;
    private JTextField cadastrarDataPedidoAno;
    
    private JTextField cadastrarDataEntregaDia;
    private JTextField cadastrarDataEntregaMes;
    private JTextField cadastrarDataEntregaAno;
    
    private JTextField cadastrarEncomendaInfo;
    
    private JTextField cadastrarBoloTamanho;
    private JTextField cadastrarBoloSaborMassa;
    private JTextField cadastrarBoloSaborRecheio;
    private JTextField cadastrarBoloInfo;
    private JTextField cadastrarBoloValor;
    private JTextField cadastrarBoloCusto;
    private JTextField cadastrarDoceSabor;
    private JTextField cadastrarDoceInfo;
    private JTextField cadastrarDoceValor;
    private JTextField cadastrarDoceCusto;
    
    private JLabel nomeCliente;
    private JLabel telefoneCliente;
    private JLabel enderecoCliente;
    private JLabel dataDiaEntrega;
    private JLabel dataMesEntrega;
    private JLabel dataAnoEntrega;
    private JLabel dataDiaPedido;
    private JLabel dataMesPedido;
    private JLabel dataAnoPedido;
    private JLabel encomendaInfo;
    private JLabel encomendaValor;
    private JLabel encomendaGasto;
    
    private JLabel calendarioMes;
    private JLabel calendarioAno;
    //private ArrayList<JLabel> dias; //Poderia ter feito com array de JLabels
    private JLabel dia1;
    private JLabel dia2;
    private JLabel dia3;
    private JLabel dia4;
    private JLabel dia5;
    private JLabel dia6;
    private JLabel dia7;
    private JLabel dia8;
    private JLabel dia9;
    private JLabel dia10;
    private JLabel dia11;
    private JLabel dia12;
    private JLabel dia13;
    private JLabel dia14;
    private JLabel dia15;
    private JLabel dia16;
    private JLabel dia17;
    private JLabel dia18;
    private JLabel dia19;
    private JLabel dia20;
    private JLabel dia21;
    private JLabel dia22;
    private JLabel dia23;
    private JLabel dia24;
    private JLabel dia25;
    private JLabel dia26;
    private JLabel dia27;
    private JLabel dia28;
    private JLabel dia29;
    private JLabel dia30;
    private JLabel dia31;
    
    private boolean atualizaClientes;
    private boolean atualizaEncomendas;
    
    private JLabel consultaValor;
    private JLabel consultaGasto;
    
    private JList<Cliente> clientes;
    private JList<Ingrediente> ingredientes;
    private JList<Encomenda> encomendas;
    private JList<Produto> produtos;
    
    private final ImageIcon imagemLogo = new ImageIcon("images/logo.jpg");
    private final ImageIcon imagemSetaLogin = new ImageIcon("images/seta.jpg");
    private final ImageIcon imagemSetaSair = new ImageIcon("images/sair.jpg");
    private final ImageIcon imagemRegistraEncomenda = new ImageIcon("images/botaoEncomenda.jpg");
    private final ImageIcon imagemRegistraCliente = new ImageIcon("images/botaoCliente.jpg");
    private final ImageIcon imagemRegistraProduto = new ImageIcon("images/botaoProduto.jpg");
    private final ImageIcon imagemGastoLucro = new ImageIcon("images/botaoGastoLucro.jpg");
    private final ImageIcon imagemCalendario = new ImageIcon("images/botaoCalendario.jpg");
    private final ImageIcon imagemRelatorio = new ImageIcon("images/botaoRelatorio.jpg");
    private final ImageIcon imagemRegistra = new ImageIcon("images/botaoRegistrar.jpg");
    
 
    public void atualizaClientes()
    {
        try 
        {
            String clientes = Arquivo.lerArquivo("dadosClientes.json");
            List<Cliente> Clientes = JSON.toClientes(clientes);
            
            
            for (Cliente cliente : Clientes) 
            {
                getUsuario().addCliente(cliente);
            }

        }catch (FileNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(this, "ERRO: Não foi possível carregar os dados");
            }
    }
    
    public void atualizaEncomendas()
    {
        try 
        {
            String encomendas = Arquivo.lerArquivo("dadosEncomendas.json");
            List<Encomenda> Encomendas = JSON.toEncomendas(encomendas);
            
            
            for (Encomenda encomenda : Encomendas) 
            {
                getUsuario().addEncomenda(encomenda);
            }
            
            repaint();
            
            
            
        }catch (FileNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(this, "ERRO: Não foi possível carregar os dados");
            }
    }
    
    Tela()
    {
        this.usuario = new Usuario();
        
        DefaultListModel<Cliente> modelClientes = new DefaultListModel<>();
        clientes = new JList<>(modelClientes);
        
        DefaultListModel<Ingrediente> modelIngrediente = new DefaultListModel<>();
        ingredientes = new JList<>(modelIngrediente);
        
        
        DefaultListModel<Encomenda> modelEncomenda = new DefaultListModel<>();
        encomendas = new JList<>(modelEncomenda);
        
        atualizaClientes = true;
        
        this.addWindowListener(new atualizaDados(this));
    }
    
    public void telaPrincipal()
    {
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        
        telaLogin();
        
        this.add(this.painelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.repaint();
    }
    
    private void telaLogin()
    {
        JLabel null0 = new JLabel();
        JLabel null1 = new JLabel();
        JLabel null2 = new JLabel();
        JLabel null3 = new JLabel();
        JLabel null4 = new JLabel();
        JLabel null5 = new JLabel();
        JLabel null6 = new JLabel();
        
        
        
        this.painelLogin = new JPanel();
        this.painelLogin.setBackground(new Color(239,186,237));
        this.painelLogin.setLayout(new GridLayout(0, 3));
        this.painelLogin.setPreferredSize(new Dimension(1280, 720));
        
        
        JLabel logo = new JLabel(imagemLogo);
        
        
        this.painelLogin.add(null0);
        this.painelLogin.add(logo);
        this.painelLogin.add(null1);

        
        senha = new JPasswordField(100);
        senha.setFont(new Font("Arial", Font.PLAIN, 95));   
        this.painelLogin.add(null2);
        this.painelLogin.add(senha);
        this.painelLogin.add(null3);
        
        this.painelLogin.add(null4);
        
        JButton loginBtn = new JButton();
        loginBtn.setFont(new Font("Arial", Font.PLAIN, 70));
        loginBtn.setBorderPainted(false);
        loginBtn.setIcon(imagemSetaLogin);
        loginBtn.setBackground(new Color(239,186,237));
        
        loginBtn.addActionListener(new Login(this));
        this.painelLogin.add(loginBtn);
        this.painelLogin.add(null5);
        this.painelLogin.add(null6);
        
        this.painelPrincipal.add(painelLogin, BorderLayout.CENTER);
    }
    
    public void telaUsuario(Usuario usuario)
    {
        this.usuario = usuario;
        
        painelPrincipal.setVisible(false);
        this.setVisible(true);
        
        this.painelUsuario = new JPanel();
        this.painelUsuario.setLayout(new BorderLayout());
        this.painelUsuario.setBackground(new Color(239,186,237));
        
        telaUsuarioAux();
        
        this.add(this.painelUsuario);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaUsuarioAux()
    {
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,1));
        this.painelUsuario.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        
        JButton registrarClienteBtn;
        registrarClienteBtn = new JButton();
        registrarClienteBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarClienteBtn.setBackground(new Color(239,186,237));
        registrarClienteBtn.setBorderPainted(false);
        registrarClienteBtn.setIcon(imagemRegistraCliente);
        registrarClienteBtn.addActionListener(new registrarCliente(this));
        painelFuncoes.add(registrarClienteBtn);
        
        JButton registrarEncomendaBtn;
        registrarEncomendaBtn = new JButton();
        registrarEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarEncomendaBtn.setBackground(new Color(239,186,237));
        registrarEncomendaBtn.setBorderPainted(false);
        registrarEncomendaBtn.setIcon(imagemRegistraEncomenda);
        registrarEncomendaBtn.addActionListener(new registrarEncomenda(this));
        painelFuncoes.add(registrarEncomendaBtn);
        
        JButton registrarProdutoBtn;
        registrarProdutoBtn = new JButton("", imagemRegistraProduto);
        registrarProdutoBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarProdutoBtn.setBackground(new Color(239,186,237));
        registrarProdutoBtn.setBorderPainted(false);
        registrarProdutoBtn.addActionListener(new registrarProduto(this));
        painelFuncoes.add(registrarProdutoBtn);
        
        
        JButton consultarGastoLucroBtn;
        consultarGastoLucroBtn = new JButton();
        consultarGastoLucroBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        consultarGastoLucroBtn.setBackground(new Color(239,186,237));
        consultarGastoLucroBtn.setBorderPainted(false);
        consultarGastoLucroBtn.setIcon(imagemGastoLucro);
        consultarGastoLucroBtn.addActionListener(new consultarGastoLucro(this, 0));
        painelFuncoes.add(consultarGastoLucroBtn);
        
        JButton relatorioEncomendaBtn;
        relatorioEncomendaBtn = new JButton();
        relatorioEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        relatorioEncomendaBtn.setBackground(new Color(239,186,237));
        relatorioEncomendaBtn.setBorderPainted(false);
        relatorioEncomendaBtn.setIcon(imagemRelatorio);
        relatorioEncomendaBtn.addActionListener(new relatorio(this));
        painelFuncoes.add(relatorioEncomendaBtn);
        
        JButton calendarioBtn;
        calendarioBtn = new JButton();
        calendarioBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        calendarioBtn.setBackground(new Color(239,186,237));
        calendarioBtn.setBorderPainted(false);
        calendarioBtn.setIcon(imagemCalendario);
        calendarioBtn.addActionListener(new calendario(this));
        painelFuncoes.add(calendarioBtn);
        
        
        this.painelUsuario.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    
    public void telaRegistraProduto()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelRegistraProduto = new JPanel();
        this.painelRegistraProduto.setLayout(new BorderLayout());
        this.painelRegistraProduto.setBackground(new Color(239,186,237));
        
        telaRegistraProdutoAux();
        
        this.add(this.painelRegistraProduto);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraProdutoAux()
    {
        JLabel null0 = new JLabel();
        JLabel null1 = new JLabel();
        JLabel null2 = new JLabel();
        JLabel null3 = new JLabel();
        JLabel null4 = new JLabel();
        JLabel null5 = new JLabel();
        JLabel null6 = new JLabel();
        JLabel null7 = new JLabel();
        JLabel null8 = new JLabel();
        JLabel null9 = new JLabel();
        JLabel null10 = new JLabel();
        JLabel null11 = new JLabel();
        JLabel null12 = new JLabel();
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,4));
        this.painelRegistraProduto.add(sairBtn,BorderLayout.WEST);
        
        /*
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemRegistra);
        //cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        //cadastrarBtn.addActionListener(new cadastrar(this,2));
        this.painelRegistraProduto.add(cadastrarBtn,BorderLayout.EAST);
        
        */
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        
        JPanel painelBolo;
        painelBolo = new JPanel();
        painelBolo.setBackground(new Color(239,186,237));
        painelBolo.setLayout(new GridLayout(0,3));
        
        JLabel tamanho = new JLabel("Tamanho:", SwingConstants.CENTER);
        tamanho.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(tamanho);
        cadastrarBoloTamanho = new JTextField(50);
        cadastrarBoloTamanho.setFont(new Font("Arial", Font.PLAIN, 25));
        painelBolo.add(cadastrarBoloTamanho);
        painelBolo.add(null0);
        
        JLabel massa = new JLabel("Massa:", SwingConstants.CENTER);
        massa.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(massa);
        cadastrarBoloSaborMassa = new JTextField(50);
        cadastrarBoloSaborMassa.setFont(new Font("Arial", Font.PLAIN, 25));;
        painelBolo.add(cadastrarBoloSaborMassa);
        painelBolo.add(null1);
        
        JLabel recheio = new JLabel("Recheio:", SwingConstants.CENTER);
        recheio.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(recheio);
        cadastrarBoloSaborRecheio = new JTextField(50);
        cadastrarBoloSaborRecheio.setFont(new Font("Arial", Font.PLAIN, 25));
        painelBolo.add(cadastrarBoloSaborRecheio);
        painelBolo.add(null2);
        
        JLabel infoBolo = new JLabel("Info:", SwingConstants.CENTER);
        infoBolo.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(infoBolo);
        cadastrarBoloInfo = new JTextField(200);
        cadastrarBoloInfo.setFont(new Font("Arial", Font.PLAIN, 25));
        painelBolo.add(cadastrarBoloInfo);
        painelBolo.add(null3);
        
        JLabel valorBolo = new JLabel("Valor:", SwingConstants.CENTER);
        infoBolo.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(valorBolo);
        cadastrarBoloValor = new JTextField(200);
        cadastrarBoloValor.setFont(new Font("Arial", Font.PLAIN, 25));
        painelBolo.add(cadastrarBoloValor);
        painelBolo.add(null4);
        
        JLabel custoBolo = new JLabel("Custo:", SwingConstants.CENTER);
        infoBolo.setFont(new Font("Arial", Font.PLAIN, 20));
        painelBolo.add(custoBolo);
        cadastrarBoloCusto = new JTextField(200);
        cadastrarBoloCusto.setFont(new Font("Arial", Font.PLAIN, 25));
        painelBolo.add(cadastrarBoloCusto);
        painelBolo.add(null5);
        painelBolo.add(null6);
        
        JButton addBoloBtn;
        addBoloBtn = new JButton("Adicionar bolo");
        addBoloBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        addBoloBtn.setBackground(new Color(106,64,24));
        addBoloBtn.setBorderPainted(false);
        addBoloBtn.addActionListener(new addProduto(this,2));
        
        painelBolo.add(addBoloBtn);
        
        JPanel painelDoce;
        painelDoce = new JPanel();
        painelDoce.setBackground(new Color(239,186,237));
        painelDoce.setLayout(new GridLayout(0,3));
        
        JLabel sabor = new JLabel("Sabor:", SwingConstants.CENTER);
        sabor.setFont(new Font("Arial", Font.PLAIN, 20));
        cadastrarDoceSabor = new JTextField(50);
        cadastrarDoceSabor.setFont(new Font("Arial", Font.PLAIN, 25));
        painelDoce.add(sabor);
        painelDoce.add(cadastrarDoceSabor);
        painelDoce.add(null7);
        
        JLabel infoDoce = new JLabel("Info:", SwingConstants.CENTER);
        infoDoce.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDoce.add(infoDoce);
        cadastrarDoceInfo = new JTextField(200);
        cadastrarDoceInfo.setFont(new Font("Arial", Font.PLAIN, 25));
        painelDoce.add(cadastrarDoceInfo);
        painelDoce.add(null8);
        
        JLabel valorDoce = new JLabel("Valor:", SwingConstants.CENTER);
        infoBolo.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDoce.add(valorDoce);
        cadastrarDoceValor = new JTextField(200);
        cadastrarDoceValor.setFont(new Font("Arial", Font.PLAIN, 25));
        painelDoce.add(cadastrarDoceValor);
        painelDoce.add(null9);
        
        JLabel custoDoce = new JLabel("Custo:", SwingConstants.CENTER);
        infoBolo.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDoce.add(custoDoce);
        cadastrarDoceCusto = new JTextField(200);
        cadastrarDoceCusto.setFont(new Font("Arial", Font.PLAIN, 25));
        painelDoce.add(cadastrarDoceCusto);
        painelDoce.add(null10);
        painelDoce.add(null11);
        
        
        JButton addDoceBtn;
        addDoceBtn = new JButton("Adicionar Doce");
        addDoceBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        addDoceBtn.setBackground(new Color(106,64,24));
        addDoceBtn.setBorderPainted(false);
        addDoceBtn.addActionListener(new addProduto(this,1));
        
        painelDoce.add(addDoceBtn);
        
        
        painelFuncoes.add(painelBolo,BorderLayout.NORTH);
        painelFuncoes.add(painelDoce,BorderLayout.SOUTH);
        
        this.painelRegistraProduto.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaRegistraEncomenda()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelRegistraEncomenda = new JPanel();
        this.painelRegistraEncomenda.setLayout(new BorderLayout());
        this.painelRegistraEncomenda.setBackground(new Color(239,186,237));
        
        //att();
        
        telaRegistraEncomendaAux();
        
        this.add(this.painelRegistraEncomenda);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraEncomendaAux()
    {
        if(atualizaClientes == true)
        {
            atualizaClientes();
            atualizaClientes = false;
        }
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,3));
        this.painelRegistraEncomenda.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemRegistra);
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,2));
        this.painelRegistraEncomenda.add(cadastrarBtn,BorderLayout.EAST);
        
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        
        JPanel painelFuncoesEntrega;
        painelFuncoesEntrega = new JPanel();
        painelFuncoesEntrega.setBackground(new Color(239,186,237));
        painelFuncoesEntrega.setLayout(new GridLayout(0,2));
        
        JPanel painelDataPedido;
        painelDataPedido = new JPanel();
        painelDataPedido.setBackground(new Color(239,186,237));
        painelDataPedido.setLayout(new GridLayout(0,4));
        
        JLabel DataPedido = new JLabel("Pedido:", SwingConstants.CENTER);
        DataPedido.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDataPedido.add(DataPedido);
        cadastrarDataPedidoDia = new JTextField(2);
        cadastrarDataPedidoDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoDia);
        
        cadastrarDataPedidoMes = new JTextField(2);
        cadastrarDataPedidoMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoMes);
        
        cadastrarDataPedidoAno = new JTextField(4);
        cadastrarDataPedidoAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoAno);
        
        
        
        clientes = new JList(usuario.getClientes().toArray());
        clientes.setVisible(true);
        clientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        produtos = new JList(usuario.getProdutos().toArray());
        produtos.setVisible(true);
        produtos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        JPanel painelDataEntrega;
        painelDataEntrega = new JPanel();
        painelDataEntrega.setBackground(new Color(239,186,237));
        painelDataEntrega.setLayout(new GridLayout(0,4));
             
        JLabel DataEntrega = new JLabel("Entrega:", SwingConstants.CENTER);
        DataEntrega.setFont(new Font("Arial", Font.PLAIN, 19));
        painelDataEntrega.add(DataEntrega);
        cadastrarDataEntregaDia = new JTextField(2);
        cadastrarDataEntregaDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaDia);
        
        cadastrarDataEntregaMes = new JTextField(2);
        cadastrarDataEntregaMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaMes);
        
        cadastrarDataEntregaAno = new JTextField(4);
        cadastrarDataEntregaAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaAno);
        
        painelFuncoesEntrega.add(painelDataEntrega);
        painelFuncoesEntrega.add(painelDataPedido);
        
        JLabel info = new JLabel("Info:", SwingConstants.CENTER);
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        cadastrarEncomendaInfo = new JTextField(200);
        cadastrarEncomendaInfo.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoesEntrega.add(info);
        painelFuncoesEntrega.add(cadastrarEncomendaInfo);
        
        
        painelFuncoes.add(new JScrollPane(clientes),BorderLayout.CENTER);
        painelFuncoes.add(new JScrollPane(produtos),BorderLayout.SOUTH);
        
        painelFuncoes.add(painelFuncoesEntrega,BorderLayout.NORTH);
        this.painelRegistraEncomenda.add(painelFuncoes,BorderLayout.CENTER);
        
    }
    
    public void telaRegistraCliente()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelRegistraCliente = new JPanel();
        this.painelRegistraCliente.setLayout(new BorderLayout());
        this.painelRegistraCliente.setBackground(new Color(239,186,237));
        
        telaRegistraClienteAux();
        
        this.add(this.painelRegistraCliente);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraClienteAux()
    {
        JLabel null0 = new JLabel();
        JLabel null1 = new JLabel();
        JLabel null2 = new JLabel();
        JLabel null3 = new JLabel();
        JLabel null4 = new JLabel();
        JLabel null5 = new JLabel();
        JLabel null6 = new JLabel();
        JLabel null7 = new JLabel();
        JLabel null8 = new JLabel();
        JLabel null9 = new JLabel();
        JLabel null10 = new JLabel();
        JLabel null11 = new JLabel();
        JLabel null12 = new JLabel();
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,2));
        this.painelRegistraCliente.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemRegistra);
        cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,1));
        this.painelRegistraCliente.add(cadastrarBtn,BorderLayout.EAST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        
        painelFuncoes.add(null3);
        painelFuncoes.add(null4);
        painelFuncoes.add(null5);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Nome);
        cadastrarNomeCliente = new JTextField(100);
        cadastrarNomeCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarNomeCliente);
        painelFuncoes.add(null0);
        
        painelFuncoes.add(null6);
        painelFuncoes.add(null7);
        painelFuncoes.add(null8);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Telefone);
        cadastrarTelefoneCliente = new JTextField(100);
        cadastrarTelefoneCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarTelefoneCliente);
        painelFuncoes.add(null1);
        
        painelFuncoes.add(null9);
        painelFuncoes.add(null10);
        painelFuncoes.add(null11);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Endereco);
        cadastrarEnderecoCliente = new JTextField(100);
        cadastrarEnderecoCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarEnderecoCliente);
        painelFuncoes.add(null2);
        
        painelFuncoes.add(null12);
        
        this.painelRegistraCliente.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaConsultaGastoLucro()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelConsultaGastoLucro = new JPanel();
        this.painelConsultaGastoLucro.setLayout(new BorderLayout());
        this.painelConsultaGastoLucro.setBackground(new Color(239,186,237));
        
        telaConsultaGastoLucroAux();
        
        this.add(this.painelConsultaGastoLucro);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaConsultaGastoLucroAux()
    {
        if(atualizaEncomendas == true)
        {
            atualizaEncomendas();
            atualizaEncomendas = false;
        }
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,5));
        this.painelConsultaGastoLucro.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        
        
        JPanel painelDatas;
        painelDatas = new JPanel();
        painelDatas.setBackground(new Color(239,186,237));
        painelDatas.setLayout(new GridLayout(0,2));
        
        JPanel painelDataInicio;
        painelDataInicio = new JPanel();
        painelDataInicio.setBackground(new Color(239,186,237));
        painelDataInicio.setLayout(new GridLayout(0,4));
        
        JLabel DataInicio = new JLabel("De:", SwingConstants.CENTER);
        DataInicio.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDataInicio.add(DataInicio);
        cadastrarDataPedidoDia = new JTextField(2);
        cadastrarDataPedidoDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataInicio.add(cadastrarDataPedidoDia);
        
        cadastrarDataPedidoMes = new JTextField(2);
        cadastrarDataPedidoMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataInicio.add(cadastrarDataPedidoMes);
        
        cadastrarDataPedidoAno = new JTextField(4);
        cadastrarDataPedidoAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataInicio.add(cadastrarDataPedidoAno);
        
        JPanel painelDataFim;
        painelDataFim = new JPanel();
        painelDataFim.setBackground(new Color(239,186,237));
        painelDataFim.setLayout(new GridLayout(0,4));
        
        JLabel DataFim = new JLabel("até:", SwingConstants.CENTER);
        DataFim.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDataFim.add(DataFim);
        cadastrarDataEntregaDia = new JTextField(2);
        cadastrarDataEntregaDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataFim.add(cadastrarDataEntregaDia);
        
        cadastrarDataEntregaMes = new JTextField(2);
        cadastrarDataEntregaMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataFim.add(cadastrarDataEntregaMes);
        
        cadastrarDataEntregaAno = new JTextField(4);
        cadastrarDataEntregaAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataFim.add(cadastrarDataEntregaAno);
        
        painelDatas.add(painelDataInicio);
        painelDatas.add(painelDataFim);
        
        JPanel painelInfo;
        painelInfo = new JPanel();
        painelInfo.setBackground(new Color(239,186,237));
        painelInfo.setLayout(new GridLayout(0,2));
        
        JLabel valorConsultar = new JLabel("Lucro:", SwingConstants.CENTER);
        valorConsultar.setFont(new Font("Arial", Font.PLAIN, 50));
        consultaValor = new JLabel();
        consultaValor.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(valorConsultar);
        painelInfo.add(consultaValor);
        
        JLabel gastoConsultar = new JLabel("Gasto:", SwingConstants.CENTER);
        gastoConsultar.setFont(new Font("Arial", Font.PLAIN, 50));
        consultaGasto = new JLabel();
        consultaGasto.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(gastoConsultar);
        painelInfo.add(consultaGasto);
        
        JButton consultarBtn;
        consultarBtn = new JButton("",imagemGastoLucro);
        consultarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        consultarBtn.setBackground(new Color(239,186,237));
        consultarBtn.setBorderPainted(false);
        consultarBtn.addActionListener(new consultarGastoLucro(this, 1));
        painelFuncoes.add(consultarBtn,BorderLayout.SOUTH);
        
        
        painelFuncoes.add(painelInfo,BorderLayout.CENTER);
        painelFuncoes.add(painelDatas,BorderLayout.NORTH);
        this.painelConsultaGastoLucro.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaRelatorio()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelRelatorio = new JPanel();
        this.painelRelatorio.setLayout(new BorderLayout());
        this.painelRelatorio.setBackground(new Color(239,186,237));
        
        telaRelatorioAux();
        
        this.add(this.painelRelatorio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRelatorioAux()
    {
        if(atualizaEncomendas == true)
        {
            atualizaEncomendas();
            atualizaEncomendas = false;
        }
        
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,6));
        this.painelRelatorio.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        
        encomendas = new JList(usuario.getEncomendas().toArray());
        encomendas.setVisible(true);
        encomendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        encomendas.addListSelectionListener(new relatorioInfo(this));
        painelFuncoes.add(new JScrollPane(encomendas),BorderLayout.EAST);
        
        JPanel painelInfo;
        painelInfo = new JPanel();
        painelInfo.setBackground(new Color(239,186,237));
        painelInfo.setLayout(new GridLayout(0,2));
        
        JLabel clienteNome = new JLabel("Nome:", SwingConstants.CENTER);
        clienteNome.setFont(new Font("Arial", Font.PLAIN, 50));
        nomeCliente = new JLabel();
        nomeCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(clienteNome);
        painelInfo.add(nomeCliente);
        
        JLabel clienteTelefone = new JLabel("Telefone:", SwingConstants.CENTER);
        clienteTelefone.setFont(new Font("Arial", Font.PLAIN, 50));
        telefoneCliente = new JLabel();
        telefoneCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(clienteTelefone);
        painelInfo.add(telefoneCliente);
        
        JLabel clienteEndereco = new JLabel("Endereco:", SwingConstants.CENTER);
        clienteEndereco.setFont(new Font("Arial", Font.PLAIN, 50));
        enderecoCliente = new JLabel();
        enderecoCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(clienteEndereco);
        painelInfo.add(enderecoCliente);
        
        JLabel dataPedido = new JLabel("Pedido:", SwingConstants.CENTER);
        dataPedido.setFont(new Font("Arial", Font.PLAIN, 50));
        
        JPanel painelDataPedido;
        painelDataPedido = new JPanel();
        painelDataPedido.setBackground(new Color(239,186,237));
        painelDataPedido.setLayout(new GridLayout(0,3));
        
        dataDiaPedido = new JLabel();
        dataDiaPedido.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(dataDiaPedido);
        dataMesPedido = new JLabel();
        dataMesPedido.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(dataMesPedido);
        dataAnoPedido = new JLabel();
        dataAnoPedido.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(dataAnoPedido);
        
        painelInfo.add(dataPedido);
        painelInfo.add(painelDataPedido);
        
        JLabel dataEntrega = new JLabel("Entrega:", SwingConstants.CENTER);
        dataEntrega.setFont(new Font("Arial", Font.PLAIN, 50));
        
        JPanel painelDataEntrega;
        painelDataEntrega = new JPanel();
        painelDataEntrega.setBackground(new Color(239,186,237));
        painelDataEntrega.setLayout(new GridLayout(0,3));
        
        dataDiaEntrega = new JLabel();
        dataDiaEntrega.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(dataDiaEntrega);
        dataMesEntrega = new JLabel();
        dataMesEntrega.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(dataMesEntrega);
        dataAnoEntrega = new JLabel();
        dataAnoEntrega.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(dataAnoEntrega);
        
        painelInfo.add(dataEntrega);
        painelInfo.add(painelDataEntrega);
        
        JLabel infoEncomenda = new JLabel("info:", SwingConstants.CENTER);
        infoEncomenda.setFont(new Font("Arial", Font.PLAIN, 50));
        encomendaInfo = new JLabel();
        encomendaInfo.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(infoEncomenda);
        painelInfo.add(encomendaInfo);
        
        JLabel valorEncomenda = new JLabel("Valor:", SwingConstants.CENTER);
        valorEncomenda.setFont(new Font("Arial", Font.PLAIN, 50));
        encomendaValor = new JLabel();
        encomendaValor.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(valorEncomenda);
        painelInfo.add(encomendaValor);
        
        JLabel gastoEncomenda = new JLabel("Gasto:", SwingConstants.CENTER);
        gastoEncomenda.setFont(new Font("Arial", Font.PLAIN, 50));
        encomendaGasto = new JLabel();
        encomendaGasto.setFont(new Font("Arial", Font.PLAIN, 50));
        painelInfo.add(gastoEncomenda);
        painelInfo.add(encomendaGasto);
        
        painelFuncoes.add(painelInfo,BorderLayout.CENTER);
        
        this.painelRelatorio.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaCalendario()
    {
        visibilidadeTelaUsuario();
        this.setVisible(true);
        
        this.painelCalendario = new JPanel();
        this.painelCalendario.setLayout(new BorderLayout());
        this.painelCalendario.setBackground(new Color(239,186,237));
        
        telaCalendarioAux();
        
        this.add(this.painelCalendario);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaCalendarioAux()
    {
        if(atualizaEncomendas == true)
        {
            atualizaEncomendas();
            atualizaEncomendas = false;
        }
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,7));
        this.painelCalendario.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        
        JPanel painelMeses;
        painelMeses = new JPanel();
        painelMeses.setBackground(new Color(239,186,237));
        painelMeses.setLayout(new GridLayout(0,4));
        
        JButton antMesBtn;
        antMesBtn = new JButton("<=");
        antMesBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        antMesBtn.setBackground(new Color(239,186,237));
        antMesBtn.setBorderPainted(false);
        antMesBtn.addActionListener(new alterarMes(this, 0));
        painelMeses.add(antMesBtn);
        
        calendarioMes = new JLabel("1");
        calendarioMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelMeses.add(calendarioMes);
        
        calendarioAno = new JLabel("2022");
        calendarioAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelMeses.add(calendarioAno);
        
        JButton proxMesBtn;
        proxMesBtn = new JButton("=>");
        proxMesBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        proxMesBtn.setBackground(new Color(239,186,237));
        proxMesBtn.setBorderPainted(false);
        proxMesBtn.addActionListener(new  alterarMes(this, 1));
        painelMeses.add(proxMesBtn);
        
        JPanel painelDias;
        painelDias = new JPanel();
        painelDias.setBackground(new Color(239,186,237));
        painelDias.setLayout(new GridLayout(0,6));
             
        dia1 = new JLabel("1");
        dia1.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia1);
        
        dia2 = new JLabel("2");
        dia2.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia2);
        
        dia3 = new JLabel("3");
        dia3.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia3);
        
        dia4 = new JLabel("4");
        dia4.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia4);
        
        dia5 = new JLabel("5");
        dia5.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia5);
        
        dia6 = new JLabel("6");
        dia6.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia6);
        
        dia7 = new JLabel("7");
        dia7.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia7);
        
        dia8 = new JLabel("8");
        dia8.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia8);
        
        dia9 = new JLabel("9");
        dia9.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia9);
        
        dia10 = new JLabel("10");
        dia10.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia10);
        
        dia11 = new JLabel("11");
        dia11.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia11);
        
        dia12 = new JLabel("12");
        dia12.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia12);
        
        dia13 = new JLabel("13");
        dia13.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia13);
        
        dia14 = new JLabel("14");
        dia14.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia14);
        
        dia15 = new JLabel("15");
        dia15.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia15);
        
        dia16 = new JLabel("16");
        dia16.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia16);
        
        dia17 = new JLabel("17");
        dia17.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia17);
        
        dia18 = new JLabel("18");
        dia18.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia18);
        
        dia19 = new JLabel("19");
        dia19.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia19);
        
        dia20 = new JLabel("20");
        dia20.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia20);
        
        dia21 = new JLabel("21");
        dia21.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia21);
        
        dia22 = new JLabel("22");
        dia22.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia22);
        
        dia23 = new JLabel("23");
        dia23.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia23);
        
        dia24 = new JLabel("24");
        dia24.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia24);
        
        dia25 = new JLabel("25");
        dia25.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia25);
        
        dia26 = new JLabel("26");
        dia26.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia26);
        
        dia27 = new JLabel("27");
        dia27.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia27);
        
        dia28 = new JLabel("28");
        dia28.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia28);
        
        dia29 = new JLabel("29");
        dia29.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia29);
        
        dia30 = new JLabel("30");
        dia30.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia30);
        
        dia31 = new JLabel("31");
        dia31.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDias.add(dia31);


        for(Encomenda encomenda: getUsuario().getEncomendas())
        {
            if(encomenda.getDataDeEntrega().getAno() == Integer.parseInt(calendarioAno.getText()))
            {
                if(encomenda.getDataDeEntrega().getMes() == Integer.parseInt(calendarioMes.getText()))
                {
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia1.getText()))
                    {
                        //dia1.setText(dia1.getText() + encomenda.getId());
                        dia1.setText("1 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia2.getText()))
                    {
                        //dia2.setText(dia2.getText() + encomenda.getId());
                        dia2.setText("2 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia3.getText()))
                    {
                        //dia3.setText(dia3.getText() + encomenda.getId());
                        dia3.setText("3 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia4.getText()))
                    {
                        //dia4.setText(dia4.getText() + encomenda.getId());
                        dia4.setText("4 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia5.getText()))
                    {
                        //dia5.setText(dia5.getText() + encomenda.getId());
                        dia5.setText("5 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia6.getText()))
                    {
                        //dia6.setText(dia6.getText() + encomenda.getId());
                        dia6.setText("6 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia7.getText()))
                    {
                        //dia7.setText(dia7.getText() + encomenda.getId());
                        dia7.setText("7 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia8.getText()))
                    {
                        //dia8.setText(dia8.getText() + encomenda.getId());
                        dia8.setText("8 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia9.getText()))
                    {
                        //dia9.setText(dia9.getText() + encomenda.getId());
                        dia9.setText("9 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia10.getText()))
                    {
                        //dia10.setText(dia10.getText() + encomenda.getId());
                        dia10.setText("10 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia11.getText()))
                    {
                        //dia11.setText(dia11.getText() + encomenda.getId());
                        dia11.setText("11 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia12.getText()))
                    {
                        //dia12.setText(dia12.getText() + encomenda.getId());
                        dia12.setText("12 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia13.getText()))
                    {
                        //dia13.setText(dia13.getText() + encomenda.getId());
                        dia13.setText("13 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia14.getText()))
                    {
                        //dia14.setText(dia14.getText() + encomenda.getId());
                        dia14.setText("14 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia15.getText()))
                    {
                        //dia15.setText(dia15.getText() + encomenda.getId());
                        dia15.setText("15 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia16.getText()))
                    {
                        //dia16.setText(dia16.getText() + encomenda.getId());
                        dia16.setText("16 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia17.getText()))
                    {
                        //dia17.setText(dia17.getText() + encomenda.getId());
                        dia17.setText("17 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia18.getText()))
                    {
                        //dia18.setText(dia18.getText() + encomenda.getId());
                        dia18.setText("18 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia19.getText()))
                    {
                        //dia19.setText(dia19.getText() + encomenda.getId());
                        dia19.setText("19 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia20.getText()))
                    {
                        //dia20.setText(dia20.getText() + encomenda.getId());
                        dia20.setText("20 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia21.getText()))
                    {
                        //dia21.setText(dia21.getText() + encomenda.getId());
                        dia21.setText("21 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia22.getText()))
                    {
                        //dia22.setText(dia22.getText() + encomenda.getId());
                        dia22.setText("22 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia23.getText()))
                    {
                        //dia23.setText(dia23.getText() + encomenda.getId());
                        dia23.setText("23 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia24.getText()))
                    {
                        //dia24.setText(dia24.getText() + encomenda.getId());
                        dia24.setText("24 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia25.getText()))
                    {
                        //dia25.setText(dia25.getText() + encomenda.getId());
                        dia25.setText("25 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia26.getText()))
                    {
                        //dia26.setText(dia26.getText() + encomenda.getId());
                        dia26.setText("26 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia27.getText()))
                    {
                        //dia27.setText(dia27.getText() + encomenda.getId());
                        dia27.setText("27 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia28.getText()))
                    {
                        //dia28.setText(dia28.getText() + encomenda.getId());
                        dia28.setText("28 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia29.getText()))
                    {
                        //dia29.setText(dia29.getText() + encomenda.getId());
                        dia29.setText("29 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia30.getText()))
                    {
                        //dia30.setText(dia30.getText() + encomenda.getId());
                        dia30.setText("30 X");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(dia31.getText()))
                    {
                        //dia31.setText(dia31.getText() + encomenda.getId());
                        dia31.setText("31 X");
                    }
                }
            }
        }
        
        painelFuncoes.add(painelDias, BorderLayout.CENTER);
        painelFuncoes.add(painelMeses, BorderLayout.NORTH);
        this.painelCalendario.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) 
    {
        Tela tela = new Tela();
        tela.telaPrincipal();
        tela.pack();
    }

    
    //get
    public Usuario getUsuario()
    {
        return this.usuario;
    }
    
    public JPasswordField getSenha()
    {
        return this.senha;
    }
    
    public JTextField getCadastrarNomeCliente() 
    {
        return cadastrarNomeCliente;
    }
    
    public JTextField getCadastrarTelefoneCliente() 
    {
        return cadastrarTelefoneCliente;
    }

    public JTextField getCadastrarEnderecoCliente() 
    {
        return cadastrarEnderecoCliente;
    }
    
    public JTextField getCadastrarNomeIngrediente() 
    {
        return cadastrarNomeIngrediente;
    }
    
    public JTextField getCadastrarQuantidadeIngrediente() 
    {
        return cadastrarQuantidadeIngrediente;
    }
    
    public JTextField getCadastrarValorIngrediente() 
    {
        return cadastrarValorIngrediente;
    }

    public JTextField getCadastrarDataPedidoDia() 
    {
        return cadastrarDataPedidoDia;
    }

    public JTextField getCadastrarDataPedidoMes() 
    {
        return cadastrarDataPedidoMes;
    }

    public JTextField getCadastrarDataPedidoAno() 
    {
        return cadastrarDataPedidoAno;
    }

    public JList<Cliente> getClientes() 
    {
        return clientes;
    }

    public JList<Ingrediente> getIngredientes() 
    {
        return ingredientes;
    }

    public JList<Encomenda> getEncomendas() 
    {
        return encomendas;
    }

    public JTextField getCadastrarDataEntregaDia() 
    {
        return cadastrarDataEntregaDia;
    }

    public JTextField getCadastrarDataEntregaMes() 
    {
        return cadastrarDataEntregaMes;
    }

    public JTextField getCadastrarDataEntregaAno() 
    {
        return cadastrarDataEntregaAno;
    }

    public JTextField getCadastrarBoloTamanho() 
    {
        return cadastrarBoloTamanho;
    }

    public JTextField getCadastrarBoloSaborMassa() 
    {
        return cadastrarBoloSaborMassa;
    }

    public JTextField getCadastrarBoloSaborRecheio() 
    {
        return cadastrarBoloSaborRecheio;
    }

    public JTextField getCadastrarDoceSabor() 
    {
        return cadastrarDoceSabor;
    }

    public JTextField getCadastrarBoloInfo() 
    {
        return cadastrarBoloInfo;
    }

    public JTextField getCadastrarDoceInfo() 
    {
        return cadastrarDoceInfo;
    }

    public JTextField getCadastrarBoloValor() 
    {
        return cadastrarBoloValor;
    }

    public JTextField getCadastrarDoceValor() 
    {
        return cadastrarDoceValor;
    }

    public JTextField getCadastrarBoloCusto() 
    {
        return cadastrarBoloCusto;
    }

    public JTextField getCadastrarDoceCusto() 
    {
        return cadastrarDoceCusto;
    }

    public JTextField getCadastrarEncomendaInfo() 
    {
        return cadastrarEncomendaInfo;
    }

    public JLabel getNomeCliente() 
    {
        return nomeCliente;
    }

    public JLabel getTelefoneCliente() 
    {
        return telefoneCliente;
    }

    public JLabel getEnderecoCliente() 
    {
        return enderecoCliente;
    }

    public JLabel getDataDiaEntrega() 
    {
        return dataDiaEntrega;
    }

    public JLabel getDataMesEntrega() 
    {
        return dataMesEntrega;
    }

    public JLabel getDataAnoEntrega() 
    {
        return dataAnoEntrega;
    }

    public JLabel getDataDiaPedido() 
    {
        return dataDiaPedido;
    }

    public JLabel getDataMesPedido() 
    {
        return dataMesPedido;
    }

    public JLabel getDataAnoPedido() 
    {
        return dataAnoPedido;
    }

    public JLabel getEncomendaInfo() 
    {
        return encomendaInfo;
    }

    public JLabel getEncomendaValor() 
    {
        return encomendaValor;
    }

    public JLabel getEncomendaGasto() 
    {
        return encomendaGasto;
    }

    public JLabel getConsultaValor() 
    {
        return consultaValor;
    }

    public JLabel getConsultaGasto() 
    {
        return consultaGasto;
    }

    public JList<Produto> getProdutos() 
    {
        return produtos;
    }

    public JLabel getDia1() 
    {
        return dia1;
    }

    public JLabel getDia2() 
    {
        return dia2;
    }

    public JLabel getDia3() 
    {
        return dia3;
    }

    public JLabel getDia4() 
    {
        return dia4;
    }

    public JLabel getDia5() 
    {
        return dia5;
    }

    public JLabel getDia6() 
    {
        return dia6;
    }

    public JLabel getDia7() 
    {
        return dia7;
    }

    public JLabel getDia8() 
    {
        return dia8;
    }

    public JLabel getDia9() 
    {
        return dia9;
    }

    public JLabel getDia10() 
    {
        return dia10;
    }

    public JLabel getDia11() 
    {
        return dia11;
    }

    public JLabel getDia12() 
    {
        return dia12;
    }

    public JLabel getDia13() 
    {
        return dia13;
    }

    public JLabel getDia14() 
    {
        return dia14;
    }

    public JLabel getDia15() 
    {
        return dia15;
    }

    public JLabel getDia16() 
    {
        return dia16;
    }

    public JLabel getDia17() 
    {
        return dia17;
    }

    public JLabel getDia18() 
    {
        return dia18;
    }

    public JLabel getDia19() 
    {
        return dia19;
    }

    public JLabel getDia20() 
    {
        return dia20;
    }

    public JLabel getDia21() 
    {
        return dia21;
    }

    public JLabel getDia22() 
    {
        return dia22;
    }

    public JLabel getDia23() 
    {
        return dia23;
    }

    public JLabel getDia24() 
    {
        return dia24;
    }

    public JLabel getDia25() 
    {
        return dia25;
    }

    public JLabel getDia26() 
    {
        return dia26;
    }

    public JLabel getDia27() 
    {
        return dia27;
    }

    public JLabel getDia28() 
    {
        return dia28;
    }

    public JLabel getDia29() 
    {
        return dia29;
    }

    public JLabel getDia30() 
    {
        return dia30;
    }

    public JLabel getDia31() 
    {
        return dia31;
    }

    public JLabel getCalendarioMes() 
    {
        return calendarioMes;
    }

    public JLabel getCalendarioAno() 
    {
        return calendarioAno;
    }
    
    

    
    //set
    public void setSenha(JPasswordField senha)
    {
        this.senha = senha;
    }

    public void setCadastrarDataEntregaDia(JTextField cadastrarDataEntregaDia) 
    {
        this.cadastrarDataEntregaDia = cadastrarDataEntregaDia;
    }

    public void setCadastrarDataEntregaMes(JTextField cadastrarDataEntregaMes) 
    {
        this.cadastrarDataEntregaMes = cadastrarDataEntregaMes;
    }

    public void setCadastrarDataEntregaAno(JTextField cadastrarDataEntregaAno) 
    {
        this.cadastrarDataEntregaAno = cadastrarDataEntregaAno;
    }

    public void setCadastrarBoloTamanho(JTextField cadastrarBoloTamanho) 
    {
        this.cadastrarBoloTamanho = cadastrarBoloTamanho;
    }

    public void setCadastrarBoloSaborMassa(JTextField cadastrarBoloSaborMassa) 
    {
        this.cadastrarBoloSaborMassa = cadastrarBoloSaborMassa;
    }

    public void setCadastrarBoloSaborRecheio(JTextField cadastrarBoloSaborRecheio) 
    {
        this.cadastrarBoloSaborRecheio = cadastrarBoloSaborRecheio;
    }

    public void setCadastrarDoceSabor(JTextField cadastrarDoceSabor) 
    {
        this.cadastrarDoceSabor = cadastrarDoceSabor;
    }

    public void setCadastrarBoloInfo(JTextField cadastrarBoloInfo) 
    {
        this.cadastrarBoloInfo = cadastrarBoloInfo;
    }

    public void setCadastrarDoceInfo(JTextField cadastrarDoceInfo) 
    {
        this.cadastrarDoceInfo = cadastrarDoceInfo;
    }

    public void setCadastrarBoloValor(JTextField cadastrarBoloValor) 
    {
        this.cadastrarBoloValor = cadastrarBoloValor;
    }

    public void setCadastrarDoceValor(JTextField cadastrarDoceValor) 
    {
        this.cadastrarDoceValor = cadastrarDoceValor;
    }

    public void setCadastrarBoloCusto(JTextField cadastrarBoloCusto) 
    {
        this.cadastrarBoloCusto = cadastrarBoloCusto;
    }

    public void setCadastrarDoceCusto(JTextField cadastrarDoceCusto) 
    {
        this.cadastrarDoceCusto = cadastrarDoceCusto;
    }

    public void setCadastrarEncomendaInfo(JTextField cadastrarEncomendaInfo) 
    {
        this.cadastrarEncomendaInfo = cadastrarEncomendaInfo;
    }
    
    public void setCadastrarNomeCliente(JTextField cadastrarNomeCliente) 
    {
        this.cadastrarNomeCliente = cadastrarNomeCliente;
    }
    
    public void setCadastrarTelefoneCliente(JTextField cadastrarTelefoneCliente) 
    {
        this.cadastrarTelefoneCliente = cadastrarTelefoneCliente;
    }
    
    public void setCadastrarEnderecoCliente(JTextField cadastrarEnderecoCliente) 
    {
        this.cadastrarEnderecoCliente = cadastrarEnderecoCliente;
    }

    public void setCadastrarNomeIngrediente(JTextField cadastrarNomeIngrediente) 
    {
        this.cadastrarNomeIngrediente = cadastrarNomeIngrediente;
    }

    public void setCadastrarValorIngrediente(JTextField cadastrarValorIngrediente) 
    {
        this.cadastrarValorIngrediente = cadastrarValorIngrediente;
    }

    public void setCadastrarQuantidadeIngrediente(JTextField cadastrarQuantidadeIngrediente) 
    {
        this.cadastrarQuantidadeIngrediente = cadastrarQuantidadeIngrediente;
    }

    public void setCadastrarDataPedidoDia(JTextField cadastrarDataPedidoDia) 
    {
        this.cadastrarDataPedidoDia = cadastrarDataPedidoDia;
    }

    public void setCadastrarDataPedidoMes(JTextField cadastrarDataPedidoMes) 
    {
        this.cadastrarDataPedidoMes = cadastrarDataPedidoMes;
    }

    public void setCadastrarDataPedidoAno(JTextField cadastrarDataPedidoAno) 
    {
        this.cadastrarDataPedidoAno = cadastrarDataPedidoAno;
    }

    public void setNomeCliente(JLabel nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }

    public void setTelefoneCliente(JLabel telefoneCliente) 
    {
        this.telefoneCliente = telefoneCliente;
    }

    public void setEnderecoCliente(JLabel enderecoCliente) 
    {
        this.enderecoCliente = enderecoCliente;
    }

    public void setDataDiaEntrega(JLabel dataDiaEntrega) 
    {
        this.dataDiaEntrega = dataDiaEntrega;
    }

    public void setDataMesEntrega(JLabel dataMesEntrega) 
    {
        this.dataMesEntrega = dataMesEntrega;
    }

    public void setDataAnoEntrega(JLabel dataAnoEntrega) 
    {
        this.dataAnoEntrega = dataAnoEntrega;
    }

    public void setDataDiaPedido(JLabel dataDiaPedido) 
    {
        this.dataDiaPedido = dataDiaPedido;
    }

    public void setDataMesPedido(JLabel dataMesPedido) 
    {
        this.dataMesPedido = dataMesPedido;
    }

    public void setDataAnoPedido(JLabel dataAnoPedido) 
    {
        this.dataAnoPedido = dataAnoPedido;
    }

    public void setClientes(JList<Cliente> clientes) 
    {
        this.clientes = clientes;
    }

    public void setEncomendaInfo(JLabel encomendaInfo) 
    {
        this.encomendaInfo = encomendaInfo;
    }

    public void setEncomendaValor(JLabel encomendaValor) 
    {
        this.encomendaValor = encomendaValor;
    }

    public void setEncomendaGasto(JLabel encomendaGasto) 
    {
        this.encomendaGasto = encomendaGasto;
    }

    public void setConsultaValor(JLabel consultaValor) 
    {
        this.consultaValor = consultaValor;
    }

    public void setConsultaGasto(JLabel consultaGasto) 
    {
        this.consultaGasto = consultaGasto;
    }
    
    
    //visibilidade
    public void visibilidadeTelaUsuario()
    {
        this.painelUsuario.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraEncomenda()
    {
        this.painelRegistraEncomenda.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraProduto()
    {
        this.painelRegistraProduto.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraCliente()
    {
        this.painelRegistraCliente.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraIngrediente()
    {
        this.painelRegistraIngrediente.setVisible(false);
    }
    
    public void visibilidadeTelaConsultaGastoLucro()
    {
        this.painelConsultaGastoLucro.setVisible(false);
    }
    
    public void visibilidadeTelaRelatorio()
    {
        this.painelRelatorio.setVisible(false);
    }
    
    public void visibilidadeTelaCalendario()
    {
        this.painelCalendario.setVisible(false);
    }
}
