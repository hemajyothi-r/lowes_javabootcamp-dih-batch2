package com.lowes.bankingapp.fundtransfer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.Param;

import com.lowes.bankingapp.fundtransfer.model.FundTransfer;

public interface FundTransferRepository extends JpaRepository<FundTransfer, Integer> {

	//public List<FundTransfer> findByName(String name);

	//public List<FundTransfer> findByPrimeAndLocation(boolean prime, String location);

//	@Query("select e from Customer e where e.location = :location")
//	public List<Customer> findByTypeQuery(@Param("location") String location);
}
