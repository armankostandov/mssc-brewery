package ru.foreverjun.msscbrewery.web.services;

import org.springframework.stereotype.Service;
import ru.foreverjun.msscbrewery.web.model.BeerDto;
import ru.foreverjun.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
