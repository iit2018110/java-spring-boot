package org.example.pattern.builder;

public class Employee {
    private String name;
    private String address;
    private Integer salary;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.salary = builder.salary;
    }

    public static class Builder {
        private String name;
        private String address;
        private Integer salary;

        public Builder() {}

        public static Builder getInstance() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder salary(Integer salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}


