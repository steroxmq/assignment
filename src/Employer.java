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
    public String getInfo() {  // Change void to String
        System.out.println("Name: " + name + ", Surname: " + surname);
        System.out.println("Years to retirement: " + calculateYearsToRetirement());
        return null;
    }

    public int calculateYearsToRetirement() {
        int retirementAge = 65;
        return Math.max(0, retirementAge - age);
    }
}
