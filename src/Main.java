import Devices.*;


public class Main {

    public static void main(String[] args) {
        testTV(new TV());
        testHomeTheater(new HomeTheater());
    }


    public static void testTV(Devices devices) {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Prueba con televisor.");
        TV tv = new TV(devices);
        tv.power();
        tv.channelUp();
        tv.volumeUp();
        tv.statusDevice();
        System.out.println("----------------------------------------");
    }

    public static void testHomeTheater(Devices device) {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Prueba con teatro en casa.");
        HomeTheater homeTheater = new HomeTheater(device);
        homeTheater.power();
        homeTheater.statusDevice();
        System.out.println("----------------------------------------");
    }
}
