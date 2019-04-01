package Devices;

public abstract class Devices {
    protected boolean on;
    protected int volume = 15;
    protected int channel = 1;

    abstract boolean isEnabled();

    abstract void isOn();

    abstract void isOff();

    abstract int getVolume();

    abstract void setVolume(int n);

    abstract int getChannel();

    abstract void setChannel(int n);

    abstract void statusDevice();

    abstract void power();

    abstract void volumeUp();

    abstract void volumeDown();

    abstract void channelUp();

    abstract void channelDown();


}
