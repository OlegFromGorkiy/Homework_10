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
        task_5(fullName);
        fullName = "ivanov ivan ivanovich";
        task_6(fullName);
        task_7();
        task_8();
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

    static void task_5(String str) {
        System.out.println("Задание 5");
        String firstName = str.substring(str.indexOf(" "), str.lastIndexOf(" "));
        String lastName = str.substring(0, str.indexOf(" "));
        String middleName = str.substring(str.lastIndexOf(" "), str.length() - 1);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println("***\n");
    }

    static void task_6(String str) {
        System.out.println("Задание 6");
        StringBuilder sb = new StringBuilder();
        String[] strAsArray = str.split(" ");
        for (int i = 0; i < strAsArray.length; i++) {
            char[] charArray = strAsArray[i].toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            sb.append(new String(charArray));
            if (i != strAsArray.length - 1) sb.append(" ");
        }
        System.out.println(sb);
        System.out.println("***\n");
    }

    static void task_7() {
        System.out.println("Задание 7");
        String s1 = "13579";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        int lngt;
        if (s1.length() >= s2.length()) {
            lngt = s1.length();
        } else {
            lngt = s2.length();
        }
        for (int i = 0; i < lngt; i++) {
            if (i < s1.length()) sb.append(s1.charAt(i));
            else sb.append(" ");
            if (i < s2.length()) sb.append(s2.charAt(i));
            else sb.append(" ");
        }

        System.out.println(sb);
        System.out.println("***\n");
    }

    static void task_8() {
        String input = "aabccddefgghiijjkk";
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                sb.append(chars[i]);
                i++;
            }
        }
        System.out.println(sb);
        System.out.println("***\n");
    }
}