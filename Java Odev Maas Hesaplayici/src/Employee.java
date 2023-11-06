public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary > 1000){
            return (this.salary*0.03);
        }
        else{
            return 0;
        }
    }
    public double bonus(){

        if(this.workHours>40){
            return ((this.workHours-40)*30);

        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if((2021-hireYear)<10){
            return (this.salary*0.05);

        }
        else if((2021-hireYear)>9 && (2021-hireYear)<20){
            return (this.salary*0.1);
        }
        else if((2021-hireYear)>19){
            return (this.salary*0.15);
        }
        else{
            return 0;
        }
    }

    public String toString(){
        return "Adi : " + this.name + "\nMaasi :  " + this.salary + "\nCalisma Saati : " + this.workHours + "\nBaslangic Yili : " + this.hireYear
                + "\nVergi : " + tax()  + "\nBonus : " + bonus() + "\nMaas Artisi : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maas : " + (this.salary-tax()+bonus())
                + "\nToplam Maas : " + (this.salary-tax()+bonus()+raiseSalary());
    }
}
