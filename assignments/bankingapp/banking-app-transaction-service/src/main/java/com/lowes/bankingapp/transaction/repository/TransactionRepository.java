package com.lowes.bankingapp.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lowes.bankingapp.transaction.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	//public List<Customer> findByName(String name);

	//public List<Customer> findByPrimeAndLocation(boolean prime, String location);

}
