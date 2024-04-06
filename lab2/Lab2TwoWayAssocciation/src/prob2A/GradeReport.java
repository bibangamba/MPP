package prob2A;

public class GradeReport {
  private String grade;
  private Student student;

  GradeReport(Student student) {
    if (student == null) throw new IllegalArgumentException("Student cannot be null.");
    this.student = student;
  }

  public Student getStudent() {
    return student;
  }

  public String getGrade() {
    return this.grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
