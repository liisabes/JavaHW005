import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    Map<String, List<String>> map1 = new HashMap<>();

    void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во пользователей: ");
        String countOfPeople = scanner.nextLine();
        int cOfP = Integer.parseInt(countOfPeople);

        for (int i = 0; i < cOfP; i++) {
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();

            System.out.println("Введите кол-во телефонов: ");
            String countOfTel = scanner.nextLine();
            int cOfT = Integer.parseInt(countOfTel);

            List<String> list = new ArrayList<>();

            for (int j = 0; j < cOfT; j++) {
                System.out.println("Введите номер телефона: ");
                String tel = scanner.nextLine();
                list.add(tel);
            }

            map1.put(name, list);
        }
    }

    void print() {
        System.out.println(map1);
    }
}
