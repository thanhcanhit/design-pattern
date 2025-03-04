package fit.iuh.no_design;

public class Employee {
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