package org.example.HW8_2;

public class EmployeeUtils {
//    Необходимо создать класс со следующими методами:



//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    //    поиск сотрудника в массиве по его имени
    public int findName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    //    поиск сотрудника в массиве по вхождению указанной строки в его имени

    public int findSubName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(name)) {
                return i;
            }
        }
        return -1;
    }

    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public int sumSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getBaseSalary();
        }
        return sum;
    }

    //    поиск наименьшей зарплаты в массиве
    public int minSalary(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getBaseSalary()) {
                min = arr[i].getBaseSalary();
            }
        }
        return min;
    }
    //    поиск наибольшей зарплаты в массиве
    public int maxSalary(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getBaseSalary()) {
                max = arr[i].getBaseSalary();
            }
        }
        return max;
    }
 //    поиск наибольшего количества подчиненных в массиве менеджеров
    public int maxNumberOfSubordinates(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getNumberOfSubordinates()) {
                max = arr[i].getNumberOfSubordinates();
            }
        }
        return max;
    }
    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public int minNumberOfSubordinates(Manager[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getNumberOfSubordinates()) {
                min = arr[i].getNumberOfSubordinates();
            }
        }
        return min;
    }
    //    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public int min(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int salary = arr[i].getBaseSalary()- arr[i].getSalaryManager();
            if (max < salary) {
                max = salary;
            }
        }
        return max;
    }
}