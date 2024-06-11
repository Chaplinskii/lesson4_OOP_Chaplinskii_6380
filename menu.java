package less4;


import less4.service.MenuService;

import java.util.Scanner;

public class menu {

    MenuService menuService = new MenuService();

    public void menu() {
        String x = startMenu();
        if (x.equals("1")) {

            System.out.println(menuService.createTeacher());
        }
        if (x.equals("2")) {
            System.out.println(menuService.searchTeacher());
        }
        if (x.equals("3")) {
            menuService.changeTeacher();
        }
        if (x.equals("4")){
            menuService.deleteTeacher();
        }
        if (x.equals("5")) {
            System.out.println(menuService.printAll());
        }
        if (x.equals("0")) {
            System.exit(0);
        }

    }

    public String startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Возможные действия" + "\n" +
                "1- Создать нового Учителя, 2- Найти Учителя,3- Изменить Учителя,4- Удалить Учителя, 5- Распечатать всех Учителей, 0 - Exit");
        System.out.println("Выберите нужное действие:");
        String action = scanner.next();
//        System.out.println(action);
        return action;
    }

}
