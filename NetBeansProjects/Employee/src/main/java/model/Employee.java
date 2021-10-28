package model;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private String patronymic;
    private int yearOfBirth;
    private double salary;

    public Employee() {
    }    
    
    public Employee(String name, String lastName, String patronymic, int yeaOfBirth, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yeaOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYeaOfBirth() {
        return yearOfBirth;
    }

    public void setYeaOfBirth(int yeaOfBirth) {
        this.yearOfBirth = yeaOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.lastName);
        hash = 89 * hash + Objects.hashCode(this.patronymic);
        hash = 89 * hash + this.yearOfBirth;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.yearOfBirth != other.yearOfBirth) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.patronymic, other.patronymic)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee: " + "name-" + name + ", lastName-" + lastName + ", patronymic-" + patronymic + ", yearOfBirth-" + yearOfBirth + ", salary-" + salary;
    }
    
}
