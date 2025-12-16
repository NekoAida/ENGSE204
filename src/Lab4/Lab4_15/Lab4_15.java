package Lab4.Lab4_15;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int limit = maxMessages;
        int len = logs.length;
        int copyCount = (len > limit) ? limit : len;

        this.logMessages = new String[copyCount];

        int startIndex = len - copyCount;
        for (int i = 0; i < copyCount; i++) {
            this.logMessages[i] = logs[startIndex + i];
        }
    }

    public static void setPolicy(int max) {
        if (max <= 0) {
            System.out.println("Invalid policy.");
        } else {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        }
    }

    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < maxMessages) {
            String[] newLogs = new String[this.logMessages.length + 1];
            for (int i = 0; i < this.logMessages.length; i++) {
                newLogs[i] = this.logMessages[i];
            }
            newLogs[newLogs.length - 1] = message;
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + this.user + ", Logs: " + this.logMessages.length + " [");
        for (int i = 0; i < this.logMessages.length; i++) {
            System.out.print(this.logMessages[i]);
            if (i < this.logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Max Policy: ");
        if (input.hasNextInt()) {
            int max = input.nextInt();
            AuditRecord.setPolicy(max);
        }
        input.nextLine();

        System.out.print("Enter Username: ");
        String user = input.nextLine();
        AuditRecord rec = new AuditRecord(user);

        System.out.print("Enter number of commands (N): ");
        if (input.hasNextInt()) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Command or Log Message: ");
                String cmd = input.next();

                if (cmd.equals("SET_POLICY")) {
                    int val = input.nextInt();
                    AuditRecord.setPolicy(val);
                } else {
                    rec = rec.addMessage(cmd);
                }
            }
        }

        rec.displayLog();

        input.close();
    }
}