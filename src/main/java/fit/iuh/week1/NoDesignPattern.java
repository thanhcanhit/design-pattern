package fit.iuh.week1;

public class NoDesignPattern {
    class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        public void work() {
            System.out.println("Working");
        }
    }

    class Leader extends Employee {
    }

    class Chief extends Leader {

    }

    public static void main(String[] args) {

    }
}
