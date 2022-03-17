public class ORCLVideoDtaBase implements VideoDtaBase {

    @Override
    public void store(Video video) {
        System.out.println("saved video in oracle " + video.getName() + " " + video.getTitle());
    }
}



