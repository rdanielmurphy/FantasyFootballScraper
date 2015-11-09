package ffscraper.espnscrapper.dtos;

/**
 * Created by danielmurphy on 11/8/15.
 */
public class KickerPointsAgainstDto extends PointsAgainstDto {
    public KickerPointsAgainstDto(String[] parts) {
        setType(type);
        setAvgPoints(parts[parts.length - 1]);
        setTeam(parts[0]);
    }
}
