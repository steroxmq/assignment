public class Employer implements Person {
    private int age;
    private String name;
    private String surname;

    public Employer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age;
    }

    public int calculateYearsToRetirement() {
        int retirementAge = 65;
        return Math.max(0, retirementAge - age);
    }
}
