package Animal;

public class Animal {
    String name;
    int age;
    String sex;

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void describe(String name, int age, String sex) {
        System.out.println(name + age + sex);
    }
    public interface Trainable {
        void train();
    }

}

