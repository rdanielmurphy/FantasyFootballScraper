package ffscraper.general;

import ffscraper.general.models.NFLTeam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danielmurphy on 11/7/15.
 */
public class NFLConstants {
    public static final String JETS = "Jets";
    public static final String GIANTS = "Giants";
    public static final String SEAHAWKS = "Seahawks";
    public static final String RAIDERS = "Raiders";
    public static final String FORTY9ERS = "49ers";
    public static final String CHARGERS = "Chargers";
    public static final String CARDS = "Cardinals";
    public static final String BRONCOS = "Broncos";
    public static final String TEX = "Texans";
    public static final String COWBOYS = "Cowboys";
    public static final String EAGLES = "Eagles";
    public static final String VIKS = "Vikings";
    public static final String PACK = "Packers";
    public static final String PANTHERS = "Panthers";
    public static final String FALCO = "Falcons";
    public static final String RAMS = "Rams";
    public static final String BEARS = "Bears";
    public static final String LIONS = "Lions";
    public static final String BUCS = "Buccaneers";
    public static final String SAINTS = "Saints";
    public static final String COLTS = "Colts";
    public static final String JAGS = "Jaguars";
    public static final String BROWNS = "Browns";
    public static final String STEELERS = "Steelers";
    public static final String SKINS = "Redskins";
    public static final String FINS = "Dolphins";
    public static final String TITANS = "Titans";
    public static final String RAVENS = "Ravens";
    public static final String BENGALS = "Bengals";
    public static final String CHIEFS = "Chiefs";
    public static final String PATS = "Patriots";
    public static final String BILLS = "Bills";

    public static final Map<String, NFLTeam> NFL_TEAM_MAP = new HashMap<String, NFLTeam>();
    static {
        NFL_TEAM_MAP.put(JETS, new NFLTeam(JETS, JETS));
        NFL_TEAM_MAP.put(GIANTS, new NFLTeam(GIANTS, GIANTS));
        NFL_TEAM_MAP.put(SEAHAWKS, new NFLTeam(SEAHAWKS, SEAHAWKS));
        NFL_TEAM_MAP.put(RAIDERS, new NFLTeam(RAIDERS, RAIDERS));
        NFL_TEAM_MAP.put(FORTY9ERS, new NFLTeam(FORTY9ERS, FORTY9ERS));
        NFL_TEAM_MAP.put(CHARGERS, new NFLTeam(CHARGERS, CHARGERS));
        NFL_TEAM_MAP.put(CARDS, new NFLTeam(CARDS, CARDS));
        NFL_TEAM_MAP.put(BRONCOS, new NFLTeam(BRONCOS, BRONCOS));
        NFL_TEAM_MAP.put(TEX, new NFLTeam(TEX, TEX));
        NFL_TEAM_MAP.put(COWBOYS, new NFLTeam(COWBOYS, COWBOYS));
        NFL_TEAM_MAP.put(EAGLES, new NFLTeam(EAGLES, EAGLES));
        NFL_TEAM_MAP.put(VIKS, new NFLTeam(VIKS, VIKS));
        NFL_TEAM_MAP.put(PACK, new NFLTeam(PACK, PACK));
        NFL_TEAM_MAP.put(PANTHERS, new NFLTeam(PANTHERS, PANTHERS));
        NFL_TEAM_MAP.put(FALCO, new NFLTeam(FALCO, FALCO));
        NFL_TEAM_MAP.put(RAMS, new NFLTeam(RAMS, RAMS));
        NFL_TEAM_MAP.put(BEARS, new NFLTeam(BEARS, BEARS));
        NFL_TEAM_MAP.put(LIONS, new NFLTeam(LIONS, LIONS));
        NFL_TEAM_MAP.put(BUCS, new NFLTeam(BUCS, BUCS));
        NFL_TEAM_MAP.put(SAINTS, new NFLTeam(SAINTS, SAINTS));
        NFL_TEAM_MAP.put(COLTS, new NFLTeam(COLTS, COLTS));
        NFL_TEAM_MAP.put(JAGS, new NFLTeam(JAGS, JAGS));
        NFL_TEAM_MAP.put(BROWNS, new NFLTeam(BROWNS, BROWNS));
        NFL_TEAM_MAP.put(STEELERS, new NFLTeam(STEELERS, STEELERS));
        NFL_TEAM_MAP.put(SKINS, new NFLTeam(SKINS, SKINS));
        NFL_TEAM_MAP.put(FINS, new NFLTeam(FINS, FINS));
        NFL_TEAM_MAP.put(TITANS, new NFLTeam(TITANS, TITANS));
        NFL_TEAM_MAP.put(RAVENS, new NFLTeam(RAVENS, RAVENS));
        NFL_TEAM_MAP.put(BENGALS, new NFLTeam(BENGALS, BENGALS));
        NFL_TEAM_MAP.put(CHIEFS, new NFLTeam(CHIEFS, CHIEFS));
        NFL_TEAM_MAP.put(PATS, new NFLTeam(PATS, PATS));
        NFL_TEAM_MAP.put(BILLS, new NFLTeam(BILLS, BILLS));
    }
}
