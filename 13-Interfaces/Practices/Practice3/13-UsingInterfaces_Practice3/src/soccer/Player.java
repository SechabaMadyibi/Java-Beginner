/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Player {
    private int goalScored;
    private String playerName;
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public void incGoalScored()
    {
        this.goalScored++;
    }
    
    public Player() {}

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the goalScored
     */
    public int getGoalScored() {
        return goalScored;
    }

    /**
     * @param goalScored the goalScored to set
     */
    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }
    
}
