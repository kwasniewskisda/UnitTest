package pl.sda.tests.users;

public class InvalidCredentialsException extends Exception {

    public InvalidCredentialsException() {
        super("Błędny login lub hasło.");
    }
}
