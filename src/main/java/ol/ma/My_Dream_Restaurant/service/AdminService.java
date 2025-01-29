package ol.ma.My_Dream_Restaurant.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import ol.ma.My_Dream_Restaurant.entity.DeliveryPerson;
// import ol.ma.My_Dream_Restaurant.entity.MenuItem;

@Service
public class AdminService {
  // //Gestion des livreurs

  //   @Autowired
  //   private DeliveryPersonRepository deliveryPersonRepository;

  //   @Autowired
  //   private OrderRepository orderRepository;

  //   @Autowired
  //   private MenuItemRepository menuItemRepository;

  //   // Ajouter un livreur
  //   public DeliveryPerson addDeliveryPerson(DeliveryPerson deliveryPerson) {
  //       return deliveryPersonRepository.save(deliveryPerson);
  //   }

  //   // Modifier un livreur
  //   public DeliveryPerson updateDeliveryPerson(Long id, DeliveryPerson updatedDeliveryPerson) {
  //       DeliveryPerson existing = deliveryPersonRepository.findById(id)
  //               .orElseThrow(() -> new RuntimeException("Livreur introuvable"));
  //       existing.setName(updatedDeliveryPerson.getName());
  //       existing.setEmail(updatedDeliveryPerson.getEmail());
  //       existing.setPhone(updatedDeliveryPerson.getPhone());
  //       existing.setStatus(updatedDeliveryPerson.getStatus());
  //       return deliveryPersonRepository.save(existing);
  //   }

  //   // Supprimer un livreur
  //   public void deleteDeliveryPerson(Long id) {
  //       deliveryPersonRepository.deleteById(id);
  //   }





  //   // Gestion des commandes

  //   // Associer une commande à un livreur
  //   public Order assignOrderToDeliveryPerson(Long orderId, Long deliveryPersonId) {
  //     Order order = orderRepository.findById(orderId)
  //             .orElseThrow(() -> new RuntimeException("Commande introuvable"));
  //     DeliveryPerson deliveryPerson = deliveryPersonRepository.findById(deliveryPersonId)
  //             .orElseThrow(() -> new RuntimeException("Livreur introuvable"));

  //     order.setDeliveryPerson(deliveryPerson);
  //     order.setStatus("In Delivery");
  //     return orderRepository.save(order);
  //   }




  //   // Gestion des articles du menu 

  //   // // Ajouter un article
  //   public MenuItem addMenuItem(MenuItem menuItem) {
  //       return menuItemRepository.save(menuItem);
  //   }

  //   // Modifier un article
  //   public MenuItem updateMenuItem(Long id, MenuItem updatedItem) {
  //       MenuItem existing = menuItemRepository.findById(id)
  //               .orElseThrow(() -> new RuntimeException("Article introuvable"));
  //       existing.setName(updatedItem.getName());
  //       existing.setDescription(updatedItem.getDescription());
  //       existing.setPrice(updatedItem.getPrice());
  //       existing.setDiscountedPrice(updatedItem.getDiscountedPrice());
  //       existing.setIsAvailable(updatedItem.isAvailable());
  //       return menuItemRepository.save(existing);
  //   }

  //   // Supprimer un article
  //   public void deleteMenuItem(Long id) {
  //       menuItemRepository.deleteById(id);
  //   }

}
