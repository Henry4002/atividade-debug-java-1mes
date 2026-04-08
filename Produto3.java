package Main;

import Classes.Produto;

public class Produto3 extends Produto {
    private int id;
    private String nome;
    private double  preco;
    private int quantidade;
    private int pedido;

    public Produto3(int id, String nome, double preco, int quantidade,  int pedido) {
        super(id, nome, preco, quantidade);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getPedido() {
        return pedido;
    }

    @Override
    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
    @Override
    public void pedido() {
        if (getQuantidade() > 5) {
            System.out.println("\n==NOTIFICAÇÃO==\nPeça mais " + getNome() + " só restam " + getQuantidade() + " produtos.");
        } else if (getQuantidade() <= 5) {
            System.out.println("\n==NOTIFICAÇÃO==\nO produto " + getNome() + " está em estoque. Restam: " + getQuantidade());
        }

    }
    @Override
    public String toString() {
        return "\n==ESTOQUE==\n" +
                "Item:" + getNome() +
                "\nPreço: " + getPreco()+
                "\nQuantidade:"+ getQuantidade();
    }
}

