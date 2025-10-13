package Animal;

public class Puppie extends Dog {

    public Puppie (String name, int age, String sex) {
        super (name, age, sex);
    }
       public void speak() {
        if (age < 2) {
        System.out.println(name + " говорит тяф! тяф!");
        }

    }
}
