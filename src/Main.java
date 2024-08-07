public class Main {
    public static void main(String[] args) {


        // task 1
        System.out.println("task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);


        // task 2 (просто распечатать)
        System.out.println("task 2 (просто распечатать)");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());


        // task 2 (ввести отдельную переменную для написания заглавными буквами)
        System.out.println("task 2 (ввести отдельную переменную для написания заглавными буквами)");

        String UpperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + UpperCaseFullName);


        // task 2 (заменить строку)
        System.out.println("task 2 (заменить строку)");

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);


        // task 3
        System.out.println("task 3");

        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);


    }
}