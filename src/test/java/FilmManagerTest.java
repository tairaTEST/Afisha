import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void Adding() {
        FilmManager manager = new FilmManager();
        manager.add("California");
        String[] expected = {"California"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddingMultiple() {
        FilmManager manager = new FilmManager();
        manager.add("Ankara");
        manager.add("Baghdad");
        manager.add("California");
        manager.add("Dollar");
        manager.add("Florence");

        String[] expected = {"Ankara", "Baghdad", "California", "Dollar", "Florence"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddingZero() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddingLast() {
        FilmManager manager = new FilmManager();
        manager.add("Ankara");
        manager.add("Baghdad");
        manager.add("California");
        manager.add("Dollar");
        manager.add("Florence");

        String[] expected = {"Florence", "Dollar", "California", "Baghdad","Ankara"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddingMoreLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Ankara");
        manager.add("Baghdad");
        manager.add("California");
        manager.add("Dollar");
        manager.add("Florence");
        manager.add("Gorgias");

        String[] expected = {"Ankara", "Baghdad", "California", "Dollar", "Florence","Gorgias"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddingLessLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Ankara");
        manager.add("Baghdad");
        manager.add("California");

        String[] expected = {"California", "Baghdad","Ankara"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
