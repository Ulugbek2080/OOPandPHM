package org.example;

public class Radio {
    public int currentVolume = 50;
    public int currentStadion = 5;

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
        if (newStadion <= 9 && newStadion >= 0) {
            currentStadion = newStadion;
        }
    }

    public void next() {
        if (currentStadion < 9) {
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
