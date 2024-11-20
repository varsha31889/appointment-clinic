package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.AppointmentRequest;
import model.Slot;
import repository.SlotRepository;


@Service
public class AppointmentService {

	@Autowired
    private SlotRepository slotRepository;

    public boolean bookAppointment(AppointmentRequest request) {
        Slot slot = slotRepository.findById(request.getSlotId()).orElseThrow();
        if (slot.isAvailable()) {
            slot.setAvailable(false);
            slotRepository.save(slot);
            return true;
        }
        return false;
    }

    public List<Slot> getAvailableSlots() {
        return slotRepository.findByIsAvailable(true);
    }
	
}
