import java.util.HashMap;

public class RuTubeVideoLoader implements VideoLoader{
    private HashMap videos;
    private int count;

    public RuTubeVideoLoader() {
        videos = new HashMap();
        videos.put(1, "First video");
        videos.put(2, "Second video");
        videos.put(3, "Third video");
    }

    @Override
    public String load(int videoId) {
        count++;
        return (String) videos.get(videoId);
    }

    @Override
    public int getCountAccess() {
        return count;
    }
}
