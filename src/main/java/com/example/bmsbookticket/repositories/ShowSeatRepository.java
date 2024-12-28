package com.example.bmsbookticket.repositories;




import com.example.bmsbookticket.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {
    @Override
    <S extends ShowSeat> S save(S entity);
}