package Lessons7;

public class Test {
    public static void main(String[] args) {
        char partOfYear = 3;
        String partOfYearName;
        switch (partOfYear){
            case 1:partOfYearName="Зима";
            break;
            case 2:partOfYearName="Весна";
                break;
            case 3:partOfYearName="Лето";
                break;
            case 4:partOfYearName="Осень";
                break;
                default:partOfYearName= "Не знаем такого";
                break;

        }
        System.out.println(partOfYearName);
    }
}
