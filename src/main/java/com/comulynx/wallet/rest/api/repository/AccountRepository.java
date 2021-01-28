package com.comulynx.wallet.rest.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comulynx.wallet.rest.api.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Optional<Account> findAccountByCustomerId(String customerId);

	Optional<Account> findAccountByAccountNo(String customerId);

	Optional<Account> findAccountByCustomerIdOrAccountNo(String customerId, String accountNo);
	
	Optional<Account> findAccountByCustomerIdAndAccountNo(String customerId, String accountNo);
	
	Account findBalanceByCustomerIdAndAccountNo(String customerId, String accountNo);

	
	
	
	

}
