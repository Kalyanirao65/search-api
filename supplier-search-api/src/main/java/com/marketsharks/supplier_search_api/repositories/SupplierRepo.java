/**
 * 
 */
/**
 * @author kalyani
 *
 */
package com.marketsharks.supplier_search_api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.makersharks.supplier_search_api.entites.SupplierEntity;

@Repository
public interface SupplierRepo extends JpaRepository<SupplierEntity, Long> {
    @Query("SELECT s FROM SupplierEntity s WHERE s.location = ?1 AND s.nature_of_business = ?2 AND s.manufacturing_processes = ?3")
    Page<SupplierEntity> findByLocationAndNatureOfBusinessAndManufacturingProcesses(String location,
            String nature_of_business, String manufacturing_processes, Pageable pageable);
}