package prob1;


public class Person {

    private final String name;

    Person(String n) {
        name = n;
    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) return false;
        if (!(aPerson instanceof Person p)) return false;
        boolean isEqual = this.name.equals(p.name);
        return isEqual;
    }

}
