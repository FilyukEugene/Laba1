public class Engineer extends Employee{
    private int countOfProject;

    public Engineer (String name, String surname, int age, int experience, int salary, int countOfProject){
        super(name,surname,age,"Інженер",experience,salary);
        setCountOfProject(countOfProject);
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Кількість проектів: " + getCountOfProject());
    }
    @Override
    public void CalculateBonus(int value){
        super.setBonus(value * 100);
    }
    public int getCountOfProject(){
        return this.countOfProject;
    }
    public void setCountOfProject(int value){
        this.countOfProject = value;
    }
}
