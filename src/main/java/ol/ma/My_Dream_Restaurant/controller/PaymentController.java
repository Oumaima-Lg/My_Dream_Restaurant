package ol.ma.My_Dream_Restaurant.controller;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    // @Autowired
    // private PaymentService paymentService;

    // @Autowired
    // private OrderService orderService;

    // @PostMapping("/pay/{orderId}")
    // public ResponseEntity<String> processPayment(
    //         @PathVariable Long orderId,
    //         @RequestParam double amount,
    //         @RequestParam String paymentMethod) {

    //     // Récupérer la commande
    //     Order order = orderService.getOrderById(orderId)
    //             .orElseThrow(() -> new RuntimeException("Commande introuvable avec ID : " + orderId));

    //     // Traiter le paiement
    //     Payment payment = paymentService.processPayment(order, amount, paymentMethod);

    //     return ResponseEntity.ok("Paiement effectué avec succès. ID de paiement : " + payment.getId());
    // }
}
