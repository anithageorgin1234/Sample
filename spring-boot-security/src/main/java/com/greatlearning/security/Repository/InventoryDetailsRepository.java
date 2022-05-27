package com.greatlearning.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.greatlearning.security.entity.InventoryDetails;

public interface InventoryDetailsRepository extends JpaRepository  <InventoryDetails,Long>{

}
