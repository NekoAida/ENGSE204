package Lab3.Lab3_11;
import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return this.maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of commands (N): ");
        if (input.hasNextInt()) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Command (SET_URL, SET_MAX, SHOW): ");
                String command = input.next();

                SystemConfig config = SystemConfig.getInstance();

                if (command.equals("SET_URL")) {
                    System.out.print("Enter New URL: ");
                    String newUrl = input.next();
                    config.setServerUrl(newUrl);

                } else if (command.equals("SET_MAX")) {
                    System.out.print("Enter New Max Count: ");
                    int newMax = input.nextInt();
                    config.setMaxConnections(newMax);

                } else if (command.equals("SHOW")) {
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                }
            }
        }

        input.close();
    }
}