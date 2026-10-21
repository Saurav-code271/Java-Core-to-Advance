package OOPs.p05_inheritance;

interface Camera09 {
    void takePhoto();
}
interface MusicPlayer09 {
    void playMusic();
}
class Phone09 implements Camera09, MusicPlayer09 {
    public void takePhoto() {
        System.out.println("Photo captured");
    }
    public void playMusic() {
        System.out.println("Music playing");
    }
}
public class MultipleInheritanceThroughInterfaces09 {
    public static void main(String[] args) {
        Phone09 p = new Phone09();
        p.takePhoto();
        p.playMusic();
    }
}

//Output:

//Photo captured
//Music playing

// 1. Key point: Java does not support multiple inheritance of classes, but a class can implement multiple interfaces.