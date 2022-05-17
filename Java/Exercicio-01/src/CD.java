import java.util.Scanner;
//Subclasse construída conforme UML
public class CD extends Midia{
    //Declarando variáveis
    private int nMusicas;
    //Inicializando Construtores (Superclasse Midia + Subclasse CD)
    public CD(){
        super();
    }

    public CD(int c, double p, String s, int m){
        super();
        this.nMusicas = m;
    }
    //Sobrescrita de métodos da Superclasse conforme UML
    @Override
    public String getTipo(){
        return "CD";
    }

    @Override
    public String getDetalhes(){
        return super.getDetalhes() + getnMusicas();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Insira quantidade musicas: ");
        Scanner input = new Scanner(System.in);
        this.nMusicas = input.nextInt();
    }
    //Criando getters e setters para os atributos da Subclasse CD
    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}
