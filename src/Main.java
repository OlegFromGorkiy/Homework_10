public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstname = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstname + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("***\n");
        task_2(fullName);
        task_3(fullName);
        //System.out.println(fullName);
    }

    static void task_2(String str) {
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + str.toUpperCase());
        System.out.println("***\n");
    }

    static void task_3(String str) {
        System.out.println("Задание 3");
        str = str.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + str);
        System.out.println("***\n");
    }
}