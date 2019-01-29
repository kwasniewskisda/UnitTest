package pl.sda.tests.users;

import java.util.*;

public class UserDatabase {

    public void addUser(User user) throws UserExistException {
        Objects.requireNonNull(user);
        assertIsNameAvailable(user);
        memory.add(user);
    }

    public User getUser(String login, String password) throws NoSuchUserException {
        Objects.requireNonNull(login);
        Objects.requireNonNull(password);
        Optional<User> optionalUser = findUserByLogin(login);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new NoSuchUserException();
        }
    }

    public int countUsers() {
        return memory.size();
    }

    public void removeUser(String login) throws NoSuchUserException {
        Objects.requireNonNull(login);
        Optional<User> optionalUser = findUserByLogin(login);
        if (optionalUser.isPresent()) {
            memory.remove(optionalUser.get());
        } else {
            throw new NoSuchUserException();
        }
    }

    public User signIn(String login, String password) throws InvalidCredentialsException {
        Optional<User> userOptional = findUserByLogin(login);
        if (!userOptional.isPresent()) {
            throw new InvalidCredentialsException();
        }
        User user = userOptional.get();
        if (user.getPassword().equals(password)) {
            return user;
        } else {
            throw new InvalidCredentialsException();
        }
    }

    private void assertIsNameAvailable(User user) throws UserExistException {
        if (findUserByLogin(user.getLogin()).isPresent()) {
            throw new UserExistException();
        }
    }

    private Optional<User> findUserByLogin(String login) {
        return memory.stream().filter(u -> u.getLogin().equals(login)).findFirst();
    }

    private List<User> memory = new ArrayList<>();

}
