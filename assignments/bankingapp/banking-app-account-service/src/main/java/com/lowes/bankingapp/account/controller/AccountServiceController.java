package com.lowes.bankingapp.account.controller;

import javax.security.auth.login.AccountException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.bankingapp.account.exception.ResponseMessage;
import com.lowes.bankingapp.account.model.Account;
import com.lowes.bankingapp.account.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountServiceController {
	private static Logger log = LoggerFactory.getLogger(AccountServiceController.class);

	@Autowired
	AccountService accountService;

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id) throws AccountException {

		try {
			accountService.deleteAccount(id);

			// return new ResponseEntity<>("Account is deleted successsfully",
			// HttpStatus.OK);

			ResponseMessage response = new ResponseMessage("Success", "Account is deleted successfully");
			return ResponseEntity.created(null).body(response);
		} catch (AccountException e) {
			log.error("Account not found for id :: " + id);
			throw new AccountException(" Account not found for id :: " + id);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateAccount(@PathVariable("id") Integer id, @RequestBody Account account)
			throws AccountException {

		try {
			accountService.updateAccount(id, account);

			// return new ResponseEntity<>("Account is updated successsfully",
			// HttpStatus.OK);
			ResponseMessage response = new ResponseMessage("Success", "Account is updated successfully");
			return ResponseEntity.created(null).body(response);
		} catch (AccountException e) {
			log.error("Account not found for id :: " + id);
			throw new AccountException(" Account not found for id :: " + id);
		}

	}

	@PostMapping
	public ResponseEntity<Object> createAccount(@RequestBody Account account) throws AccountException {

		try {
			accountService.createAccount(account);

			// return new ResponseEntity<>("Account is created successfully",
			// HttpStatus.CREATED);

			ResponseMessage response = new ResponseMessage("Success", "Account is created successfully");
			return ResponseEntity.created(null).body(response);

		} catch (AccountException e) {
			log.error("Account could not be created ");
			throw new AccountException("Account could not be created ");
		}

	}

	@GetMapping
	public ResponseEntity<Object> getAccounts() throws InterruptedException, AccountException {
		log.info("Received request to list Accounts...");

		return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public Account getAccount(@PathVariable Integer id) throws AccountException {

		try {
			return accountService.getAccount(id);
		} catch (AccountException e) {
			log.error("Account not found for id :: " + id);
			throw new AccountException(" Account not found for id :: " + id);
		}

		// return accountService.getAccount(id);
	}
}
