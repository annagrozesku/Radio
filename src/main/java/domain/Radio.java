package domain;

public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;
    private int maxRadioStationNumber;

    private int maxSoundVolume;

    public Radio() {
        this.maxRadioStationNumber = 9;
        this.maxSoundVolume = 100;
    }

    public Radio(int numberOfRadioStation) {
        this.maxRadioStationNumber = numberOfRadioStation - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void setPrevRadioStationNumber() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentSoundVolume(int newSoundVolume) {
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setIncreaseSoundVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void setLowSoundVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}


