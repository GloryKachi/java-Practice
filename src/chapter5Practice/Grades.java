package chapter5Practice;
/*5.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’;
student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.*/

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's name or -1 to quit:");
        String studentName = input.nextLine();

        int sentinel = -1;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int lazyStudentGrade = 0;
        int grade = 0;
        int gradeCounter = 0;




        while (grade != sentinel){
            System.out.println("Enter student's grade or -1 to quit: ");
            grade = input.nextInt();
            gradeCounter++;

            switch (grade/10){
                case 10:
                case 9:
                    gradeA++;
                    break;
                case 8:
                case 7:
                    gradeB++;
                    break;
                case 6:
                case 5:
                    gradeC++;
                    break;
                case 4:
                    gradeD++;
                default:
                    lazyStudentGrade++;
                    break;

            }

        }
        System.out.printf("%d were entered %n%d students scored A%n%d students scored B %n%d students scored C%n%d students scored D" +
                "%n%d students failed the course",gradeCounter,gradeA,gradeB,gradeC,gradeD,lazyStudentGrade);



    }
}
