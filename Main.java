public class Main {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
        // человек может иметь несколько телефонов.

        Ex1 ex1 = new Ex1();
        ex1.add();
        ex1.print();


        // Пусть дан список сотрудников:

        // Иван Иванов, Светлана Петрова,
        // Кристина Белова,
        // Анна Мусина,
        // Анна Крутова,
        // Иван Юрин,
        // Петр Лыков,
        // Павел Чернов,
        // Петр Чернышов,
        // Мария Федорова,
        // Марина Светлова,
        // Мария Савина,
        // Мария Рыкова,
        // Марина Лугова,
        // Анна Владимирова,
        // Иван Мечников,
        // Петр Петин,
        // Иван Ежов.

        // Написать программу, которая найдет и выведет повторяющиеся имена с
        // количеством повторений.
        // Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

        String[] people = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                            "Анна Мусина", "Анна Крутова", "Иван Юрин",
                            "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                            "Мария Федорова", "Марина Светлова", "Мария Савина",
                            "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                            "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Ex2 ex2 = new Ex2();
        ex2.countOfNames(people);

    }
}