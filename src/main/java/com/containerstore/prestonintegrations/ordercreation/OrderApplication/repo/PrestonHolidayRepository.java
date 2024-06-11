package com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity.PrestonHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface PrestonHolidayRepository extends JpaRepository<PrestonHoliday,Integer> {

    @Query("SELECT ph.holiday_date FROM holidays_preston ph")
    List<LocalDateTime> findAllDates();
}
