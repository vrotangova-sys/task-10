package Animal;

public class Parrot extends Animal {
    public Parrot (String name, int age, String sex) {
        super (name, age, sex);

    }
    public void speak(){
        System.out.println(name + " говорит: Гриша харрроший! ");
    }
    public void train() {
        System.out.println(name + " выполняет команду");
    }

}
