package com.containerstore.prestonintegrations.ordercreation.OrderApplication.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class BackwardDateCalculation {
    private TransitDaysCalculation transitDaysCalculation;
    private BackwardDateCalculator backwardDateCalculator;


    public void getBackwardPrestonHolidayDateCalculator(LocalDateTime AvailableDate, int zip, String StoreCode, int OrderDays)
    {
        BackwardDateCalculator calculator = new BackwardDateCalculator();
        LocalDateTime ShipDate = backwardDateCalculator.BackwardPrestonHolidayDateCalculator( AvailableDate,
                transitDaysCalculation.calculateTransitDays(zip, StoreCode)+transitDaysCalculation.calculatePadTransit(StoreCode));

        LocalDateTime OrderDate = backwardDateCalculator.BackwardVendorHolidayDateCalculator(ShipDate, OrderDays );




    }
}
