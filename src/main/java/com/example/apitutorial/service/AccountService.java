package com.example.apitutorial.service;

import com.example.apitutorial.domain.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    Account findByUsername(String username);

    List<Account> getAccounts();
}
