package Homework4;

public class exercise2 {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Сидоров", "899933331");
        phonebook.add("Петров", "899933332");
        phonebook.add("Иванов", "899933333");
        phonebook.add("Гончаров", "899933334");
        phonebook.add("Реутов", "899933335");
        phonebook.add("Кондрашев", "899933336");
        System.out.println("-----------------");

        System.out.println("Проверка номера");
        System.out.println("Гончаров");
        System.out.println(phonebook.get("Гончаров"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Кондрашев");
        System.out.println(phonebook.get("Кондрашев"));
        System.out.println("-----------------");

        System.out.println("Запись отсутствует");
        System.out.println("Зарудин");
        System.out.println(phonebook.get("Зарудин"));
        System.out.println("-----------------");

        System.out.println("Записать существующего номера");
        phonebook.add("Реутов", "899933335");
        System.out.println("Реутов");
        System.out.println(phonebook.get("Реутов"));
    }
}
