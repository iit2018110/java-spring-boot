package org.example;

public interface IUserService {
    User findUsers(String userId);


    default String sayHi() {
        Integer i1 = 5;
        return "HI";
    }

}
