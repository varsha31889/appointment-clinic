package sample_TestNG_Test_Case;

import org.testng.Assert;
import org.testng.annotations.Test;

import model.AppointmentRequest;
import service.AppointmentService;

public class AppointmentServiceTest {


    @Test
    public void testBookAppointment() {
        AppointmentRequest request = new AppointmentRequest();
        request.setSlotId(1L);

        AppointmentService service = new AppointmentService();
        boolean isBooked = service.bookAppointment(request);

        Assert.assertTrue(isBooked, "Appointment booking failed!");
    }
}
