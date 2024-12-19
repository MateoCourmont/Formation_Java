public class Employee {
    private String firstname;
    private String lastname;
    private int age;

    public Employee(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}
