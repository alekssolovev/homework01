package com.company.project.lesson20;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // 1. Разделить учеников на две группы: мальчиков и девочек
        Map<Student.Gender, List<Student>> studentsByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        // 2. Найти средний возраст учеников
        double averageAge = students.stream()
                .mapToLong(student -> student.getBirth().until(LocalDate.now()).getYears())
                .average()
                .orElse(0);

        // 3. Найти самого младшего ученика
        Optional<Student> youngestStudent = students.stream()
                .min(Comparator.comparing(Student::getBirth));

        // 5. Собрать учеников в группы по году рождения
        Map<Integer, List<Student>> studentsByYear = students.stream()
                .collect(Collectors.groupingBy(student -> student.getBirth().getYear()));

        // 6. Отсортировать по полу, дате рождения, имени (в обратном порядке) и собрать в список
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGender)
                .thenComparing(Student::getBirth)
                .thenComparing(Student::getName)
                .reversed();
        List<Student> sortedStudents = students.stream()
                .sorted(studentComparator)
                .collect(Collectors.toList());

        // 7. Собрать в список всех учеников с определенным именем
        String someName = "Петр";
        List<Student> studentsWithName = students.stream()
                .filter(student -> student.getName().equals(someName))
                .collect(Collectors.toList());


        // 8. Собрать Map<Student.Gender, Integer> с суммарным возрастом учеников каждого пола
        Map<Student.Gender, Integer> totalAgeByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.summingInt(student -> student.getBirth().until(LocalDate.now()).getYears())));

        //System.out.println(studentsByGender);
    }
}
