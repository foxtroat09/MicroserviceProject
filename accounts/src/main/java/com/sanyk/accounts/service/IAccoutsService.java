package com.sanyk.accounts.service;

import com.sanyk.accounts.DTO.CustomerDto;

public interface IAccoutsService {

    /**
     * @param  customerDto - CustomerDTO Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Inoput Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - customerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);
}
