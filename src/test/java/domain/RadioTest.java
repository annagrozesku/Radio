package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetRadioStationNumberLessZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberMoreNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumberNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.setNextRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumberZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.setNextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationNumberZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.setPrevRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationNumberNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.setPrevRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeMoreTen() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(11);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolumeTen() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeNine() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(9);

        int expected = 9;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeLessZero() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeZero() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeOne() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(1);

        int expected = 1;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseSoundVolumeFromNineToTen() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(9);

        volume.setIncreaseSoundVolume();

        int expected = 10;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseSoundVolumeToTen() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(10);

        volume.setIncreaseSoundVolume();

        int expected = 10;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowSoundVolumeFromOneToNull() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(1);

        volume.setLowSoundVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowSoundVolumeToNull() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(0);

        volume.setLowSoundVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
