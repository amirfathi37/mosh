import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Amir");
        future.exceptionally(throwable -> "aa").thenRun(() -> System.out.println("step1"))
                .thenRun(() -> System.out.println("step2"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
