package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(102);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void increaseVolumeLowMax() {
        Radio radio = new Radio();
        radio.setVolume(5);
        assertEquals(6, radio.increaseVolume());
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        assertEquals(100, radio.increaseVolume());
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void increaseVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(1, radio.increaseVolume());
        assertEquals(1, radio.getVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void decreaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(106);
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(55);
        assertEquals(54, radio.decreaseVolume());
        assertEquals(54, radio.getVolume());
    }

    @Test
    public void decreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        assertEquals(99, radio.decreaseVolume());
        assertEquals(99, radio.getVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMim() {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(0, radio.decreaseVolume());
        assertEquals(0, radio.getVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void decreaseVolumeLowMin() {
        Radio radio = new Radio();
        radio.setVolume(-5);
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getVolume());

    }

    @Test
    public void setVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(1002);
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void nextNumberStationlowMin() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        assertEquals(1, radio.nextNumberStation());
        assertEquals(1, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void nextNumberStationMoreMax() {
        Radio radio = new Radio();
        radio.setNumberStation(50);
        assertEquals(1, radio.nextNumberStation());
        assertEquals(1, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    public void nextNumberStationMax() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(0, radio.nextNumberStation());
        assertEquals(10, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    public void numberStationMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void numberStationMax() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    public void prevNumberStationLowMin() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        assertEquals(10, radio.prevNumberStation());
        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }
    @Test
    public void prevNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(6);
        assertEquals(5, radio.prevNumberStation());
    }

    @Test
    public void prevNumberStationMoreMax() {
        Radio radio = new Radio();
        radio.setNumberStation(20);
        assertEquals(10, radio.prevNumberStation());
    }

    @Test
    public void prevNumberStationMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        assertEquals(10, radio.prevNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void nextNumberStationMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        assertEquals(1, radio.nextNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void nextNumberStationLowMin() {
        Radio radio = new Radio();
        radio.setNumberStation(-20);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void setNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.setNumberStation(15);
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    public void setMinNumberStation() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void setMaxNumberStation() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }
}
