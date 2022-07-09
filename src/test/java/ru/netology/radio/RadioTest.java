package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/dataSetVolume.csv")
    public void shouldSetVolume(String test, int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newVolume);
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataIncreaseVolume.csv")
    public void shouldIncreaseVolume(String test, int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newVolume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataDecreaseVolume.csv")
    public void shouldDecreaseVolume(String test, int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newVolume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataSetRadioStationNumber.csv")
    public void shouldSetRadioStationNumber(String test, int newRadioStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(newRadioStationNumber);
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNext.csv")
    public void shouldSetNextRadioStationNumber(String test, int newRadioStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(newRadioStationNumber);
        radio.next();
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrev.csv")
    public void shouldSetPrevRadioStationNumber(String test, int newRadioStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(newRadioStationNumber);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
