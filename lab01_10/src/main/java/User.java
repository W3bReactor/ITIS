public class User {
    private String login;
    private String password;
    private Role role;

    public Role getRole() {
        return role;
    }

//    public void setRole(Role role) {
//        this.role = role;
//    }

    public String getPassword() {
        return "*Пароль скрыт*";
    }

//    public void setPassword(String password) {
//        System.out.println("Пароль нельзя изменять");
//    }

    public String getLogin() {
        return login;
    }

//    public void setLogin(String login) {
//        this.login = login;
//    }

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
}
