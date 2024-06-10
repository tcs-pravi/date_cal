package com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StoreRepository extends JpaRepository<Store,String> {
    @Query("SELECT s.isPickup FROM Store s WHERE s.store_code = :store_code")
    Boolean findIsPickupByStoreCode(@Param("store_code") String storeCode);

    @Query("SELECT s.isPadTransit FROM Store s WHERE s.store_code = :storeCode")
    boolean findIsPadTransitByStoreCode(@Param("storeCode") String storeCode);



}
