package CollectionFramework.p03_set.p02_hashset;
// @ 1. This is one of the most important topics for interviews.
// 2. Suppose you create two Student objects with the same ID.
// How can a HashSet identify them as duplicates? Define equals() and hashCode() consistently.

import java.util.HashSet;
import java.util.Objects;

public class HashSetCustomObjects11 {

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

                if (!(obj instanceof Student)) {
                    return false;
                }

                Student other = (Student) obj;
                return this.id == other.id;
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

            HashSet<Student> students = new HashSet<>();

            students.add(new Student(101, "Saurav"));
            students.add(new Student(102, "Rahul"));
            students.add(new Student(101, "Saurav Kumar"));

            System.out.println(students);
            System.out.println("Unique student IDs: " + students.size());
    }
}

// Expected behavior:

// [101 - Saurav, 102 - Rahul]
// Unique student IDs: 2

// 3. Why is the third object ignored? Both student objects have ID 101, and our equals() method considers IDs when comparing students.

// 4. Important rules:

// 1. If two objects are equal according to equals(), they must have the same hash code.
// 2. Two objects with the same hash code aren't necessarily equal.
// 3. If you override equals(), you should also override hashCode().