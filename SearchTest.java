package cs.sq12phase;

public class SearchTest {
    public static void main(String[] args) {
        long t = System.nanoTime();

        new Search().solution(new FullCube(""));
        System.out.println((System.nanoTime() - t) / 1e9 + " seconds to initialize");

        t = System.nanoTime();
        for (int x = 0; x < 1000; x++) {
            Search s = new Search();
            s.solution(FullCube.randomCube());
            System.out.print(String.format("AvgTime: %6.3f ms\r", (System.nanoTime() - t) / 1e6 / (x + 1)));
        }
        System.out.println();
    }
}
