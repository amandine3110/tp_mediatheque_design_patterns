package mediatheque;

public interface ItemVisitor {
        // Une méthode pour chaque sous-classe de Modem
	void visit(Book m);
	void visit(CD m);
}
