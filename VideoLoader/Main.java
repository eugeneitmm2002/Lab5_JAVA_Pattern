public class Main {
    public static void main(String[] args) {
        VideoLoader cachedRuTube = new CachedRuTubeVideoLoader(new RuTubeVideoLoader());
        cachedRuTube.load(1);
        cachedRuTube.load(1);

        cachedRuTube.load(2);
        cachedRuTube.load(2);

        cachedRuTube.load(3);

        System.out.println(cachedRuTube.getCountAccess());
    }
}