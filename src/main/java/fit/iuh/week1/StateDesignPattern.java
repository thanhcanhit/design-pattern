package fit.iuh.week1;

public class StateDesignPattern {
    static class EmployeeContext {
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

    interface RoleState {
        public void work();
        public void manage();
        public void makeDecision();
    }

    static class NormalEmployeeState implements RoleState {

        @Override
        public void work() {
            System.out.println("co the lam viec co ban");
        }

        @Override
        public void manage() {
            System.out.println("khong the quan li");
        }

        @Override
        public void makeDecision() {
            System.out.println("khong the dua ra quyet dinh");
        }
    }

    static class LeaderState implements RoleState {

        @Override
        public void work() {
            System.out.println("co the lam viec co ban");
        }

        @Override
        public void manage() {
            System.out.println("co the quan li");
        }

        @Override
        public void makeDecision() {
            System.out.println("khong the dua ra quyet dinh");
        }
    }

    static class ChiefState implements RoleState {

        @Override
        public void work() {
            System.out.println("co the lam viec co ban");
        }

        @Override
        public void manage() {
            System.out.println("co the quan li");
        }

        @Override
        public void makeDecision() {
            System.out.println("co the dua ra quyet dinh");
        }
    }

    public static void main(String[] args) {
        EmployeeContext emp = new EmployeeContext("Xuka", new NormalEmployeeState());
        EmployeeContext leader = new EmployeeContext("Nobita", new LeaderState());
        EmployeeContext chief = new EmployeeContext("Doraemon", new ChiefState());

        emp.displayAbilities();
        leader.displayAbilities();
        chief.displayAbilities();
    }
}
