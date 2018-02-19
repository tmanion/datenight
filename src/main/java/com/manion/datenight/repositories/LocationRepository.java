package com.manion.datenight.repositories;

import com.manion.datenight.domain.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
