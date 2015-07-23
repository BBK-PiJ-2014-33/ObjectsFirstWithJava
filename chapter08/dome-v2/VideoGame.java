
/**
 * Write a description of class VideoGame here.
 * 
 * @author (Lulu) 
 * @version (1.0)
 */
public class VideoGame extends Item
{
    private String platform;

    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String gameTile, int gamePlayingTime, String gamePlatform)
    {
        super(gameTile, gamePlayingTime);
        platform = gamePlatform;
    }

    /**
     * Getter method
     * 
     * @return     platform 
     */
    public String getPlatform()
    {
        // put your code here
        return platform;
    }
}
