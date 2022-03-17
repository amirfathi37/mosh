public class XEmail implements Email {

    @Override
    public void sendEmail(User user) {
        System.out.println("hey " + user.getUsername() + " your video has been uploded");
    }
}
