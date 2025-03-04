package fit.iuh.week1;

public class NoDesignPattern {
    // Class Employee cơ bản
    static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        public void work() {
            System.out.println(name + " co the lam viec co ban");
        }

        public void displayAbilities() {
            System.out.println("Kha nang cua " + name + " (Nhan vien):");
            work();
            System.out.println("----------------");
        }
    }

    // Class Leader kế thừa từ Employee
    static class Leader extends Employee {
        public Leader(String name) {
            super(name);
        }

        public void manage() {
            System.out.println(name + " co the quan ly nhom");
        }

        @Override
        public void displayAbilities() {
            System.out.println("Kha nang cua " + name + " (Truong nhom):");
            work();
            manage();
            System.out.println("----------------");
        }
    }

    // Class Chief kế thừa từ Leader
    static class Chief extends Leader {
        public Chief(String name) {
            super(name);
        }

        public void makeDecisions() {
            System.out.println(name + " co the dua ra quyet dinh chien luoc");
        }

        @Override
        public void displayAbilities() {
            System.out.println("Kha nang cua " + name + " (Truong phong):");
            work();
            manage();
            makeDecisions();
            System.out.println("----------------");
        }
    }

    public static void main(String[] args) {
        // Tạo các đối tượng với vai trò khác nhau
        Employee emp = new Employee("John");
        Leader leader = new Leader("Mary");
        Chief chief = new Chief("Peter");

        // In danh sách khả năng của từng người
        emp.displayAbilities();
        leader.displayAbilities();
        chief.displayAbilities();
    }
}