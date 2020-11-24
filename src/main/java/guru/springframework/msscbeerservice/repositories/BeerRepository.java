package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

    Optional<Beer> findByUpc(String upc);

    Page<Beer> findByBeerStyle(String beerStyle, Pageable pageRequest);

    Page<Beer> findByBeerName(String beerName, Pageable pageRequest);

    Page<Beer> findByBeerNameAndBeerStyle(String beerName, String beerStyle, Pageable pageRequest);
}
