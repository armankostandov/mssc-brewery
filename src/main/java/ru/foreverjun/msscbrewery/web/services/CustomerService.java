package ru.foreverjun.msscbrewery.web.services;

import ru.foreverjun.msscbrewery.web.model.BeerDto;
import ru.foreverjun.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
}
