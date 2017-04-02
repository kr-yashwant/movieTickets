package com.example.yash.repo;

import com.example.yash.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nfn8y on 01-04-2017.
 */
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
