package Lab4.Lab4_11;
import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;

        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }

        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.fontSize = base.fontSize;
        this.darkMode = user.darkMode;
    }

    public void displaySettings() {
        System.out.println("Theme: " + this.theme + ", Size: " + this.fontSize + ", Dark: " + this.darkMode);
    }
}

public class Lab4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base Theme: ");
        String baseTheme = input.nextLine();

        System.out.print("Enter Base Font Size: ");
        int baseSize = input.nextInt();

        System.out.print("Enter Base Dark Mode (true/false): ");
        boolean baseDark = input.nextBoolean();

        input.nextLine();

        System.out.print("Enter User Theme: ");
        String userTheme = input.nextLine();

        System.out.print("Enter User Font Size: ");
        int userSize = input.nextInt();

        System.out.print("Enter User Dark Mode (true/false): ");
        boolean userDark = input.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseSize, baseDark);
        Configuration userConfig = new Configuration(userTheme, userSize, userDark);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();

        input.close();
    }
}