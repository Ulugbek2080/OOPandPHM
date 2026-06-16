import org.example.Radio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void notRightStation() {
        int actual = radio.getCurrentStadion();
        radio.setCurrentStadion(10);
        radio.setCurrentStadion(-1);
        assertEquals(actual, radio.getCurrentStadion());
    }

    @Test
    void nextMakePlusOne() {
        radio.setCurrentStadion(3);
        radio.next();
        assertEquals(4, radio.getCurrentStadion());
    }

    @Test
    void nextMake0From9() {
        radio.setCurrentStadion(8);
        radio.next();
        radio.next();
        assertEquals(0, radio.getCurrentStadion());
    }


    @Test
    void prevMakeMinusOne() {
        radio.setCurrentStadion(5);
        radio.prev();
        assertEquals(4, radio.getCurrentStadion());
    }

    @Test
    void prevMake9From0() {
        radio.setCurrentStadion(8);
        radio.next();
        radio.next();
        radio.prev();
        assertEquals(9, radio.getCurrentStadion());
    }


    @Test
    void increaseVolumeNotBigger0() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeTest() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    void increaseSilenceNotLess0() {
        radio.setCurrentVolume(0);
        radio.increaseSilence();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseSilenceTest() {
        radio.setCurrentVolume(1);
        radio.increaseSilence();
        assertEquals(0, radio.getCurrentVolume());
    }
}

