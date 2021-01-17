package com.company;

import java.util.Calendar;

public class Employee {
    private String nameEmployee;
    private String positionEmployee;
    private String emailEmployee;
    private int numberEmployee;
    private int payEmployee;
    private int birdYear;

    public Employee( String nameEmployee, String positionEmployee, String emailEmployee, int numberEmployee,
                     int payEmployee, int old){
        this.nameEmployee = nameEmployee;
        this.positionEmployee = positionEmployee;
        this.emailEmployee = emailEmployee;
        this.numberEmployee = numberEmployee;
        this.payEmployee = payEmployee;
        this.birdYear = old;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public int getPayEmployee() {
        return payEmployee;
    }

    public int getOldEmployee() {
        int old = Calendar.YEAR - birdYear;
        return old;
    }
    
    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public void setPayEmployee(int payEmployee) {
        this.payEmployee = payEmployee;
    }

    private void setOld(int old) {
        this.birdYear = Calendar.YEAR - old;
    }
    @Override
    public String toString() {
        return "Имя сотрудника " + nameEmployee +
                ", Должность сотрудника " + positionEmployee +
                ", email сотрудника " + emailEmployee +
                ", Телефон сотрудника " + numberEmployee +
                ", Зарплата сотрудника " + payEmployee +
                ", Возраст сотрудника " + birdYear;
    }
}
