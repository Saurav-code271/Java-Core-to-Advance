package CollectionFramework.p03_set.p04_treeset;
// 1. A TreeSet needs a way to compare custom objects. We'll use Comparator to sort students by marks,
// then by name so students with equal marks can both be stored.

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomObjects06 {
        static class Student {
            int id;
            String name;
            int marks;

            Student(int id, String name, int marks) {
                this.id = id;
                this.name = name;
                this.marks = marks;
            }

            @Override
            public String toString() {
                return id + " - " + name + " - " + marks;
            }
        }

        public static void main(String[] args) {

            // Sort by marks, then by name, then by ID
            TreeSet<Student> students = new TreeSet<>(
                    Comparator.comparingInt((Student s) -> s.marks)
                            .thenComparing(s -> s.name)
                            .thenComparingInt(s -> s.id)
            );

            students.add(new Student(103, "Ravi", 85));
            students.add(new Student(101, "Aman", 92));
            students.add(new Student(102, "Neha", 85));
            students.add(new Student(104, "Aman", 92));

            for (Student student : students) {
                System.out.println(student);
            }
    }
}

// Output:

// 103 - Ravi - 85
// 102 - Neha - 85
// 101 - Aman - 92
// 104 - Aman - 92

// 2. Key point: TreeSet uses its comparator to determine ordering and whether two elements are equivalent.
// If the comparator returns 0, one of those elements won't be added. The ID tie-breaker helps keep these four students distinct.