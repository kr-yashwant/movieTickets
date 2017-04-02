package com.example.yash.service;

import com.example.yash.domain.Show;
import com.example.yash.domain.Ticket;
import com.example.yash.repo.ShowRepository;
import com.example.yash.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Service
public class TicketService {
    private ShowRepository showRepository;
    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(ShowRepository showRepository, TicketRepository ticketRepository) {
        this.showRepository = showRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(String showID, String viewerName, double price) {
        Show show = showRepository.findByShowID(showID);
        if(show == null) {
            throw new RuntimeException("There are no shows by this ID in our system. Please try again!");
        }
        else if(show.getStrength()==show.getCountSold()) {
            throw new RuntimeException("Sorry! The show is already full.");
        } else {
            show.setCountSold(show.getCountSold()+1);
            showRepository.save(show);
        }
        return ticketRepository.save(new Ticket(show, viewerName, price));
    }
}
