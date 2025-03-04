package fit.iuh.no_design;

public class Leader extends Employee {
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