public class Program {


    private User[] dataBase;
    private int usersCount;

    public Program(User[] dataBase) {
        this.dataBase = new User[100];
        dataBase[0] = null;
        dataBase[1] = null;
        dataBase[2] = null;
        dataBase[3] = null;
        usersCount = 4;
    }

    public void run() {

    }

    public User signIn(String user) {
        for (int i = 0; i < usersCount; i++) {
            dataBase[i].getLogin();
        }
        return null;
    }

    public User checkUser(String login, String password) {
        return null;
    }


}
