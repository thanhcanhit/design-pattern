package fit.iuh.no_design;

public class Chief extends Leader {
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