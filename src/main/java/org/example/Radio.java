package org.example;

public class Radio {
    private int currentVolume = 50;
    private int currentStadion = 0;
    private int Stadion = 10;
    public Radio(int Stadion) {
        this.Stadion = Stadion;
    }

    public Radio() {

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public int getCurrentStadion() {
        return currentStadion;
    }

    public void setCurrentStadion(int newStadion) {
        if (newStadion < (Stadion - 1) && newStadion >= 0) {
            currentStadion = newStadion;
        }
    }

    public void next() {
        if (currentStadion < (Stadion - 1)) {
            currentStadion++;
        } else {
            currentStadion = 0;
        }
    }

    public void prev() {
        if (currentStadion > 0) {
            currentStadion--;
        } else {
            currentStadion = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void increaseSilence() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
