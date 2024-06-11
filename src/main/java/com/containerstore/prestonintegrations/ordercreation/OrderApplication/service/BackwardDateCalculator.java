package com.containerstore.prestonintegrations.ordercreation.OrderApplication.service;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo.PrestonHolidayRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BackwardDateCalculator {


    @Autowired
    private PrestonHolidayRepository prestonHolidayRepository;

    public LocalDateTime BackwardPrestonHolidayDateCalculator(LocalDateTime Date, int totalNumberOfDays) {

        var lst_preston_holiday = prestonHolidayRepository.findAllDates();
        for (int i = 0; i <= totalNumberOfDays; i++) {
            if (Date.getDayOfWeek().toString().equals("SUNDAY")  || Date.getDayOfWeek().toString().equals("SATURDAY")) {
                i = i - 1;
                System.out.println(Date);
            } else for (LocalDateTime x : lst_preston_holiday) {
                if (x.getDayOfYear() == Date.getDayOfYear()) {
                    i = i - 1;
                    System.out.println(Date);
                }
            }
            Date = Date.minusDays(1);

        }
        return Date;
    }


    public LocalDateTime BackwardVendorHolidayDateCalculator(LocalDateTime Date, int totalNumberOfDays) {
        var lst_vendor_holiday = prestonHolidayRepository.findAllDates();

        for (int i = 0; i <= totalNumberOfDays; i++) {
            if (Date.getDayOfWeek().toString().equals("SUNDAY")  || Date.getDayOfWeek().toString().equals("SATURDAY")) {
                i = i - 1;
                System.out.println(Date);
            } else for (LocalDateTime x : lst_vendor_holiday) {
                if (x.getDayOfYear() == Date.getDayOfYear()) {
                    i = i - 1;
                    System.out.println(Date);
                }
            }
            Date = Date.minusDays(1);

        }
        return Date;

    }
}


