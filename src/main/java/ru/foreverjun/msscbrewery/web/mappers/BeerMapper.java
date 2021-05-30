package ru.foreverjun.msscbrewery.web.mappers;

import ru.foreverjun.msscbrewery.domain.Beer;
import ru.foreverjun.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
