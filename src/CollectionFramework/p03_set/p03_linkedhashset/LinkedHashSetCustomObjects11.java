package CollectionFramework.p03_set.p03_linkedhashset;
// 1. Custom objects use equals() and hashCode() to determine duplicates.
// This is essential when storing student records, employees, or products.

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetCustomObjects11 {
        static class Student {
            private final int id;
            private final String name;

            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof Student)) return false;

                Student other = (Student) obj;
                return id == other.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }

            @Override
            public String toString() {
                return id + " - " + name;
            }
        }

        public static void main(String[] args) {

            LinkedHashSet<Student> students = new LinkedHashSet<>();

            students.add(new Student(101, "Saurav"));
            students.add(new Student(102, "Rahul"));
            students.add(new Student(101, "Saurav Kumar"));

            System.out.println(students);
    }
}

// Output:

// [101 - Saurav, 102 - Rahul]

// 2. The second student with ID 101 is treated as a duplicate, because equality is based on the ID.
