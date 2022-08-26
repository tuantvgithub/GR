package com.example.minventorysheet.repository;

import com.example.minventorysheet.model.entity.InventorySheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventorySheetRepository extends JpaRepository<InventorySheetEntity, String> {
}
