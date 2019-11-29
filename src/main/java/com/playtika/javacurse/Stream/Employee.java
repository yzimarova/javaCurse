//package com.playtika.javacurse.Stream;
//
//import com.sun.tools.javac.code.Attribute;
//
//import java.util.List;
//import java.util.Optional;
//
//public class Employee {
//
//    public enum Sex {
//        FEMALE, MALE
//    }
//
//
//    public Sex getGender() { return  gender;}
//    public LocalDate getHired() { return hired; }
//    public LocalDate getDate() { return date; }
//    public long getSalary() { return salary; }
//
//    public static List<Employee> getEmployees() {
//        new Employee("Nik", "Nikovich", Sex.MALE, 15000)
//    }
//    public static void main(String[] args) {
//        long count = getEmployee().stream()
//                .filter(employee -> employee.getGender() == Sex.MALE)
//                .filter(employee -> employee.getSalary() >= 10000)
//                .count();
//        System.out.println("Number of men " + count);
//        Optional<Employee> optionalEmpl = getEmployee().stream()
//                .filtre(employee -> employee.getFirstName().equals("Nik"))
//                .max(e1, e2) -> e1.getSalary() - e2.getSalary();
//        Employee empl = optionalEmpl.orElse()
//    }
//
//}
