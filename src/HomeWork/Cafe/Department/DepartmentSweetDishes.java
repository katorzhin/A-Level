package HomeWork.Cafe.Department;

import HomeWork.Cafe.Cooker;

public class DepartmentSweetDishes extends Department {
    public DepartmentSweetDishes() {
        cookers = new Cooker[]{
                new Cooker("Gordon Ramzi", new String[]{"шоколад", "яйцо", "мука"}),
                new Cooker("Alen Dukas", new String[]{"масло", "мука", "орех"})
        };
    }
}