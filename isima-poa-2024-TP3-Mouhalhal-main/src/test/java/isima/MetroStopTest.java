package isima;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MetroStopTest {

    @Test
    public void testMetroStopConstructor() {
        MetroStop stop = new MetroStop(1975, 2.3387128, 48.8844176, "Abbesses", "PARIS-18EME", "metro");

        assertEquals(1975, stop.getId());
        assertEquals(2.3387128, stop.getLongitude(), 0.001);
        assertEquals(48.8844176, stop.getLatitude(), 0.001);
        assertEquals("Abbesses", stop.getNom());
        assertEquals("PARIS-18EME", stop.getArrondissement());
        assertEquals("metro", stop.getType());
    }

    @Test
    public void testMetroStopEquality() {
        MetroStop stop1 = new MetroStop(1, 1.0, 1.0, "A", "Paris-1", "metro");
        MetroStop stop2 = new MetroStop(1, 1.0, 1.0, "A", "Paris-1", "metro");

        assertEquals(stop1, stop2);
    }

    @Test
    public void testMetroStopToString() {
        MetroStop stop = new MetroStop(1, 2.3387128, 48.8844176, "Abbesses", "PARIS-18EME", "metro");
        String expected = "MetroStop{id=1, nom='Abbesses', arrondissement='PARIS-18EME', type='metro', longitude=2.3387128, latitude=48.8844176}";
        assertEquals(expected, stop.toString());
    }
}
