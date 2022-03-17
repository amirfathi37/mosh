public class VideoProcesor {

        private CompressVideo encoder;
        private VideoDtaBase dtaBase;
        private Email email;

    public VideoProcesor(CompressVideo encoder, VideoDtaBase dtaBase, Email email) {
        this.encoder = encoder;
        this.dtaBase = dtaBase;
        this.email = email;
    }

    public void process(Video video) {

        encoder.compress(video);
        dtaBase.store(video);
        email.sendEmail(video.getUser());
    }
}
