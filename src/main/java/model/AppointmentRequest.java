package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentRequest {

	
	private Long userId;
    private Long doctorId;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    
    private Long slotId;  //extra

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

//	public Long getSlotId() {
//		// TODO Auto-generated method stub            // extra
//		return null;
//	}

	public void setSlotId(long l) {        // extra
		// TODO Auto-generated method stub
		
	}
	
	 public Long getSlotId() {
	        return slotId;
	    }

//	    public void setSlotId(Long slotId) {
//	        this.slotId = slotId;
//	    }     // extra 
	
}
