package prob1;

public class PersonWithJob {
    private final Person person;
    private final double salary;

    PersonWithJob(String n, double s) {
        this.person = new Person(n);
        salary = s;
    }

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }

    public double getSalary() {
        return salary;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object aPersonWithJob) {
        if (aPersonWithJob == null) return false;
        if (!(aPersonWithJob instanceof PersonWithJob p)) return false;
//        PersonWithJob p = (PersonWithJob) aPersonWithJob;
        boolean isEqual = this.person.getName().equals(p.getPerson().getName()) &&
                this.getSalary() == p.getSalary();
        return isEqual;
    }


}
