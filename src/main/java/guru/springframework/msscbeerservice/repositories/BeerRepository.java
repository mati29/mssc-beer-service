package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

    Page<Beer> findByBeerStyle(String beerStyle, Pageable pageRequest);

    Page<Beer> findByBeerName(String beerName, Pageable pageRequest);

    Page<Beer> findByBeerNameAndBeerStyle(String beerName, String beerStyle, Pageable pageRequest);
}
