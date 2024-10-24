package aws.demoelasticbeantalk.menu.repository;


import aws.demoelasticbeantalk.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepository extends JpaRepository<Menu, Long> {
}
