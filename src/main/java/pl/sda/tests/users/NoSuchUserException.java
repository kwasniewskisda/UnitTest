package pl.sda.tests.users;

public class NoSuchUserException extends Exception {

    public NoSuchUserException() {
        super("Użytkownik o takiej nazwie nie istnieje.");
    }
}
