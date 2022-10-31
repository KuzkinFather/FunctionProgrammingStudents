package homework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Pavel", "Kuzmich", 3, List.of(1, 2, 3, 4)),
                new Student("Andrew", "Klimovich", 2, List.of(1, 2, 3, 4)),
                new Student("Sergey", "Shuneiko", 3, List.of(1, 2, 3, 4)),
                new Student("Iryna", "Boiko", 2, List.of(1, 2, 3, 4)),
                new Student("Artem", "Slepica", 3, List.of(1, 2, 3, 4)),
                new Student("Oleg", "Alehnovich", 1, List.of(1, 2, 3, 4))
        );


        Map<Integer, Double> listmap = students.stream()
                .filter(student -> student.getAssessments().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(student -> student.getAssessments().stream()
                        .collect(Collectors.averagingInt(Integer::intValue)))));
        System.out.println(listmap);


        Map<Integer, List<String>> listmap2 = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.mapping(student -> String.join(" ", student.getName(), student.getSurname()),
                        Collectors.collectingAndThen(Collectors.toList(), strings -> strings.stream().sorted().collect(Collectors.toList())))));
        System.out.println(listmap2);
    }
}
