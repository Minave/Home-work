package lesson1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(600), new Water(30), new Wall(7));
        Team team = new Team("Oladushki", new Human("Viktor"), new Cat("Barsik"), new Dog("Venya"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}
