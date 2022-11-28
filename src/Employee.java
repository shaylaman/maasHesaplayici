import java.util.Scanner;

public class Employee {
    int salary,workhours,overyear;
    String name;

    public Employee(String name,int salary,int workhours,int overyear){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.overyear=overyear;

    }
    public double tax(){
        if(salary<=1000){
        return 0 ;}
        else{
            return salary*0.03;
        }
    }
    public int bonus(){
        if(workhours<=40){
            return 0;
        }
        else {
            return (workhours-40)*30;
        }
    }
    public double raisesalary(){
        int year=2021;
        if(year-overyear <10){
            return salary*0.05;
        }
        else if(year-overyear<20){
            return salary*0.1;
        }
        else{ return salary*0.15;
        }

    }
    public String toString() {

        double totalSalary = salary - tax() + bonus() + raisesalary();
        double total       = salary - tax() + bonus();

        return  "Adı : " + name + '\n' +
                "Maaşı : " + salary + '\n' +
                "Çalışma Saati : " + workhours + '\n' +
                "Başlangıç Yılı : " + overyear + '\n' +
                "Vergi : " + tax() + '\n' +
                "Bonus : " + bonus() + '\n' +
                "Maaş Artışı : " + raisesalary() + '\n' +
                "Vergi ve Bonuslar ile Birlikte Maaş : " + total + '\n' +
                "Toplam Maaş : " + totalSalary;
    }
}

