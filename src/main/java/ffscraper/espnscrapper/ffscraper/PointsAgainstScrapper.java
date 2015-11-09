package ffscraper.espnscrapper.ffscraper;

import ffscraper.espnscrapper.Constants;
import ffscraper.espnscrapper.dtos.KickerPointsAgainstDto;
import ffscraper.espnscrapper.dtos.NonKickerPointsAgainstDto;
import ffscraper.espnscrapper.dtos.PointsAgainstDto;
import ffscraper.general.NFLConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danielmurphy on 11/8/15.
 */
public class PointsAgainstScrapper {
    public PointsAgainstScrapper() {}

    public Map<Integer, List<PointsAgainstDto>> scrapPointsAgainstDtos() {
        WebDriver driver = new FirefoxDriver();

        Map<Integer, List<PointsAgainstDto>> dtos = new HashMap<Integer, List<PointsAgainstDto>>();
        dtos.put(Constants.POINTSAGAINST_QB_TYPE, scrapQBPointsAgainst(driver));
        dtos.put(Constants.POINTSAGAINST_RB_TYPE, scrapRBPointsAgainst(driver));
        dtos.put(Constants.POINTSAGAINST_WR_TYPE, scrapWRPointsAgainst(driver));
        dtos.put(Constants.POINTSAGAINST_TE_TYPE, scrapTEPointsAgainst(driver));
        dtos.put(Constants.POINTSAGAINST_D_TYPE, scrapDPointsAgainst(driver));
        //dtos.put(Constants.POINTSAGAINST_K_TYPE, scrapKPointsAgainst(driver));

        driver.close();
        driver.quit();

        return dtos;
    }

    private List<PointsAgainstDto> scrapQBPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_QB_URL, Constants.POINTSAGAINST_QB_TYPE);
    }

    private List<PointsAgainstDto> scrapRBPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_RB_URL, Constants.POINTSAGAINST_RB_TYPE);
    }

    private List<PointsAgainstDto> scrapWRPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_WR_URL, Constants.POINTSAGAINST_WR_TYPE);
    }

    private List<PointsAgainstDto> scrapTEPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_TE_URL, Constants.POINTSAGAINST_TE_TYPE);
    }

    private List<PointsAgainstDto> scrapKPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_K_URL, Constants.POINTSAGAINST_K_TYPE);
    }

    private List<PointsAgainstDto> scrapDPointsAgainst (WebDriver driver) {
        return parsePointsAgainst(driver, Constants.POINTSAGAINST_D_URL, Constants.POINTSAGAINST_D_TYPE);
    }

    private List<PointsAgainstDto> parsePointsAgainst(WebDriver driver, String url, int type) {
        String htmlTableText = getTableText(driver, url);
        String[] lines = htmlTableText.split("\\n");

        List<PointsAgainstDto> dtos = new ArrayList<PointsAgainstDto>();

        //skip first two header lines
        for (int i = 2; i < lines.length; i++) {
            String fullLine = lines[i];

            while (!isFullLine(fullLine) && i < lines.length) {
                fullLine += " " + lines[++i] + " ";
            }

            dtos.add(lineToPointsAgainstDto(fullLine, type));
        }

        return dtos;
    }

    private boolean isFullLine(String line) {
        boolean result = false;

        String[] splits = line.split("\\s");

        //if starts with a team mascot name and ends with a double
        if (NFLConstants.NFL_TEAM_MAP.containsKey(splits[0])) {
            int size = splits.length;

            try {
                double num = Double.parseDouble(splits[size - 1].toString());
                result = true;
            } catch (Exception e) {
            }
        }

        return result;
    }

    private String getTableText(WebDriver driver, String url) {
        driver.get(url);
        WebElement findElement = driver.findElement(By.id("playertable_0"));

        return findElement.getText();
    }

    private PointsAgainstDto lineToPointsAgainstDto(String line, int type) {
        String [] parts = line.split("\\s+");

        if (type == Constants.POINTSAGAINST_K_TYPE) {
            return new KickerPointsAgainstDto(parts);
        }
        else {
            return new NonKickerPointsAgainstDto(parts, type);
        }
    }
}
