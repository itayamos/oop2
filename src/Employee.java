public class Employee extends Person {
    private String working;
    private int salary;

    public Employee(String working, int salary){
        this.working=working;
        this.salary=salary;
    }

    public void startWorking(){
        System.out.println("Make delivery");
    }

    @Override
    public String toString(){

        return super.toString() +"Employee{" +
                "working='" + working + '\'' +
                ", salary=" + salary +
                '}';
    }
}
