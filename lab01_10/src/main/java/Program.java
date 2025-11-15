import java.util.Scanner;

public class Program {


    private User[] dataBase;
    private int usersCount;

    public Program() {
        this.dataBase = new User[100];
        dataBase[0] = new User("Insaf", "qwerty", Role.ADMIN);
        dataBase[1] = new User("Rinat", "qwerty", Role.ADMIN);
        dataBase[2] = new User("Anya", "qwerty", Role.ADMIN);
        dataBase[3] = new User("Danya", "qwerty", Role.USER);
        usersCount = 4;
    }

    public void run() {
        User result = signIn();
        if(result == null) {
            System.out.println("Вы ввели неправильный логин или пароль");
            return;
        }
        Work work = new Work(result);
        work.showMenu();
    }

    private User signIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Авторизация");
        System.out.println("Введите имя пользователя: ");
        String username = scanner.next();
        System.out.println("Введите пароль: ");
        String password = scanner.next();
        return checkUser(username, password);
    }

    private User checkUser(String user, String password) {
        for (int i = 0; i < usersCount; i++) {
            if(dataBase[i].getLogin().equals(user) && dataBase[i].checkPassword(password)) {
                return dataBase[i];
            }
        }
        return null;
    }


}
