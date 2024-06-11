package com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity.PrestonHoliday;
import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity.VendorHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface VendorHolidayRepository extends JpaRepository<VendorHoliday,Integer> {

    @Query("SELECT ph.holiday_date FROM holidays_vendor ph")
    List<LocalDateTime> findAllDates();
}
