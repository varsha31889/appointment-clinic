package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.AppointmentRequest;
import model.Slot;
import service.AppointmentService;


@RestController
@RequestMapping("/appointments")


public class AppointmentController {

	
	 @Autowired
	    private AppointmentService appointmentService;

	    @PostMapping("/book")
	    public ResponseEntity<String> bookAppointment(@RequestBody AppointmentRequest request) {
	        boolean isBooked = appointmentService.bookAppointment(request);
	        if (isBooked) {
	            return ResponseEntity.ok("Appointment booked successfully!");
	        } else {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to book appointment.");
	        }
	    }

	    @GetMapping("/slots")
	    public List<Slot> viewAvailableSlots() {
	        return appointmentService.getAvailableSlots();
	    }
}
