package CollectionFramework.p05_map.p02_hashmap;
// 1. This is one of the most important HashMap interview topics: using custom objects as keys.
// 2. Suppose you create two Student objects with the same student ID. Should Java treat them as the same key?

import java.util.HashMap;
import java.util.Objects;

public class HashMapCustomKeysPart04 {

        static class Student {
            private final int id;
            private final String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }

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
                return "Student{id=" + id + ", name='" + name + "'}";
            }
        }

        public static void main(String[] args) {

            HashMap<Student, String> students = new HashMap<>();

            Student s1 = new Student(101, "Saurav");
            Student s2 = new Student(102, "Rahul");
            Student s3 = new Student(101, "Saurav Kumar");

            students.put(s1, "Java");
            students.put(s2, "SQL");

            System.out.println("Initial map: " + students);

            System.out.println("s1 equals s3: " + s1.equals(s3));
            System.out.println("s1 hashCode: " + s1.hashCode());
            System.out.println("s3 hashCode: " + s3.hashCode());

            // s3 has the same ID as s1, so it updates that mapping
            students.put(s3, "Spring Boot");

            System.out.println("After putting s3: " + students);
            System.out.println("Map size: " + students.size());

            // A newly created object can retrieve the mapping too
            Student searchKey = new Student(101, "Another Name");

            System.out.println("Value for ID 101: " + students.get(searchKey));
            System.out.println("Contains ID 102: "
                    + students.containsKey(new Student(102, "Different Name")));
    }
}

// Output: The order of entries in the map may vary.

// Initial map: {Student{id=101, name='Saurav'}=Java, Student{id=102, name='Rahul'}=SQL}
// s1 equals s3: true
// s1 hashCode: 101
// s3 hashCode: 101
// After putting s3: {Student{id=101, name='Saurav'}=Spring Boot, Student{id=102, name='Rahul'}=SQL}
// Map size: 2
// Value for ID 101: Spring Boot
// Contains ID 102: true

// 3. How does this work? ->

// Step 1: hashCode() -> Java uses the hash code to help locate the bucket where a key belongs.
// Step 2: equals() -> When necessary, Java checks equality between keys that may occupy the same bucket.
// Step 3: Update the mapping -> Because s1 and s3 have the same ID, equals() returns true.
// The new value replaces the old value for that logical key.

// 4. Remember the contract:

// 1. If two objects are equal according to equals(), they must return the same hashCode().
// 2. Two unequal objects may have the same hash code. This is called a hash collision.
// 3. A good key should not change the fields used by equals() and hashCode() while it is stored in the map.
// 4. In this example, equality depends only on id, not name.