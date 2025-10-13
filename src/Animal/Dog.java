package Animal;

public class Dog extends Animal {

    public Dog (String name, int age, String sex) {
        super(name, age,sex);
    }

    public void speak() {
        System.out.println(name + " Говорит: гав гав!");
    }
    public void train() {
        System.out.println(name + " выполняет команду");
    }



}
