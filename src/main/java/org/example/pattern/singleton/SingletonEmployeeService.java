package org.example.pattern.singleton;

import java.util.Objects;

public class SingletonEmployeeService {

    private int salary;

    private volatile static SingletonEmployeeService instance;

    private SingletonEmployeeService() {}

    public static SingletonEmployeeService getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SingletonEmployeeService.class) {
                if (Objects.isNull(instance)) {
                    instance = new SingletonEmployeeService();
                }
            }
        }
        return instance;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer computeSalary(Integer basePay, Integer bonus) {
        return basePay + bonus;
    }
}
