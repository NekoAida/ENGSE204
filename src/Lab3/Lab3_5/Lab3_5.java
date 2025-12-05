package Lab3.Lab3_5;
import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (this.connected == false) {
            this.connected = true;
            System.out.println("Connected to " + this.connectionString);
        } else  {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (this.connected == true) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}
public class Lab3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Connection String: ");
        String connStr = input.nextLine();

        DatabaseConnection database = new DatabaseConnection(connStr);

        database.connect();
        database.disconnect();
        database.disconnect();

        System.out.println(database.isConnected());

        input.close();

    }
}
