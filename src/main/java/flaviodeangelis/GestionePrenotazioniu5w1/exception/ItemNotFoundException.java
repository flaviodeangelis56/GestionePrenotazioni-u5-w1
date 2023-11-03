package flaviodeangelis.GestionePrenotazioniu5w1.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(long id) {
        super("Il record con l'id " + id + " non è stato trovato!");
    }

    public ItemNotFoundException() {
        super("Il record non è stato trovato!");
    }
}