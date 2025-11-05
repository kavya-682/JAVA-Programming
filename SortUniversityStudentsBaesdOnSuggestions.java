/*
rt - Descending Order of GPA: Students with a higher GPA should come before those with a lower GPA.
Secondary Sort - Ascending Order of Age: If two students have the same GPA, the younger student should come first.
Tertiary Sort - Lexicographical Order of Name: If both GPA and Age are the same, sort the students alphabetically by their names.
Input Format
The first line contains a single integer N, the number of students. The next N lines each contain the details of a student in the following format:

Name Age GPA
Output Format
Print the sorted list of students, each on a separate line, in the following format:

Name Age GPA
Sample Inputs & Outputs
Sample Input 1

5
Alice 23 3.75
Bob 22 3.75
Charlie 23 3.90
David 21 3.75
Eve 22 3.90
Sample Output 1

Eve 22 3.90
Charlie 23 3.90
David 21 3.75
Bob 22 3.75
Alice 23 3.75
Sample Input 2

3
John 20 3.80
Doe 22 3.80
Anna 20 3.95
Sample Output 2

Anna 20 3.95
John 20 3.80
Doe 22 3.80

*/
package in.java;
import java.util.*;
public class SortUniversityStudentsBaesdOnSuggestions {

	static class Student {
        String name;
        int age;
        double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double gpa = sc.nextDouble();
            students.add(new Student(name, age, gpa));
        }

        students.sort((a, b) -> {
            if (Double.compare(a.gpa, b.gpa) != 0)
                return Double.compare(b.gpa, a.gpa); // Descending GPA
            else if (a.age != b.age)
                return Integer.compare(a.age, b.age); // Ascending Age
            else
                return a.name.compareTo(b.name); // Lexicographical
        });

        for (Student s : students) {
            System.out.printf("%s %d %.2f%n", s.name, s.age, s.gpa);
        }

        sc.close();
    }
	

}
