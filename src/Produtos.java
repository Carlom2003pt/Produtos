public class Produtos {
    public String Nome;
    public double Preço;

    public Produtos(){}

    public Produtos(String nome, double preço)
    {
        this.Nome=nome;
        this.Preço=preço;
    }
    public String getNome(){
        return this.Nome;
    }
    public double getPreço(){
        return this.Preço;
    }
    public void setNome(String nome){
        this.Nome=nome;
    }
    public void setPreço(double preço){
        this.Preço=preço;
    }
}
