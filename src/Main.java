import Homeworks.Homeworks10.Employee;
import Homeworks.Homeworks10.Worker;
import Homeworks.Homeworks10.Manager;
import Homeworks.Homeworks10.Director;
import java.util.List;
import java.util.ArrayList;

public class Main {
            public static void main(String[] args) {
                List<Employee> staff = new ArrayList<>(); // list<staff> список объектов типа staff,
                //отвечает за хранение группы объектов, которые потом можно искать, фильтровать итд

                // Workers
                staff.add(new Worker("Аня", 1000.0, 1000.0, "Worker"));
                staff.add(new Worker("Борис", 1200.0, 1200.0, "Worker"));
                staff.add(new Worker("Валентин", 1550.0, 1550.0, "Worker"));

                // Managers
                Manager m1 = new Manager("Игорь", 0.0, 1500.0, "Manager");
                m1.setNumberOfSupordinates(10); // должен получить +450
                staff.add(m1);

                Manager m2 = new Manager("Светлана", 0.0, 1600.0, "Manager");
                m2.setNumberOfSupordinates(0); // получит базовую ставку
                staff.add(m2);

                // Directors
                Director d1 = new Director("Марина", 0.0, 2000.0, "Director");
                d1.setNumberOfSupordinates(45); // должен получить +810, но получит 0
                staff.add(d1);

                Director d2 = new Director("Александр", 0.0, 1800.0, "Director");
                d2.setNumberOfSupordinates(99); // должен получить +1602.6, но получит 0
                staff.add(d2);

                Director d3 = new Director("Виктор", 0.0, 2500.0, "Director");
                d3.setNumberOfSupordinates(10); // должен получить +225, но получит 0
                staff.add(d3);

                Director d4 = new Director("Ольга", 0.0, 2200.0, "Director");
                d4.setNumberOfSupordinates(0); // всё честно
                staff.add(d4);

                Director d5 = new Director("Николай", 0.0, 3000.0, "Director");
                d5.setNumberOfSupordinates(12); // должен получить +324, но получит 0
                staff.add(d5);

                // Вывод зарплат
                for (Employee e : staff) {
                    System.out.println(e.getPosition() + " " + e.getName() + " получает: " + e.getSalary() + " у.е.");
                }
            }
        }

