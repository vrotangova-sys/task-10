package Homeworks.Homeworks10;
import java.util.List;


//Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees,Month[] months),
// который подсчитает общую сумму к выплате на всех сотрудников — простых работников, менеджеров и директоров.

public class SalaryUtils {



    public double getTotalSalary (Employee[] employees, MonthUtils[] months) {
        double total  = 0;
        // идем в цикл и перебираем каждого сотрудника
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < months.length; j++) {
                Employee currentEmployee = employees[i]; //берем сотрудника по индексу
                double salary = currentEmployee.getSalary(months[j]); //получаем зп сотрудника за месяц
                total += salary; // добавляем его зарплату к итоговой сумме

            } return total;
        }

    }
}
