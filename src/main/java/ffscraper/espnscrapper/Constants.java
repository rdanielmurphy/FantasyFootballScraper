package ffscraper.espnscrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danielmurphy on 11/7/15.
 */
public class Constants {
    private Constants() {}

    public static final String POINTSAGAINST_QB_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=1";
    public static final String POINTSAGAINST_RB_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=2";
    public static final String POINTSAGAINST_WR_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=3";
    public static final String POINTSAGAINST_TE_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=4";
    public static final String POINTSAGAINST_K_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=5";
    public static final String POINTSAGAINST_D_URL = "http://games.espn.go.com/ffl/pointsagainst?&positionId=16";

    public static final int POINTSAGAINST_QB_TYPE = 1;
    public static final int POINTSAGAINST_RB_TYPE = 2;
    public static final int POINTSAGAINST_WR_TYPE = 3;
    public static final int POINTSAGAINST_TE_TYPE = 4;
    public static final int POINTSAGAINST_K_TYPE = 5;
    public static final int POINTSAGAINST_D_TYPE = 16;

    public static final Map<Integer, String> TYPES = new HashMap<Integer, String>();
    static {
        TYPES.put(POINTSAGAINST_QB_TYPE, "QB");
        TYPES.put(POINTSAGAINST_RB_TYPE, "RB");
        TYPES.put(POINTSAGAINST_WR_TYPE, "WR");
        TYPES.put(POINTSAGAINST_TE_TYPE, "TE");
        TYPES.put(POINTSAGAINST_K_TYPE, "K");
        TYPES.put(POINTSAGAINST_D_TYPE, "D");
    }
}
