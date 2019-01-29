package pl.sda.tests.users;

public class UserExistException extends Exception {

    public UserExistException(){
        super("Użytkownik o takiej nazwie już istnieje.");
    }
}
