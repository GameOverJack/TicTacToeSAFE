
package ttt.game.server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TTTserver", targetNamespace = "http://server.game.ttt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TTTserver {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.RegisterResponse")
    @Action(input = "http://server.game.ttt/TTTserver/registerRequest", output = "http://server.game.ttt/TTTserver/registerResponse")
    public String register(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param win
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWinLose", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.GetWinLose")
    @ResponseWrapper(localName = "getWinLoseResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.GetWinLoseResponse")
    @Action(input = "http://server.game.ttt/TTTserver/getWinLoseRequest", output = "http://server.game.ttt/TTTserver/getWinLoseResponse")
    public int getWinLose(
        @WebParam(name = "win", targetNamespace = "")
        int win,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param square
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "updateSquare", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateSquare")
    @ResponseWrapper(localName = "updateSquareResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateSquareResponse")
    @Action(input = "http://server.game.ttt/TTTserver/updateSquareRequest", output = "http://server.game.ttt/TTTserver/updateSquareResponse")
    public void updateSquare(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "square", targetNamespace = "")
        int square);

    /**
     * 
     * @param resetGame
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetGame", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ResetGame")
    @ResponseWrapper(localName = "resetGameResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ResetGameResponse")
    @Action(input = "http://server.game.ttt/TTTserver/resetGameRequest", output = "http://server.game.ttt/TTTserver/resetGameResponse")
    public int resetGame(
        @WebParam(name = "resetGame", targetNamespace = "")
        int resetGame,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param isCreated
     * @param username
     */
    @WebMethod
    @RequestWrapper(localName = "updateIsCreated", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateIsCreated")
    @ResponseWrapper(localName = "updateIsCreatedResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateIsCreatedResponse")
    @Action(input = "http://server.game.ttt/TTTserver/updateIsCreatedRequest", output = "http://server.game.ttt/TTTserver/updateIsCreatedResponse")
    public void updateIsCreated(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "isCreated", targetNamespace = "")
        int isCreated);

    /**
     * 
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isFoundReset", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.IsFoundReset")
    @ResponseWrapper(localName = "isFoundResetResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.IsFoundResetResponse")
    @Action(input = "http://server.game.ttt/TTTserver/isFoundResetRequest", output = "http://server.game.ttt/TTTserver/isFoundResetResponse")
    public boolean isFoundReset(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param uName
     * @param userID
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "joinGame", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.JoinGame")
    @ResponseWrapper(localName = "joinGameResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.JoinGameResponse")
    @Action(input = "http://server.game.ttt/TTTserver/joinGameRequest", output = "http://server.game.ttt/TTTserver/joinGameResponse", fault = {
        @FaultAction(className = InterruptedException_Exception.class, value = "http://server.game.ttt/TTTserver/joinGame/Fault/InterruptedException")
    })
    public boolean joinGame(
        @WebParam(name = "uName", targetNamespace = "")
        String uName,
        @WebParam(name = "userID", targetNamespace = "")
        String userID)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param isFound
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateIsFound", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateIsFound")
    @ResponseWrapper(localName = "updateIsFoundResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.UpdateIsFoundResponse")
    @Action(input = "http://server.game.ttt/TTTserver/updateIsFoundRequest", output = "http://server.game.ttt/TTTserver/updateIsFoundResponse")
    public String updateIsFound(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "isFound", targetNamespace = "")
        int isFound);

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws ClassNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showLeaderboards", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowLeaderboards")
    @ResponseWrapper(localName = "showLeaderboardsResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowLeaderboardsResponse")
    @Action(input = "http://server.game.ttt/TTTserver/showLeaderboardsRequest", output = "http://server.game.ttt/TTTserver/showLeaderboardsResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://server.game.ttt/TTTserver/showLeaderboards/Fault/ClassNotFoundException")
    })
    public String showLeaderboards()
        throws ClassNotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws ClassNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showComboBox", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowComboBox")
    @ResponseWrapper(localName = "showComboBoxResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowComboBoxResponse")
    @Action(input = "http://server.game.ttt/TTTserver/showComboBoxRequest", output = "http://server.game.ttt/TTTserver/showComboBoxResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://server.game.ttt/TTTserver/showComboBox/Fault/ClassNotFoundException")
    })
    public List<String> showComboBox()
        throws ClassNotFoundException_Exception
    ;

    /**
     * 
     * @param serverTurn
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showPlayerMove", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowPlayerMove")
    @ResponseWrapper(localName = "showPlayerMoveResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ShowPlayerMoveResponse")
    @Action(input = "http://server.game.ttt/TTTserver/showPlayerMoveRequest", output = "http://server.game.ttt/TTTserver/showPlayerMoveResponse")
    public int showPlayerMove(
        @WebParam(name = "serverTurn", targetNamespace = "")
        int serverTurn,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setWins", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetWins")
    @ResponseWrapper(localName = "setWinsResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetWinsResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setWinsRequest", output = "http://server.game.ttt/TTTserver/setWinsResponse")
    public void setWins(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param uName
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetFound", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ResetFound")
    @ResponseWrapper(localName = "resetFoundResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.ResetFoundResponse")
    @Action(input = "http://server.game.ttt/TTTserver/resetFoundRequest", output = "http://server.game.ttt/TTTserver/resetFoundResponse")
    public String resetFound(
        @WebParam(name = "uName", targetNamespace = "")
        String uName,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setDraws", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetDraws")
    @ResponseWrapper(localName = "setDrawsResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetDrawsResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setDrawsRequest", output = "http://server.game.ttt/TTTserver/setDrawsResponse")
    public void setDraws(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param serverTurn
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setPlayerMove", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetPlayerMove")
    @ResponseWrapper(localName = "setPlayerMoveResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetPlayerMoveResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setPlayerMoveRequest", output = "http://server.game.ttt/TTTserver/setPlayerMoveResponse")
    public void setPlayerMove(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "serverTurn", targetNamespace = "")
        int serverTurn);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setLoses", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetLoses")
    @ResponseWrapper(localName = "setLosesResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetLosesResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setLosesRequest", output = "http://server.game.ttt/TTTserver/setLosesResponse")
    public void setLoses(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSquare", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.GetSquare")
    @ResponseWrapper(localName = "getSquareResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.GetSquareResponse")
    @Action(input = "http://server.game.ttt/TTTserver/getSquareRequest", output = "http://server.game.ttt/TTTserver/getSquareResponse")
    public int getSquare(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setResetGame", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetResetGame")
    @ResponseWrapper(localName = "setResetGameResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetResetGameResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setResetGameRequest", output = "http://server.game.ttt/TTTserver/setResetGameResponse")
    public void setResetGame(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param winLose
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setWinLose", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetWinLose")
    @ResponseWrapper(localName = "setWinLoseResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.SetWinLoseResponse")
    @Action(input = "http://server.game.ttt/TTTserver/setWinLoseRequest", output = "http://server.game.ttt/TTTserver/setWinLoseResponse")
    public void setWinLose(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "winLose", targetNamespace = "")
        int winLose);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://server.game.ttt/", className = "ttt.game.server.LoginResponse")
    @Action(input = "http://server.game.ttt/TTTserver/loginRequest", output = "http://server.game.ttt/TTTserver/loginResponse")
    public boolean login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
