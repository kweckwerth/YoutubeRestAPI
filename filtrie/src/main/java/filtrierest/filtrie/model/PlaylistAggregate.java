package filtrierest.filtrie.model;

import java.util.ArrayList;
import java.util.List;

/*
represents a real playlist which Video is a part of
 */
public class PlaylistAggregate
{
    private int screen_width=1280;
    private int screen_height=720;
    private List<Video> videos = new ArrayList<>();

    public int getScreen_width() {
        return screen_width;
    }

    public int getScreen_height() {
        return screen_height;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void addVideo(Video vid)
    {
        videos.add(vid);
    }


}
