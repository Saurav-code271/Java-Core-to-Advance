package CollectionFramework.p03_set.p06_set_operations;
// 1. Let’s use set operations in a practical example: comparing students enrolled in two courses.

import java.util.HashSet;
import java.util.Set;

public class SetOperationsRealWorld07 {
    public static void main(String[] args) {
        Set<String> javaStudents = new HashSet<>(
                Set.of("Aman", "Ravi", "Neha", "Saurav"));

        Set<String> sqlStudents = new HashSet<>(
                Set.of("Neha", "Saurav", "Priya", "Rahul"));

        // Students enrolled in either course
        Set<String> allStudents = new HashSet<>(javaStudents);
        allStudents.addAll(sqlStudents);

        // Students enrolled in both courses
        Set<String> bothCourses = new HashSet<>(javaStudents);
        bothCourses.retainAll(sqlStudents);

        // Students enrolled only in Java
        Set<String> onlyJava = new HashSet<>(javaStudents);
        onlyJava.removeAll(sqlStudents);

        // Students enrolled only in SQL
        Set<String> onlySQL = new HashSet<>(sqlStudents);
        onlySQL.removeAll(javaStudents);

        System.out.println("All unique students: " + allStudents);
        System.out.println("Students in both courses: " + bothCourses);
        System.out.println("Only Java: " + onlyJava);
        System.out.println("Only SQL: " + onlySQL);
    }
}

// Output:

// All unique students: [Aman, Ravi, Neha, Saurav, Priya, Rahul]
// Students in both courses: [Neha, Saurav]
// Only Java: [Aman, Ravi]
// Only SQL: [Priya, Rahul]

// 2. This is a realistic use of Set: the same student enrolled in both courses appears only once in the combined collection.
