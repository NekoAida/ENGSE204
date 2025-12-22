package Lab5.Lab5_6;
import java.util.Scanner;

class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + this.title + " for " + this.duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + this.title + " with " + this.quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Lab5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Video Title: ");
        String vTitle = input.nextLine();

        System.out.print("Enter Video Duration: ");
        int vDuration = input.nextInt();
        input.nextLine(); // เคลียร์ Buffer

        System.out.print("Enter Audio Title: ");
        String aTitle = input.nextLine();

        System.out.print("Enter Audio Quality: ");
        String aQuality = input.nextLine();

        Video video = new Video(vTitle, vDuration);
        Processor.runProcessor(video);

        Audio audio = new Audio(aTitle, aQuality);
        Processor.runProcessor(audio);

        input.close();
    }
}