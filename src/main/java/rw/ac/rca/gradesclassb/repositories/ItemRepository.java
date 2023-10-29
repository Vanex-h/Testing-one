package rw.ac.rca.gradesclassb.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.gradesclassb.models.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
    boolean existsByName(String name);
    Optional<Item> findByName(String name);
}