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
    
 
    Tela()
    {
        this.usuario = new Usuario();
        
        DefaultListModel<Cliente> modelClientes = new DefaultListModel<>();
        clientes = new JList<>(modelClientes);
        
        DefaultListModel<Ingrediente> modelIngrediente = new DefaultListModel<>();
        ingredientes = new JList<>(modelIngrediente);
        
        
        DefaultListModel<Encomenda> modelEncomenda = new DefaultListModel<>();
        encomendas = new JList<>(modelEncomenda);
        
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
        //this.setSize(1280,720);
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        
       /*
        JButton registrarIngredienteBtn;
        registrarIngredienteBtn = new JButton();
        registrarIngredienteBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarIngredienteBtn.setBackground(new Color(239,186,237));
        registrarIngredienteBtn.setBorderPainted(false);
        registrarIngredienteBtn.setIcon(imagemRegistraIngrediente);
        registrarIngredienteBtn.addActionListener(new registrarIngrediente(this));
        painelFuncoes.add(registrarIngredienteBtn);
        */
        
        JButton registrarProdutoBtn;
        registrarProdutoBtn = new JButton("", imagemRegistraProduto);
        registrarProdutoBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarProdutoBtn.setBackground(new Color(239,186,237));
        registrarProdutoBtn.setBorderPainted(false);
        //registrarIngredienteBtn.setIcon(imagemRegistraProduto);
        registrarProdutoBtn.addActionListener(new registrarProduto(this));
        painelFuncoes.add(registrarProdutoBtn);
        
        
        JButton consultarGastoLucroBtn;
        consultarGastoLucroBtn = new JButton();
        consultarGastoLucroBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        consultarGastoLucroBtn.setBackground(new Color(239,186,237));
        consultarGastoLucroBtn.setBorderPainted(false);
        consultarGastoLucroBtn.setIcon(imagemGastoLucro);
        consultarGastoLucroBtn.addActionListener(new consultarGastoLucro(this));
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
        //this.setSize(1280,720);
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
        //sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        JPanel painelBolo;
        painelBolo = new JPanel();
        painelBolo.setBackground(new Color(239,186,237));
        painelBolo.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRegistraEncomenda = new JPanel();
        this.painelRegistraEncomenda.setLayout(new BorderLayout());
        this.painelRegistraEncomenda.setBackground(new Color(239,186,237));
        
        telaRegistraEncomendaAux();
        
        this.add(this.painelRegistraEncomenda);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraEncomendaAux()
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
        //sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,3));
        this.painelRegistraEncomenda.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemRegistra);
        //cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,2));
        this.painelRegistraEncomenda.add(cadastrarBtn,BorderLayout.EAST);
        
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        JPanel painelFuncoesEntrega;
        painelFuncoesEntrega = new JPanel();
        painelFuncoesEntrega.setBackground(new Color(239,186,237));
        painelFuncoesEntrega.setLayout(new GridLayout(0,2));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //clientes.addListSelectionListener(new InfoListaCliente(this));
        
        produtos = new JList(usuario.getProdutos().toArray());
        produtos.setVisible(true);
        produtos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //clientes.addListSelectionListener(new InfoListaCliente(this));

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
        
        
        //painelFuncoesEntrega.add(new JScrollPane(clientes));
        //painelFuncoesEntrega.add(new JScrollPane(produtos));
        painelFuncoes.add(new JScrollPane(clientes),BorderLayout.CENTER);
        painelFuncoes.add(new JScrollPane(produtos),BorderLayout.SOUTH);
        
        painelFuncoes.add(painelFuncoesEntrega,BorderLayout.NORTH);
        this.painelRegistraEncomenda.add(painelFuncoes,BorderLayout.CENTER);
        
    }
    
    public void telaRegistraCliente()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
    
    public void telaRegistraIngrediente()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRegistraIngrediente = new JPanel();
        this.painelRegistraIngrediente.setLayout(new BorderLayout());
        this.painelRegistraIngrediente.setBackground(new Color(239,186,237));
        
        telaRegistraIngredienteAux();
        
        this.add(this.painelRegistraIngrediente);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraIngredienteAux()
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
        sairBtn.addActionListener(new Sair(this,4));
        this.painelRegistraIngrediente.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemRegistra);
        cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,3));
        this.painelRegistraIngrediente.add(cadastrarBtn,BorderLayout.EAST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        painelFuncoes.add(null3);
        painelFuncoes.add(null4);
        painelFuncoes.add(null5);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Nome);
        cadastrarNomeIngrediente = new JTextField(100);
        cadastrarNomeIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarNomeIngrediente);
        painelFuncoes.add(null0);
        
        painelFuncoes.add(null6);
        painelFuncoes.add(null7);
        painelFuncoes.add(null8);
        
        JLabel Telefone = new JLabel("Valor:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Telefone);
        cadastrarValorIngrediente = new JTextField(100);
        cadastrarValorIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarValorIngrediente);
        painelFuncoes.add(null1);
        
        painelFuncoes.add(null9);
        painelFuncoes.add(null10);
        painelFuncoes.add(null11);
        
        JLabel Endereco = new JLabel("Quantidade:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 46));
        painelFuncoes.add(Endereco);
        cadastrarQuantidadeIngrediente = new JTextField(100);
        cadastrarQuantidadeIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarQuantidadeIngrediente);
        painelFuncoes.add(null2);
        
        painelFuncoes.add(null12);
        
        this.painelRegistraIngrediente.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaConsultaGastoLucro()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
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
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        this.painelConsultaGastoLucro.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaRelatorio()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        encomendas = new JList(usuario.getEncomendas().toArray());
        encomendas.setVisible(true);
        encomendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        encomendas.addListSelectionListener(new relatorioInfo(this));
        painelFuncoes.add(new JScrollPane(encomendas),BorderLayout.EAST);
        
        JPanel painelInfo;
        painelInfo = new JPanel();
        painelInfo.setBackground(new Color(239,186,237));
        painelInfo.setLayout(new GridLayout(0,2));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
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
        //this.setSize(1280,720);
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
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
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
