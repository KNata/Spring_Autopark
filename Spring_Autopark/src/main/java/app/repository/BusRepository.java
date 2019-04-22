package app.repository;

import app.entity.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus, String> {
}
