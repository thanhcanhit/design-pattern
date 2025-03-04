package fit.iuh.state_design_pattern;

public class StateDesignPattern {
    public static void main(String[] args) {
        EmployeeContext emp = new EmployeeContext("Xuka", new NormalEmployeeState());
        EmployeeContext leader = new EmployeeContext("Nobita", new LeaderState());
        EmployeeContext chief = new EmployeeContext("Doraemon", new ChiefState());

        emp.displayAbilities();
        leader.displayAbilities();
        chief.displayAbilities();
    }
}
