package ru.netology;

public class Radio {
    private int numberStation;
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int nextNumberStation() {
        if (numberStation > maxNumberStation - 1) {
            return minNumberStation;
        }
        return ++numberStation;
    }

    public int prevNumberStation() {
        if (numberStation < minNumberStation + 1) {
            return maxNumberStation;
        }
        return --numberStation;
    }

    public void setNumberStation(int numberStation) {

        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }

        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int increaseVolume() {
        if (volume >= maxVolume) {
            return volume;
        }
        return ++volume;
    }

    public int decreaseVolume() {
        if (minVolume >= volume ) {
            return volume;
        }
        return --volume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > getMaxVolume()) {
            return;
        }
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}
