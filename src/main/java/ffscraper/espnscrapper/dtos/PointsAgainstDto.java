package ffscraper.espnscrapper.dtos;

import ffscraper.general.models.NFLTeam;

/**
 * Created by danielmurphy on 11/7/15.
 */
public abstract class PointsAgainstDto {
    protected NFLTeam team;
    protected double avgPoints;
    protected int type;

    public void PointsAgainstDto() {

    }

    public NFLTeam getTeam() {
        return team;
    }

    public void setTeam(String teamString) {
        this.team = new NFLTeam(teamString, teamString);
    }

    public double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(String avgPointsString) {
        this.avgPoints = Double.parseDouble(avgPointsString);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }
}
