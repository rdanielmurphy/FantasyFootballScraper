package ffscraper.espnscrapper.dtos;

import ffscraper.espnscrapper.Constants;

/**
 * Created by danielmurphy on 11/8/15.
 */
public class NonKickerPointsAgainstDto extends PointsAgainstDto {
    public NonKickerPointsAgainstDto(String[] parts, int type) {
        setType(type);
        setAvgPoints(parts[parts.length - 1]);
        setTeam(parts[0]);
    }

    @Override
    public String toString() {
        return getTeam().getMascot() + " vs " + Constants.TYPES.get(type) + " surrender on average " + getAvgPoints() + " fantasy points";
    }
}
