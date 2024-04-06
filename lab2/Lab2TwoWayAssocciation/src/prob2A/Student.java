package prob2A;

import java.util.HashMap;

public class Student {
  private String name;
  private GradeReport report;

  public Student(String name) {
    if (name == null) throw new IllegalArgumentException("Name cannot be null.");
    this.name = name;
    this.report = new GradeReport(this);
  }

  public String getName() {
    return name;
  }

  public GradeReport getReport() {
    return report;
  }
}
