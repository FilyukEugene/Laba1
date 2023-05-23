public class Administration extends WorkingPersonal{
    private int numberOfEmployee;
    private int averageSalary;

    public Administration(int numberOfEmployee, int averageSalary){
        setNumberOfEmployee(numberOfEmployee);
        setAverageSalary(averageSalary);
    }
    public void printInfo(){
        System.out.printf("Інформація про адміністрацію:");
        System.out.printf("Кількість працівників: " + getNumberOfEmployee());
        System.out.printf("Середня зарплатня працівників: " + getAverageSalary());
    }
    public void setNumberOfEmployee(int value){
        this.numberOfEmployee = value;
    }
    public int getNumberOfEmployee(){
        return this.numberOfEmployee;
    }

    public void setAverageSalary(int value){
        this.averageSalary = value;
    }
    public int getAverageSalary(){
        return this.averageSalary;
    }
}
