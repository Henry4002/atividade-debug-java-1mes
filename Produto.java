package Classes;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private int pedido;

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override;
    public String toString() {
        return "\n==ESTOQUE==\n" +
                "Item:" + getNome() +
                "\nPreço: " + getPreco()+
                "\nQuantidade:"+ getQuantidade();
    }

    public void pedido(){
        if (getQuantidade() > 5){
            Systemm.out.println("\n==NOTIFICAÇÃO==\nPeça mais "+getNome()+" só restam "+getQuantidade()+" produtos.");
        }
        else(getQuantidade() <= 5) {
            System.out.println("\n==NOTIFICAÇÃO==\nO produto "+getNome()+" está em estoque. Restam: "+ getQuantidade());
        }
    };




}
