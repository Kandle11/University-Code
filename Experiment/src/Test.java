abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
}
class Light extends Device {
    void turnOn() { System.out.println("灯已打开"); }
    void turnOff() { System.out.println("灯已关闭"); }
}
class Thermostat extends Device {
    void turnOn() { System.out.println("恒温器启动"); }
    void turnOff() { System.out.println("恒温器关闭"); }
}
class TV extends Device {
    void turnOn() { System.out.println("电视开机"); }
    void turnOff() { System.out.println("电视关机"); }
}
class RemoteControl {
    public void controlDevice(Device device) {
        device.turnOn();
        device.turnOff();
    }
}
public class Test {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.controlDevice(new Light());
        remote.controlDevice(new Thermostat());
        remote.controlDevice(new TV());
    }
}