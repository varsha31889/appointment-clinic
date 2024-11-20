package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Slot;

@Repository

public interface SlotRepository extends JpaRepository<Slot, Long> {

	List<Slot> findByIsAvailable(boolean isAvailable);
	
}
