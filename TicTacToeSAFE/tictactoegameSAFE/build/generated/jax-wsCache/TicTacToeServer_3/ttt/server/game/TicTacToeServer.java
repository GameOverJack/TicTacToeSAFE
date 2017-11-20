
package ttt.server.game;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicTacToeServer", targetNamespace = "http://game.server.ttt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicTacToeServer {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.RegisterResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/registerRequest", output = "http://game.server.ttt/TicTacToeServer/registerResponse")
    public boolean register(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showLeaderboards", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowLeaderboards")
    @ResponseWrapper(localName = "showLeaderboardsResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowLeaderboardsResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/showLeaderboardsRequest", output = "http://game.server.ttt/TicTacToeServer/showLeaderboardsResponse")
    public List<String> showLeaderboards();

    /**
     * 
     * @param isFound
     * @param username
     */
    @WebMethod
    @RequestWrapper(localName = "updateIsFound", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateIsFound")
    @ResponseWrapper(localName = "updateIsFoundResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateIsFoundResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/updateIsFoundRequest", output = "http://game.server.ttt/TicTacToeServer/updateIsFoundResponse")
    public void updateIsFound(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "isFound", targetNamespace = "")
        int isFound);

    /**
     * 
     * @param isCreated
     * @param username
     */
    @WebMethod
    @RequestWrapper(localName = "updateIsCreated", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateIsCreated")
    @ResponseWrapper(localName = "updateIsCreatedResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateIsCreatedResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/updateIsCreatedRequest", output = "http://game.server.ttt/TicTacToeServer/updateIsCreatedResponse")
    public void updateIsCreated(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "isCreated", targetNamespace = "")
        int isCreated);

    /**
     * 
     * @param uName
     * @param userID
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "joinGame", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.JoinGame")
    @ResponseWrapper(localName = "joinGameResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.JoinGameResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/joinGameRequest", output = "http://game.server.ttt/TicTacToeServer/joinGameResponse")
    public boolean joinGame(
        @WebParam(name = "uName", targetNamespace = "")
        String uName,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param uName
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "resetFound", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ResetFound")
    @ResponseWrapper(localName = "resetFoundResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ResetFoundResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/resetFoundRequest", output = "http://game.server.ttt/TicTacToeServer/resetFoundResponse")
    public void resetFound(
        @WebParam(name = "uName", targetNamespace = "")
        String uName,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showComboBox", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowComboBox")
    @ResponseWrapper(localName = "showComboBoxResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowComboBoxResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/showComboBoxRequest", output = "http://game.server.ttt/TicTacToeServer/showComboBoxResponse")
    public List<String> showComboBox();

    /**
     * 
     * @param serverTurn
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showPlayerMove", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowPlayerMove")
    @ResponseWrapper(localName = "showPlayerMoveResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ShowPlayerMoveResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/showPlayerMoveRequest", output = "http://game.server.ttt/TicTacToeServer/showPlayerMoveResponse")
    public int showPlayerMove(
        @WebParam(name = "serverTurn", targetNamespace = "")
        int serverTurn,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     * @param win
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetGame", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ResetGame")
    @ResponseWrapper(localName = "resetGameResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.ResetGameResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/resetGameRequest", output = "http://game.server.ttt/TicTacToeServer/resetGameResponse")
    public int resetGame(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "win", targetNamespace = "")
        int win);

    /**
     * 
     * @param win
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWinLose", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetWinLose")
    @ResponseWrapper(localName = "getWinLoseResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetWinLoseResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/getWinLoseRequest", output = "http://game.server.ttt/TicTacToeServer/getWinLoseResponse")
    public int getWinLose(
        @WebParam(name = "win", targetNamespace = "")
        int win,
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isFoundReset", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.IsFoundReset")
    @ResponseWrapper(localName = "isFoundResetResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.IsFoundResetResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/isFoundResetRequest", output = "http://game.server.ttt/TicTacToeServer/isFoundResetResponse")
    public boolean isFoundReset(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param serverTurn
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setPlayerMove", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetPlayerMove")
    @ResponseWrapper(localName = "setPlayerMoveResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetPlayerMoveResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setPlayerMoveRequest", output = "http://game.server.ttt/TicTacToeServer/setPlayerMoveResponse")
    public void setPlayerMove(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "serverTurn", targetNamespace = "")
        int serverTurn);

    /**
     * 
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSquare", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetSquare")
    @ResponseWrapper(localName = "getSquareResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetSquareResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/getSquareRequest", output = "http://game.server.ttt/TicTacToeServer/getSquareResponse")
    public int getSquare(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setDraws", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetDraws")
    @ResponseWrapper(localName = "setDrawsResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetDrawsResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setDrawsRequest", output = "http://game.server.ttt/TicTacToeServer/setDrawsResponse")
    public void setDraws(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setLoses", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetLoses")
    @ResponseWrapper(localName = "setLosesResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetLosesResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setLosesRequest", output = "http://game.server.ttt/TicTacToeServer/setLosesResponse")
    public void setLoses(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param square
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "updateSquare", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateSquare")
    @ResponseWrapper(localName = "updateSquareResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.UpdateSquareResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/updateSquareRequest", output = "http://game.server.ttt/TicTacToeServer/updateSquareResponse")
    public void updateSquare(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "square", targetNamespace = "")
        int square);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setWins", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetWins")
    @ResponseWrapper(localName = "setWinsResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetWinsResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setWinsRequest", output = "http://game.server.ttt/TicTacToeServer/setWinsResponse")
    public void setWins(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param winLose
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setWinLose", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetWinLose")
    @ResponseWrapper(localName = "setWinLoseResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetWinLoseResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setWinLoseRequest", output = "http://game.server.ttt/TicTacToeServer/setWinLoseResponse")
    public void setWinLose(
        @WebParam(name = "userID", targetNamespace = "")
        String userID,
        @WebParam(name = "winLose", targetNamespace = "")
        int winLose);

    /**
     * 
     * @param userID
     */
    @WebMethod
    @RequestWrapper(localName = "setResetGame", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetResetGame")
    @ResponseWrapper(localName = "setResetGameResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.SetResetGameResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/setResetGameRequest", output = "http://game.server.ttt/TicTacToeServer/setResetGameResponse")
    public void setResetGame(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlayer1", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetPlayer1")
    @ResponseWrapper(localName = "getPlayer1Response", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetPlayer1Response")
    @Action(input = "http://game.server.ttt/TicTacToeServer/getPlayer1Request", output = "http://game.server.ttt/TicTacToeServer/getPlayer1Response")
    public String getPlayer1(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlayer2", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetPlayer2")
    @ResponseWrapper(localName = "getPlayer2Response", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetPlayer2Response")
    @Action(input = "http://game.server.ttt/TicTacToeServer/getPlayer2Request", output = "http://game.server.ttt/TicTacToeServer/getPlayer2Response")
    public String getPlayer2(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.LoginResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/loginRequest", output = "http://game.server.ttt/TicTacToeServer/loginResponse")
    public boolean login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param userID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIsFound", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetIsFound")
    @ResponseWrapper(localName = "getIsFoundResponse", targetNamespace = "http://game.server.ttt/", className = "ttt.server.game.GetIsFoundResponse")
    @Action(input = "http://game.server.ttt/TicTacToeServer/getIsFoundRequest", output = "http://game.server.ttt/TicTacToeServer/getIsFoundResponse")
    public int getIsFound(
        @WebParam(name = "userID", targetNamespace = "")
        String userID);

}
