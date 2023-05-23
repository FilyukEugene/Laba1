public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Яна","Кобець", 20,1,12000,2);
        engineer.CalculateBonus(engineer.getCountOfProject());
        engineer.printInfo();
    }
}