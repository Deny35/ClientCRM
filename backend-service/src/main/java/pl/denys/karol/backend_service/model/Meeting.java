package pl.denys.karol.backend_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String topic;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
