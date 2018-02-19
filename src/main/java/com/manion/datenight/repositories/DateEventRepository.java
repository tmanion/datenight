package com.manion.datenight.repositories;

import com.manion.datenight.domain.DateEvent;
import org.springframework.data.repository.CrudRepository;

public interface DateEventRepository extends CrudRepository<DateEvent, Long> {
}
