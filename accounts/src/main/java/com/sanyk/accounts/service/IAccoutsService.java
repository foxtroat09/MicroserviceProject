package com.sanyk.accounts.service;

import com.sanyk.accounts.DTO.CustomerDto;

public interface IAccoutsService {

    /**
     * @param  customerDto - CustomerDTO Object
     */
    void createAccount(CustomerDto customerDto);
}
