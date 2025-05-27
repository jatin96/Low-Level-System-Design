package controllers;

import dtos.CreateTicketRequestDto;
import dtos.CreateTicketResponseDto;
import lombok.AllArgsConstructor;
import models.Ticket;
import services.TicketService;

@AllArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    public CreateTicketResponseDto createTicket(CreateTicketRequestDto requestDto) {
        // do some validations here

        Ticket ticket = ticketService.createTicket(requestDto.getVehicle(), requestDto.getVehicleOwner(), requestDto.getEntryTime(), requestDto.getParkingLotId());
        return new CreateTicketResponseDto(ticket);
    }
}
