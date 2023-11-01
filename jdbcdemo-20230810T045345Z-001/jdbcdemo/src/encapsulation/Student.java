package encapsulation;

class Student {
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Public methods to set attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    // Public methods to get attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }
}

