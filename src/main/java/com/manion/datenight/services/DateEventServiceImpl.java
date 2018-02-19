package com.manion.datenight.services;

import com.manion.datenight.domain.DateEvent;
import com.manion.datenight.repositories.DateEventRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service public class DateEventServiceImpl implements DateEventService {
    private  DateEventRepository dateEventRepository;

    public DateEventServiceImpl(DateEventRepository dateEventRepository) {
        this.dateEventRepository = dateEventRepository;
    }

    @Override
    public Set<DateEvent> getAllDateEvents() {
        final Set<DateEvent> dateEvents = new HashSet<>();
        dateEventRepository.findAll().iterator().forEachRemaining(dateEvents::add);
        return dateEvents;
    }
}
