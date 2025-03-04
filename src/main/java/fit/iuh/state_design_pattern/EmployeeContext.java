package fit.iuh.state_design_pattern;

public class EmployeeContext {
    String name;
    private RoleState role;

    EmployeeContext(String name, RoleState role) {
        this.name = name;
        this.role = role;
    }

    public void updateRole(RoleState role) {
        this.role = role;
    }

    public void displayAbilities() {
        System.out.println(this.name + " abilities: ");
        this.role.work();
        this.role.manage();
        this.role.makeDecision();
        System.out.println("----------------");
    }
}