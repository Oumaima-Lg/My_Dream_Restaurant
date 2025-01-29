package ol.ma.My_Dream_Restaurant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // @Autowired
    // private OrderService orderService;

    // @Autowired
    // private AdminService adminService;

    // @PostMapping("/place")
    // public ResponseEntity<String> placeOrder(@RequestBody OrderRequest orderRequest) {
    //     // Logique pour transformer "orderRequest" en Customer, Order, et OrderItems
    //     Order order = orderService.placeOrder(orderRequest.getCustomer(), orderRequest.getItems(), orderRequest.getRestaurant());
    //     return ResponseEntity.ok("Commande passée avec succès ! ID de commande : " + order.getId());
    // }
   

    // @PutMapping("/admin/{orderId}/assign-delivery/{deliveryPersonId}")
    // public ResponseEntity<Order> assignOrder(
    //         @PathVariable Long orderId, @PathVariable Long deliveryPersonId) {
    //     return ResponseEntity.ok(adminService.assignOrderToDeliveryPerson(orderId, deliveryPersonId));
    // }
}

