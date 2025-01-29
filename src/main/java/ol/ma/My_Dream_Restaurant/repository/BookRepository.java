package ol.ma.My_Dream_Restaurant.repository;

import ol.ma.My_Dream_Restaurant.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title); 
}



// public interface BookRepository extends CrudRepository<Book, Long> {
//   List<Book> findByTitle(String title);
// }

// save(S entity) : Sauvegarder ou mettre à jour une entité.
// findById(ID id) : Trouver une entité par son ID.
// findAll() : Récupérer toutes les entités.
// deleteById(ID id) : Supprimer une entité par son ID.
// delete(S entity) : Supprimer une entité.


// Méthodes supplémentaires par rapport à CrudRepository :
// En plus des méthodes héritées de CrudRepository, JpaRepository propose :

// Pagination et tri :
// findAll(Pageable pageable) : Récupérer une liste paginée.
// findAll(Sort sort) : Récupérer une liste triée.
// Gestion en bloc :
// saveAll(Iterable<S> entities) : Sauvegarder plusieurs entités à la fois.
// deleteAllInBatch() : Supprimer toutes les entités en une seule opération.
// Vidage et gestion du cache :
// flush() : Synchroniser les données avec la base.
// saveAndFlush(S entity) : Sauvegarder et synchroniser immédiatement.
// Autres utilitaires comme getById(ID id) (différent de findById, car il ne charge pas l'entité entièrement).