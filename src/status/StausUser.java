package status;

public class StausUser {

    public void statusDetail(Status.UserStatus status) {
        switch (status) {
            case REJECTED:
                System.out.println("User status: REJECTED");
                break;
            case PENDING:
                System.out.println("User status: PENDING");
                break;
            case PROCESSING:
                System.out.println("User status: PROCESSING");
                break;
            case APPROVED:
                System.out.println("User status: APPROVED");
                break;
            default:
                System.out.println("NOT A VALID STATUS");
                break;
        }
    }
}
