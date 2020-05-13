public class Example{

    public static void main(String[] args){
        //Objects interaction


        //creating new user objects
    User Shay = new User("Shay", 21);
    User Briun = new User("Briun", 31);

    Shay.printUser();
    Briun.printUser();

    Student Jack = new Student("Jack", 35, 9);
    Student Jill = new Student("jill", 33, 10);

    Jack.printStudent();
    Jill.printStudent();

    Animal Bear = new Animal("Polar Bear", "Carnivor");
    Animal Tiger = new Animal("Tony", "Tiger");
    Bear.printAnimal();
    Tiger.printAnimal();

    Tiger.attacks(Shay);
    Bear.attacks(Briun);
    }

    
    
}