import java.util.Scanner;
//Subclasse construída conforme UML
public class DVD extends Midia{
    //Declarando variáveis
    private int nFaixas;
    //Inicializando Construtores (Superclasse Midia + Subclasse DVD)
    public DVD(){
        super();
    }

    public DVD(int c, double p, String s, int f){
        super(c, p, s);
        this.nFaixas = f;
    }
    //Sobrescrita de métodos da Superclasse conforme UML
    @Override
    public String getTipo(){
        return "DVD";
    }

    @Override
    public String getDetalhes(){
        return super.getDetalhes() + ", " + this.getnFaixas();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Insira faixa: ");
        Scanner input = new Scanner(System.in);
        this.nFaixas = input.nextInt();
    }
    //Criando getters e setters para os atributos da Subclasse DVD
    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}
