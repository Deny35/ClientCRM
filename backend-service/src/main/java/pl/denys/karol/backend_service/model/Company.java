package pl.denys.karol.backend_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data // Generuje gettery, settery, toString, equals, hashCode
@NoArgsConstructor // Bezargumentowy konstruktor
@AllArgsConstructor // Konstruktor z wszystkimi polami
@Builder // Wspiera wzorzec projektowy "Builder"
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String city;
    private String zipCode;
    private Double latitude;
    private Double longitude;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContactPerson> contactPersons;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Meeting> meetings;
}