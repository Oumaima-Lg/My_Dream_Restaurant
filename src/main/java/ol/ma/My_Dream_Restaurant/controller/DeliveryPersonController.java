package ol.ma.My_Dream_Restaurant.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import ol.ma.My_Dream_Restaurant.service.AdminService;

@RestController
@RequestMapping("/admin/delivery-person")
public class DeliveryPersonController {

    // @Autowired
    // private AdminService adminService;

    // @PostMapping
    // public ResponseEntity<DeliveryPerson> addDeliveryPerson(@RequestBody DeliveryPerson deliveryPerson) {
    //     return ResponseEntity.ok(adminService.addDeliveryPerson(deliveryPerson));
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<DeliveryPerson> updateDeliveryPerson(
    //         @PathVariable Long id, @RequestBody DeliveryPerson deliveryPerson) {
    //     return ResponseEntity.ok(adminService.updateDeliveryPerson(id, deliveryPerson));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteDeliveryPerson(@PathVariable Long id) {
    //     adminService.deleteDeliveryPerson(id);
    //     return ResponseEntity.noContent().build();
    // }
}
