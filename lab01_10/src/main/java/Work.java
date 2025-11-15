public class Work {
    private User user;

    public Work(User user) {
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        this.user = user;
    }

    public void showMenu() {
        if(user.getRole() == Role.ADMIN) {
            System.out.println("Меню администратора");
        } else {
            System.out.println("Меню пользователя");
        }
    }

}
