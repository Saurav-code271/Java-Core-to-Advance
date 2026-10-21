package OOPs.p01_classes_and_objects;
// 1. An object's state can change when its methods are called.

class Fan07 {
    boolean isOn;

    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }
    void displayStatus() {
        System.out.println(isOn ? "Fan is ON" : "Fan is OFF");
    }
}
public class ObjectStateBehaviorDemo07 {
    public static void main(String[] args) {
        Fan07 fan = new Fan07();

        fan.displayStatus();
        fan.turnOn();
        fan.displayStatus();
        fan.turnOff();
        fan.displayStatus();
    }
}

// Output:

//Fan is OFF
//Fan is ON
//Fan is OFF

// 2. Concept: isOn represents state; turnOn(), turnOff(), and displayStatus() represent behavior.
