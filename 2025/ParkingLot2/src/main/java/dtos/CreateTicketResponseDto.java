package dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import models.Ticket;

@Getter
@Setter
@AllArgsConstructor
public class CreateTicketResponseDto {
    private Ticket ticket;
}
