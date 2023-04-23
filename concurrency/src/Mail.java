import java.util.concurrent.CompletableFuture;

public class Mail {
    public static void sendMail() {
        LongTask.task();
        System.out.println("mail was sent.");
    }

    public static CompletableFuture<Void> sendMailAsync() {
        return CompletableFuture.runAsync(Mail::sendMail);
    }
}
