public class Employee extends WorkingPersonal {
    private String name;
    private String surname;
    private int age;
    private String position;
    private int experience;
    private int salary;
    private int bonus;

    public Employee(String name, String surname, int age, String position, int experience, int salary){
        setName(name);
        setSurname(surname);
        setAge(age);
        setPosition(position);
        setExperience(experience);
        setSalary(salary);
    }

    public void printInfo(){
        System.out.println("Інформація про працівника:");
        System.out.println("Ім'я та прізвище: " + getName() + " " + getSurname());
        System.out.println("Вік: " + getAge());
        System.out.println("Посада: " + getPosition());
        System.out.println("Досвід роботи: " + getExperience());
        System.out.println("Зарплата: " + getSalary() + " + бонус: " + getBonus() + "₴");
    }
    public void setName(String value){
        this.name = value;
    }
    public String getName(){
        return this.name;
    }

    public void setSurname(String value){
        this.surname = value;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setPosition(String value){
        this.position = value;
    }
    public String getPosition(){
        return this.position;
    }

    public void setAge(int value){
        this.age = value;
    }
    public int getAge(){
        return this.age;
    }

    public void setExperience(int value){
        this.experience = value;
    }
    public int getExperience(){
        return this.experience;
    }

    public void setSalary(int value){
        this.salary = value;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setBonus(int value){
        this.bonus = value;
    }
    public int getBonus(){
        return this.bonus;
    }

    public void CalculateBonus(int value){
        setBonus(value * 10);
    }

}
