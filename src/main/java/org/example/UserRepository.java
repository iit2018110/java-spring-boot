//package org.example;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(value = "select * from user where name in :name",
//            nativeQuery = true)
//    List<String> findByName(String name);
//
//}
