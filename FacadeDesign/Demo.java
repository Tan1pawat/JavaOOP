package FacadeDesign;

import FacadeDesign.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        @SuppressWarnings("unused")
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}