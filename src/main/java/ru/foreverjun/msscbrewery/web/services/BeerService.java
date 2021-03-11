package ru.foreverjun.msscbrewery.web.services;

import ru.foreverjun.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
