package ol.ma.My_Dream_Restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String date; // Format : YYYY-MM-DD

    @Column(nullable = false)
    private String time; // Format : HH:mm

    @Column(nullable = false)
    private int numberOfGuests; // Nombre de personnes

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer; // Relation avec le client

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant; // Relation avec le restaurant
}
