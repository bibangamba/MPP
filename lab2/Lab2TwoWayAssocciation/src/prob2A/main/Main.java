package prob2A.main;

import prob2A.GradeReport;
import prob2A.Student;

public class Main {
  public static void main(String[] args) {
    Student s = new Student("Ben");
    s.getReport().setGrade("A");
    System.out.printf("Student: %s has grade: %s", s.getName(), s.getReport().getGrade());
  }
}
