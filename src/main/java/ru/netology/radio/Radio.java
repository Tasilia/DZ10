package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int numberOfRadioStations = 10;
    private int maxVolume = 100;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public Radio() {

    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > (numberOfRadioStations - 1)) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == (numberOfRadioStations - 1)) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber++;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = (numberOfRadioStations - 1);
            return;
        }
        currentRadioStationNumber--;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }
}
