package ffscraper.general.models;

/**
 * Created by danielmurphy on 11/7/15.
 */
public class NFLTeam {
    private String mascot;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    private String location;

    public NFLTeam(String mascot, String location) {
        this.mascot = mascot;
        this.location = location;
    }


}
