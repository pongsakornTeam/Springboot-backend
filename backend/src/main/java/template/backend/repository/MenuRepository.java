package template.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import template.backend.dao.MENU;

@Repository
public interface MenuRepository extends JpaRepository<MENU, Long>{

}
