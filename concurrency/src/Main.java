import java.util.Date;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
//        scheduledExecutorService.scheduleAtFixedRate(() ->
//                        System.out.println("I am runing" + new Date())
//                , 5 ,5
//                , Time Unit.SECONDS
//        );
//        Mail mail = new Mail();
//        mail.sendMail();



//        CompletableFuture<Void> async = CompletableFuture.runAsync(Mail::sendMail);
//        System.out.println("I'm ready");

        CompletableFuture<Integer> intFuture = CompletableFuture.supplyAsync(() -> 1);
        intFuture.thenRun(() -> System.out.println("done!!"));


    }
}
