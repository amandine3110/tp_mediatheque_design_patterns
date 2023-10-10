package mediatheque;

public class BookPrinter implements ItemVisitor{

    public BookPrinter() {

    }

    // Imprimer un livre
    public void visit(Book m) {
        System.out.println(m);
    }

    // Imprimer un CD
    public void visit(CD m) {

    }

}
