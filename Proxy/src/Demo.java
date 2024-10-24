import downloader.YouTubeDownloader;
import proxy.YouTubeCacheProxy;
import some_cool_media_library.ThirdPartyYouTubeClass;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader=new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader=new YouTubeDownloader(new YouTubeCacheProxy());

        long naive=test(naiveDownloader);
        long smart=test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }
    private static long test(YouTubeDownloader downloader){
        long startTime=System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime=System.currentTimeMillis()-startTime;
        System.out.println("Time elapsed: "+estimatedTime+"ms\n");
        return estimatedTime;
    }
}