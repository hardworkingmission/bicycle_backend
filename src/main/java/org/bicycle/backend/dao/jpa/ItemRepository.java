package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
