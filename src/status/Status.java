package status;

import java.util.Scanner;

public class Status {

    public enum UserStatus {
        REJECTED, PENDING, PROCESSING, APPROVED
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select the user status:");
        for (UserStatus status : UserStatus.values()) {
            System.out.println(status.ordinal() + " - " + status);
        }

        int code = in.nextInt();

        if (code >= 0 && code < UserStatus.values().length) {
            UserStatus selectedStatus = UserStatus.values()[code];

            StausUser t = new StausUser();
            t.statusDetail(selectedStatus);
        } else {
            System.out.println("Invalid status code. Please enter a valid number.");
        }
    }
}
