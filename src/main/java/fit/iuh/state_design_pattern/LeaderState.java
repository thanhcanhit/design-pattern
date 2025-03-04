package fit.iuh.state_design_pattern;


class LeaderState implements RoleState {

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