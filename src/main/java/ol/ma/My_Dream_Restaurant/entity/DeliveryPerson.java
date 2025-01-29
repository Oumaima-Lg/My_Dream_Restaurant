package ol.ma.My_Dream_Restaurant.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class DeliveryPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; 

    @Column(nullable = false, unique = true)
    private String email; 

    @Column(nullable = false)
    private String phone; 

    @Column(nullable = false)
    private String status; // Statut du livreur (ex: "Disponible", "Occupé")

    @OneToMany(mappedBy = "deliveryPerson", cascade = CascadeType.ALL)
    private List<Order> orders; // Liste des commandes livrées par ce livreur
}
 