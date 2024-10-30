public class Student implements Person {
    private String studentId;
    private String name;
    private String surname;
    private int age;

    // Constructor to initialize student details
    public Student(String studentId, String name, String surname, int age) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Implement the getInfo() method from Person interface
    @Override
    public String getInfo() {
        return "Student ID: " + studentId + ", Name: " + name + ", Surname: " + surname + ", Age: " + age;
    }
}
