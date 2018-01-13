import java.util.List;

public class Person {

    private List<User> users;

    public Person() {
    }

    public Person(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Person{" + "users=" + users + '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
