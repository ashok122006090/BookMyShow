package com.example.bmsbookticket.repositories;



import com.example.bmsbookticket.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Integer> {
    @Override
    Optional<Screen> findById(Integer integer);
}