package HomeWork.Cafe.Department;

import HomeWork.Cafe.Cooker;

public class DepartmenHotDishes extends Department {
    public DepartmenHotDishes() {
        cookers = new Cooker[]{
                new Cooker("Pupkin", new String[]{"мясо", "картошка", "капуста", "морковь", "лук"}),
                new Cooker("Vasia", new String[]{"зажарка", "бульон", "начинка", "паста"}),
                new Cooker("Mania", new String[]{"тесто", "соус", "начинка",})

        };
    }
}