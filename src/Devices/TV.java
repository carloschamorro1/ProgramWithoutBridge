package Devices;

public class TV extends Devices{
    protected Devices devices;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void isOn() {
       on = true;
    }

    @Override
    public void isOff() {
       on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume <= 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void statusDevice() {
        System.out.println("");
        System.out.println(" TV" );
        System.out.println(" Estado: " + (devices.on ? "Encendido" : "Apagado"));
        System.out.println(" Volumen actual: " + devices.getVolume());
        System.out.println(" Canal actual: " + devices.getChannel());
        System.out.println("\t \t Informacion terminada");

    }


    public TV(){

    }

    public TV(Devices devices){
        this.devices = devices;
    }

    @Override
    public void power() {
        System.out.println("Boton power presionado");
        if(devices.isEnabled()){
            devices.isOff();
            System.out.println("Televisor Apagado");
        } else {
            devices.isOn();
            System.out.println("Televisor Encendido");
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Subiendo volumen");
        devices.setVolume(devices.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Bajando volumen");
        devices.setVolume(devices.getVolume() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Canal siguiente");
        devices.setChannel(devices.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Canal anterior");
        devices.setChannel(devices.getChannel() - 1);
    }


}
