public class Main {
    public static void main(String[] args) {
        User amir = new User("amir.fathi", "12345");
        Video video = new Video("myVideo.mp4", "learning", amir);
        new VideoProcesor(new XCompressVideo() , new ORCLVideoDtaBase() , new XEmail()).process(video);
    }
}
