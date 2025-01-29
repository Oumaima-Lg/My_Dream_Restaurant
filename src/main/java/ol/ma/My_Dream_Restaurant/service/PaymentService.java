package ol.ma.My_Dream_Restaurant.service;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.core.io.FileSystemResource;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// import java.time.LocalDateTime;

@Service
public class PaymentService {

  //   @Autowired
  //   private PaymentRepository paymentRepository;

  //   public Payment processPayment(Order order, double amount, String paymentMethod) {
  //       if (amount < order.getOrderItems().stream().mapToDouble(item -> item.getQuantity() * item.getMenuItem().getPrice()).sum()) {
  //           throw new IllegalArgumentException("Le montant payé est insuffisant !");
  //       }

  //       Payment payment = new Payment();
  //       payment.setAmount(amount);
  //       payment.setPaymentMethod(paymentMethod);
  //       payment.setStatus("COMPLETED"); // Dans un vrai projet, il faudrait vérifier le paiement avant
  //       payment.setPaymentDate(LocalDateTime.now());
  //       payment.setOrder(order);

  //       return paymentRepository.save(payment);
  //   }

  //   @GetMapping("/{paymentId}/receipt")
  //   public ResponseEntity<Resource> downloadReceipt(@PathVariable Long paymentId) {
  //       // Récupérer le reçu associé au paiement
  //       String receiptUrl = paymentService.getReceiptUrl(paymentId);

  //       // Charger le fichier
  //       File file = new File(receiptUrl);
  //       Resource resource = new FileSystemResource(file);

  //       return ResponseEntity.ok()
  //               .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName())
  //               .contentType(MediaType.APPLICATION_PDF)
  //               .body(resource);
  //   }

  //   public String getReceiptUrl(Long paymentId) {
  //     Payment payment = paymentRepository.findById(paymentId)
  //             .orElseThrow(() -> new RuntimeException("Paiement introuvable"));
  //     if (payment.getReceiptUrl() == null) {
  //         throw new RuntimeException("Reçu introuvable pour ce paiement");
  //     }
  //     return payment.getReceiptUrl();
  // }
}
