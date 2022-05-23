package configserver.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import configserver.client.entities.Subscription;

public interface SubRepo extends JpaRepository<Subscription, Long > {


}