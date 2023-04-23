public class Main {
    public static void main(String[] args) {
        try {
            new Account().deposit(5);
        } catch (AccountException e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
