package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber++;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return;
        }
        currentRadioStationNumber--;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
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
