package ol.ma.My_Dream_Restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double amount; // Montant payé

    @Column(nullable = false)
    private String paymentMethod; // Méthode de paiement (ex: "CREDIT_CARD", "PAYPAL", "CASH")

    @Column(nullable = false)
    private String status; // Statut du paiement (ex: "PENDING", "COMPLETED", "FAILED")

    @Column(nullable = false)
    private LocalDateTime paymentDate; // Date du paiement

    @Column
    private String receiptUrl; // URL ou chemin vers le fichier du reçu (PDF) OR receiptFile

    @OneToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order; // Relation avec la commande associée


}
