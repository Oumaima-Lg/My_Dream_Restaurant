package ol.ma.My_Dream_Restaurant.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String orderDate; // Format : YYYY-MM-DD
    // @Column(nullable = false)
    // private LocalDateTime orderDate; // Date de la commande

    @Column(nullable = false)
    private String status; // Exemple : "Pending", "In Delivery", "Completed", "Paid", "Cancelled"

    @ManyToOne
    @JoinColumn(name = "delivery_person_id")
    private DeliveryPerson deliveryPerson; // Livreur associé à la commande

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer; // Client ayant passé la commande

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant; // Relation avec le restaurant

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems; // Contient les détails des éléments commandés

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private Payment payment; // Un seul paiement pour une commande

}
 