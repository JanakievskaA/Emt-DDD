package mk.ukim.finki.emt.service.forms;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import mk.ukim.finki.emt.domain.model.Tip;
import mk.ukim.finki.emt.sharedkernel.domain.base.financial.Money;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
public class TicketForm {

    @Enumerated(EnumType.STRING)
    private Tip tip;
    private Money money;

    @Valid
    @NotEmpty
    private ClientForm clientForm;
}
