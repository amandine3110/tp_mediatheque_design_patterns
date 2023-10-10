package mediatheque;

public class CatalogPrinter implements ItemVisitor{

    public CatalogPrinter() {

    }

    // Imprimer un livre
    public void visit(Book m) {
        System.out.println(m);
    }

    // Imprimer un CD
    public void visit(CD m) {
        System.out.println(m);
    }

}
