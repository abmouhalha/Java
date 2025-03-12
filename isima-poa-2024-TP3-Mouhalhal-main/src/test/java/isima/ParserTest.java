package isima;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {
    private Parser parser;

    @BeforeEach
    public void setUp() {
        parser = new Parser("test.txt");
    }

    @Test
    public void testParseValidFile() throws Exception {
        createTestFile("1#2.3387128#48.8844176#Abbesses#PARIS-18EME#metro\n" +
                "2#2.3522219#48.856614#Châtelet#PARIS-1ER#metro");

        parser.parse();

        assertEquals(2, parser.getListMetroStop().size());
        assertEquals("Abbesses", parser.getListMetroStop().get(0).getNom());
    }

    @Test
    public void testParseInvalidLineFormat() {
        createTestFile("1#2.3387128#48.8844176#Abbesses#PARIS-18EME");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parser.parse();
        });

        String expectedMessage = "Invalid line: 1#2.3387128#48.8844176#Abbesses#PARIS-18EME";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testParseInvalidNumberFormat() {
        createTestFile("1#invalidLongitude#48.8844176#Abbesses#PARIS-18EME#metro");

        Exception exception = assertThrows(NumberFormatException.class, () -> {
            parser.parse();
        });

        assertTrue(exception.getMessage().contains("For input string: \"invalidLongitude\""));
    }

    // Méthode utilitaire pour créer un fichier de test
    private void createTestFile(String content) {
        Path path = Paths.get("test.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Nouvelle méthode de configuration pour les tests de tri
    private void setUpForSorting() {
        parser = new Parser("dummyPath");
        parser.listMetroStop = Arrays.asList(
                new MetroStop(3, 2.334567, 48.845678, "A", "Paris-12", "metro"),
                new MetroStop(1, 2.335678, 48.846789, "B", "Paris-13", "metro"),
                new MetroStop(2, 2.336789, 48.847890, "C", "Paris-14", "metro")
        );
    }

    @Test
    public void testSortMetroStopsById() {
        setUpForSorting();
        parser.sortMetroStopsById();

        List<MetroStop> sortedList = parser.listMetroStop;
        assertEquals(1, sortedList.get(0).getId());
        assertEquals(2, sortedList.get(1).getId());
        assertEquals(3, sortedList.get(2).getId());
    }
}

