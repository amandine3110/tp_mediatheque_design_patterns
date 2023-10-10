package mediatheque;

public class CDPrinter implements ItemVisitor{

    public CDPrinter() {

    }

    // Imprimer un livre
    public void visit(Book m) {

    }

    // Imprimer un CD
    public void visit(CD m) {
        System.out.println(m);
    }

}
