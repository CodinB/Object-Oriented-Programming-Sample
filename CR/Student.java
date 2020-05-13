public class Student extends User{
    // public String name;
    // public int age;
    public int cohortNumber;

    public Student(String name, int age, int cohortNumber){
        super(name, age);
        // this.name = name;
        // this.age = age;
        this.cohortNumber = cohortNumber;
    }

    // create the printStudent method
    public void printStudent(){
        // System.out.println("----Student----");
        // System.out.println("Name: " + this.name);
        // System.out.println("Age: " + this.age + " years old");
        printUser();
        System.out.println("Cohort Number: " + this.cohortNumber);
    }


}