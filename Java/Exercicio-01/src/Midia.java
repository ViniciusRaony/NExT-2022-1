import java.util.Scanner;
//Superclasse construída conforme UML do problema
public class Midia {
    //Declarando variáveis
    private int codigo;
    private double preco;
    private String nome;
    //Inicializando Construtores (Superclasse Midia)
    public Midia(){
    }
    public Midia(int c, double p, String s){
        this.codigo = c;
        this.preco = p;
        this.nome = s;
    }
    //Criando método get para retornar String com o nome da Classe
    public String getTipo(){
        return "Midia";
    }
    //Criando método get para retornar as informações contidas nos atributos (0 - int , 0.0 - double , null - String)
    public String getDetalhes(){
        return "Informações: " + this.codigo + ", "+ this.preco + ", " + this.nome;
    }
    //Criado método para exibir dados
    public void printDados(){
        System.out.println(this.getTipo() + " = " + this.getDetalhes());
    }
    //Criando método para inserção de dados
    public void inserirDados(){
        System.out.println("Insira código: ");
        Scanner input = new Scanner(System.in);
        this.codigo = input.nextInt();
        System.out.println("Insira preço: ");
        this.preco = input.nextDouble();
        System.out.println("Insira nome: ");
        this.nome = input.next();
    }
    //Criando getters e setters para os atributos da Classe
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
