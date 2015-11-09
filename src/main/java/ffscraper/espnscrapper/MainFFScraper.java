package ffscraper.espnscrapper;

import ffscraper.espnscrapper.dtos.PointsAgainstDto;
import ffscraper.espnscrapper.ffscraper.PointsAgainstScrapper;

import java.util.List;
import java.util.Map;

/**
 * Created by danielmurphy on 11/7/15.
 */
public class MainFFScraper {
    public MainFFScraper(){

    }

    public static void main (String[] args) throws InterruptedException {
        PointsAgainstScrapper pointsAgainstScrapper = new PointsAgainstScrapper();
        Map<Integer, List<PointsAgainstDto>> dtos = pointsAgainstScrapper.scrapPointsAgainstDtos();
        for (Map.Entry<Integer, List<PointsAgainstDto>> entry : dtos.entrySet()) {
            System.out.println();
            System.out.println(Constants.TYPES.get(entry.getKey()));
            System.out.println("------------------------");
            printList(entry.getValue());
        }
    }

    public static void printList(List<?> dtos) {
        for (Object o : dtos) {
            System.out.println(o.toString());
        }
    }
}
