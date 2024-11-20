package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

	private Long id;
    private Long userId;
    private Long doctorId;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String status;
	
}
