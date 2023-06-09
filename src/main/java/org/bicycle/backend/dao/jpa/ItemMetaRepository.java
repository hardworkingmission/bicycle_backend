package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.ItemMeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMetaRepository extends JpaRepository<ItemMeta, Long> {
}
