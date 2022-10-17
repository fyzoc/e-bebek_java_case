package project;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    static String name = "Ahmet";
    static double salary = 1200;
    static int workHours = 48;
    static int hireYear = 2014;
    public static void main(String[] args) {
        toString1();
        System.out.println("odeyecegi vergi = " + tax());
        System.out.println("kazandıgı bonus = " + bonus());
        System.out.println("maas artısı = " + raiseSalary());
    }
    public static double tax() {
        double tax = 0;
        if (salary < 1000) {
            return tax;
        } else if (salary > 1000) {
            tax = (salary * 3) / 100;
        }
        return tax;
    }
    public static double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            return ((workHours - 40) * 30)*4;
        } else {
        }
        return bonus;
    }
    public static double raiseSalary(){
        double raiseSalary;
        int currentYear= LocalDate.now().getYear();
        if(currentYear-hireYear<10){
            raiseSalary=(salary*5)/100;
            return raiseSalary;
        }
        else if(currentYear-hireYear>9&& currentYear-hireYear<20){
            raiseSalary=(salary*10)/100;
            return raiseSalary;
        }
        else if(currentYear-hireYear>19){
            raiseSalary=(salary*15)/100;
            return raiseSalary;
        }
        return raiseSalary();
    }
    public static void toString1(){
        double toplam_maas=salary+bonus()+raiseSalary();
        double vergili_toplam_maas=toplam_maas+tax();
        System.out.println("calisanin ismi:"+name);
        System.out.println("calisanin maasi:"+salary);
        System.out.println("haftalik calisma saati:"+workHours);
        System.out.println("ise basladigi yıl:"+hireYear);
        System.out.println("toplam maas:" + toplam_maas);
        System.out.println("vergili_toplam_maas:"+ vergili_toplam_maas);
    }
}