package edu.cscc;
//Name: Sergio Cruz
//Date: 10/14/19
//Purpose: Testing to make sure the RPSLSpock classes are working properly
import org.junit.Assert;

public class RPSLSpock_Test {

    @org.junit.Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));

        Assert.assertFalse(RPSLSpock.isValidPick("square"));
    }

    @org.junit.Test
    public void generatePick() {
        for (int i =0; i <= 1000000; i++){
            String test = RPSLSpock.generatePick();
            //Makes sure that return value is valid
            Assert.assertTrue(RPSLSpock.isValidPick(test));
        }
    }

    @org.junit.Test
    public void isComputerWin() {
        //makes sure that return value is true
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","scissors"));
        //Returns a false
        Assert.assertFalse(RPSLSpock.isComputerWin("paper","scissors"));
    }
}