package Animal;

public class Cat extends Animal {
    public Cat (String name, int age, String sex) {
        super(name, age, sex);

    }
    public void speak () {
        System.out.println(name + " говорит: мяу! мяу!");
    }

}
