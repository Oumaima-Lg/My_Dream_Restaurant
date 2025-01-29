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
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column
    private double discountedPrice; // Prix promotionnel (si promotion en cours)

    @Column(nullable = false)
    private boolean isAvailable; // Disponibilité dans le menu

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant; // Chaque élément du menu appartient à un restaurant
}


