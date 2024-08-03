package org.example.pattern.builder;


public class Student {
    private String name;
    private Integer age;
    private Integer roll;
    private String id;

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.roll = builder.roll;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private Integer age;
        private Integer roll;
        private String id;

        public Builder() {}

        public static Builder getInstance() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder roll(Integer roll) {
            this.roll = roll;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
