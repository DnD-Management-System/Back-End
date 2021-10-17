package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.charactersheet.InventorySheet;

@Repository("inventorySheetRepository")
public interface InventorySheetRepository extends JpaRepository<InventorySheet, Integer>{
	
}
