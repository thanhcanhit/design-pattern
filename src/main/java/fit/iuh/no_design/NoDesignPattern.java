package fit.iuh.no_design;

public class NoDesignPattern {
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