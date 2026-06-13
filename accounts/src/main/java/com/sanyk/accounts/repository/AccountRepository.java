package com.sanyk.accounts.repository;

import com.sanyk.accounts.AccountsApplication;
import com.sanyk.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
}
