public class Main {
    public static void main(String[] args) {
        Student insaf = new Student("Insaf", "11-503");
        Student rif = new Student("Rif", "11-503");


        Teacher kamilEnikeev = new Teacher("Kamil Enikeev");
        Teacher dinaDautova = new Teacher("Dina Dautova");
        Discipline informatics = new Discipline("informatics", kamilEnikeev);
        Discipline math = new Discipline("math", dinaDautova);
        Statement statementInsaf140125 = new Statement(informatics, insaf, "14.11.2025", "Самостоятельная работа", 4);
        Statement statementInsaf130125 = new Statement(math, insaf, "13.11.2025", "Контрольная работа", 4);
        Statement statementRif140125 = new Statement(informatics, insaf, "14.11.2025", "Контрольная работа", 5);
        Statement statementRif130125 = new Statement(math, insaf, "14.11.2025", "Домашняя работа", 3);
        System.out.println(insaf);
        System.out.println(rif);
    }
}
