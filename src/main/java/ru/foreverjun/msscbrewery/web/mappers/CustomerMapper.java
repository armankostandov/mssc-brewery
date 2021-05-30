package ru.foreverjun.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import ru.foreverjun.msscbrewery.domain.Customer;
import ru.foreverjun.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
