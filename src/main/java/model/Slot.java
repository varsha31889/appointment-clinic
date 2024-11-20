package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {

	private Long id;
    private Long doctorId;
    private LocalDate slotDate;
    private LocalTime slotTime;
    private boolean isAvailable;
	public boolean isAvailable() {                                                                                                                                 // extra
		// TODO Auto-generated method stub
		return false;
	}
	public void setAvailable(boolean b) {
		// TODO Auto-generated method stub       // extra
		
	}
	
}
