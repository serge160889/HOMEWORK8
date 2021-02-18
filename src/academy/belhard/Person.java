package academy.belhard;

public class Person {
    private String firstName;
    private String lastName;
    private Addres addres;

    public Person(String firstName, String lastName, Addres addres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addres = addres;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public Addres getAddres() { return addres; }
}
