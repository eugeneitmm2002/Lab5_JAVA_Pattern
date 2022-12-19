import java.util.HashMap;

public class CachedRuTubeVideoLoader implements VideoLoader {
    private VideoLoader videoLoader;
    private HashMap cache;

    public CachedRuTubeVideoLoader(VideoLoader videoLoader) {
        this.videoLoader = videoLoader;
        cache = new HashMap();
    }

    @Override
    public String load(int videiId) {
        if (!cache.containsKey(videiId)) {
            cache.put(videiId, videoLoader.load(videiId));
        }
        return (String) cache.get(videiId);
    }

    @Override
    public int getCountAccess() {
        return videoLoader.getCountAccess();
    }
}
