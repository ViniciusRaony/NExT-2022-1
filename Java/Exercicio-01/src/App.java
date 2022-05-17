public class App {

    public static void main(String[] args) {
        //Criando objetos
        Midia dvd1 = new DVD();
        Midia cd1 = new CD();
        Midia m1 = new Midia();
        //Inserindo e monstrando valores na Superclasse Midia
        m1.inserirDados();
        m1.printDados();
        //Inserindo e mostrando valores na Subclasse DVD
        dvd1.inserirDados();
        dvd1.printDados();
        //Inserindo e mostrando valores na Subclasse CD
        cd1.inserirDados();
        cd1.printDados();
    }

}
