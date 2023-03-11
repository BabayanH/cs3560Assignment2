package ass2;



public interface SaleableItem {
    public void sellCopy();

public class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }

public class Magazine implements SaleableItem {
    private String title;
    
    public Magazine(String title) {
        this.title = title;
    }
    
    public void sellCopy() {
        System.out.println("Selling a copy of " + title + " magazine");
    }
}

public class Ticket implements SaleableItem {
    private String event;
    
    public Ticket(String event) {
        this.event = event;
    }
    
    public void sellCopy() {
        System.out.println("Selling a ticket for " + event);
    }
}
}
}