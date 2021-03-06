
package ttt.server.game;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttt.server.game package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IsFoundResetResponse_QNAME = new QName("http://game.server.ttt/", "isFoundResetResponse");
    private final static QName _ResetGame_QNAME = new QName("http://game.server.ttt/", "resetGame");
    private final static QName _ShowPlayerMoveResponse_QNAME = new QName("http://game.server.ttt/", "showPlayerMoveResponse");
    private final static QName _IsFoundReset_QNAME = new QName("http://game.server.ttt/", "isFoundReset");
    private final static QName _Register_QNAME = new QName("http://game.server.ttt/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://game.server.ttt/", "registerResponse");
    private final static QName _GetWinLose_QNAME = new QName("http://game.server.ttt/", "getWinLose");
    private final static QName _SetWinLose_QNAME = new QName("http://game.server.ttt/", "setWinLose");
    private final static QName _SetLoses_QNAME = new QName("http://game.server.ttt/", "setLoses");
    private final static QName _SetPlayerMoveResponse_QNAME = new QName("http://game.server.ttt/", "setPlayerMoveResponse");
    private final static QName _UpdateIsFoundResponse_QNAME = new QName("http://game.server.ttt/", "updateIsFoundResponse");
    private final static QName _SetResetGameResponse_QNAME = new QName("http://game.server.ttt/", "setResetGameResponse");
    private final static QName _ShowLeaderboardsResponse_QNAME = new QName("http://game.server.ttt/", "showLeaderboardsResponse");
    private final static QName _UpdateIsFound_QNAME = new QName("http://game.server.ttt/", "updateIsFound");
    private final static QName _LoginResponse_QNAME = new QName("http://game.server.ttt/", "loginResponse");
    private final static QName _GetWinLoseResponse_QNAME = new QName("http://game.server.ttt/", "getWinLoseResponse");
    private final static QName _ResetGameResponse_QNAME = new QName("http://game.server.ttt/", "resetGameResponse");
    private final static QName _UpdateIsCreatedResponse_QNAME = new QName("http://game.server.ttt/", "updateIsCreatedResponse");
    private final static QName _GetSquareResponse_QNAME = new QName("http://game.server.ttt/", "getSquareResponse");
    private final static QName _ResetFoundResponse_QNAME = new QName("http://game.server.ttt/", "resetFoundResponse");
    private final static QName _SetPlayerMove_QNAME = new QName("http://game.server.ttt/", "setPlayerMove");
    private final static QName _GetPlayers_QNAME = new QName("http://game.server.ttt/", "getPlayers");
    private final static QName _GetIsFoundResponse_QNAME = new QName("http://game.server.ttt/", "getIsFoundResponse");
    private final static QName _ShowComboBoxResponse_QNAME = new QName("http://game.server.ttt/", "showComboBoxResponse");
    private final static QName _GetSquare_QNAME = new QName("http://game.server.ttt/", "getSquare");
    private final static QName _JoinGame_QNAME = new QName("http://game.server.ttt/", "joinGame");
    private final static QName _GetPlayersResponse_QNAME = new QName("http://game.server.ttt/", "getPlayersResponse");
    private final static QName _SetDrawsResponse_QNAME = new QName("http://game.server.ttt/", "setDrawsResponse");
    private final static QName _SetLosesResponse_QNAME = new QName("http://game.server.ttt/", "setLosesResponse");
    private final static QName _ShowLeaderboards_QNAME = new QName("http://game.server.ttt/", "showLeaderboards");
    private final static QName _SetWins_QNAME = new QName("http://game.server.ttt/", "setWins");
    private final static QName _UpdateSquare_QNAME = new QName("http://game.server.ttt/", "updateSquare");
    private final static QName _Login_QNAME = new QName("http://game.server.ttt/", "login");
    private final static QName _JoinGameResponse_QNAME = new QName("http://game.server.ttt/", "joinGameResponse");
    private final static QName _SetDraws_QNAME = new QName("http://game.server.ttt/", "setDraws");
    private final static QName _UpdateIsCreated_QNAME = new QName("http://game.server.ttt/", "updateIsCreated");
    private final static QName _SetWinLoseResponse_QNAME = new QName("http://game.server.ttt/", "setWinLoseResponse");
    private final static QName _SetWinsResponse_QNAME = new QName("http://game.server.ttt/", "setWinsResponse");
    private final static QName _ResetFound_QNAME = new QName("http://game.server.ttt/", "resetFound");
    private final static QName _ShowComboBox_QNAME = new QName("http://game.server.ttt/", "showComboBox");
    private final static QName _ShowPlayerMove_QNAME = new QName("http://game.server.ttt/", "showPlayerMove");
    private final static QName _SetResetGame_QNAME = new QName("http://game.server.ttt/", "setResetGame");
    private final static QName _GetIsFound_QNAME = new QName("http://game.server.ttt/", "getIsFound");
    private final static QName _UpdateSquareResponse_QNAME = new QName("http://game.server.ttt/", "updateSquareResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttt.server.game
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetWinLoseResponse }
     * 
     */
    public SetWinLoseResponse createSetWinLoseResponse() {
        return new SetWinLoseResponse();
    }

    /**
     * Create an instance of {@link SetWinsResponse }
     * 
     */
    public SetWinsResponse createSetWinsResponse() {
        return new SetWinsResponse();
    }

    /**
     * Create an instance of {@link ResetFound }
     * 
     */
    public ResetFound createResetFound() {
        return new ResetFound();
    }

    /**
     * Create an instance of {@link ShowComboBox }
     * 
     */
    public ShowComboBox createShowComboBox() {
        return new ShowComboBox();
    }

    /**
     * Create an instance of {@link ShowPlayerMove }
     * 
     */
    public ShowPlayerMove createShowPlayerMove() {
        return new ShowPlayerMove();
    }

    /**
     * Create an instance of {@link SetResetGame }
     * 
     */
    public SetResetGame createSetResetGame() {
        return new SetResetGame();
    }

    /**
     * Create an instance of {@link GetIsFound }
     * 
     */
    public GetIsFound createGetIsFound() {
        return new GetIsFound();
    }

    /**
     * Create an instance of {@link UpdateSquareResponse }
     * 
     */
    public UpdateSquareResponse createUpdateSquareResponse() {
        return new UpdateSquareResponse();
    }

    /**
     * Create an instance of {@link SetWins }
     * 
     */
    public SetWins createSetWins() {
        return new SetWins();
    }

    /**
     * Create an instance of {@link UpdateSquare }
     * 
     */
    public UpdateSquare createUpdateSquare() {
        return new UpdateSquare();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link JoinGameResponse }
     * 
     */
    public JoinGameResponse createJoinGameResponse() {
        return new JoinGameResponse();
    }

    /**
     * Create an instance of {@link SetDraws }
     * 
     */
    public SetDraws createSetDraws() {
        return new SetDraws();
    }

    /**
     * Create an instance of {@link UpdateIsCreated }
     * 
     */
    public UpdateIsCreated createUpdateIsCreated() {
        return new UpdateIsCreated();
    }

    /**
     * Create an instance of {@link GetSquare }
     * 
     */
    public GetSquare createGetSquare() {
        return new GetSquare();
    }

    /**
     * Create an instance of {@link JoinGame }
     * 
     */
    public JoinGame createJoinGame() {
        return new JoinGame();
    }

    /**
     * Create an instance of {@link GetPlayersResponse }
     * 
     */
    public GetPlayersResponse createGetPlayersResponse() {
        return new GetPlayersResponse();
    }

    /**
     * Create an instance of {@link SetDrawsResponse }
     * 
     */
    public SetDrawsResponse createSetDrawsResponse() {
        return new SetDrawsResponse();
    }

    /**
     * Create an instance of {@link SetLosesResponse }
     * 
     */
    public SetLosesResponse createSetLosesResponse() {
        return new SetLosesResponse();
    }

    /**
     * Create an instance of {@link ShowLeaderboards }
     * 
     */
    public ShowLeaderboards createShowLeaderboards() {
        return new ShowLeaderboards();
    }

    /**
     * Create an instance of {@link GetSquareResponse }
     * 
     */
    public GetSquareResponse createGetSquareResponse() {
        return new GetSquareResponse();
    }

    /**
     * Create an instance of {@link ResetFoundResponse }
     * 
     */
    public ResetFoundResponse createResetFoundResponse() {
        return new ResetFoundResponse();
    }

    /**
     * Create an instance of {@link SetPlayerMove }
     * 
     */
    public SetPlayerMove createSetPlayerMove() {
        return new SetPlayerMove();
    }

    /**
     * Create an instance of {@link GetPlayers }
     * 
     */
    public GetPlayers createGetPlayers() {
        return new GetPlayers();
    }

    /**
     * Create an instance of {@link GetIsFoundResponse }
     * 
     */
    public GetIsFoundResponse createGetIsFoundResponse() {
        return new GetIsFoundResponse();
    }

    /**
     * Create an instance of {@link ShowComboBoxResponse }
     * 
     */
    public ShowComboBoxResponse createShowComboBoxResponse() {
        return new ShowComboBoxResponse();
    }

    /**
     * Create an instance of {@link ShowLeaderboardsResponse }
     * 
     */
    public ShowLeaderboardsResponse createShowLeaderboardsResponse() {
        return new ShowLeaderboardsResponse();
    }

    /**
     * Create an instance of {@link UpdateIsFound }
     * 
     */
    public UpdateIsFound createUpdateIsFound() {
        return new UpdateIsFound();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetWinLoseResponse }
     * 
     */
    public GetWinLoseResponse createGetWinLoseResponse() {
        return new GetWinLoseResponse();
    }

    /**
     * Create an instance of {@link ResetGameResponse }
     * 
     */
    public ResetGameResponse createResetGameResponse() {
        return new ResetGameResponse();
    }

    /**
     * Create an instance of {@link UpdateIsCreatedResponse }
     * 
     */
    public UpdateIsCreatedResponse createUpdateIsCreatedResponse() {
        return new UpdateIsCreatedResponse();
    }

    /**
     * Create an instance of {@link GetWinLose }
     * 
     */
    public GetWinLose createGetWinLose() {
        return new GetWinLose();
    }

    /**
     * Create an instance of {@link SetWinLose }
     * 
     */
    public SetWinLose createSetWinLose() {
        return new SetWinLose();
    }

    /**
     * Create an instance of {@link SetLoses }
     * 
     */
    public SetLoses createSetLoses() {
        return new SetLoses();
    }

    /**
     * Create an instance of {@link SetPlayerMoveResponse }
     * 
     */
    public SetPlayerMoveResponse createSetPlayerMoveResponse() {
        return new SetPlayerMoveResponse();
    }

    /**
     * Create an instance of {@link UpdateIsFoundResponse }
     * 
     */
    public UpdateIsFoundResponse createUpdateIsFoundResponse() {
        return new UpdateIsFoundResponse();
    }

    /**
     * Create an instance of {@link SetResetGameResponse }
     * 
     */
    public SetResetGameResponse createSetResetGameResponse() {
        return new SetResetGameResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link IsFoundResetResponse }
     * 
     */
    public IsFoundResetResponse createIsFoundResetResponse() {
        return new IsFoundResetResponse();
    }

    /**
     * Create an instance of {@link ResetGame }
     * 
     */
    public ResetGame createResetGame() {
        return new ResetGame();
    }

    /**
     * Create an instance of {@link ShowPlayerMoveResponse }
     * 
     */
    public ShowPlayerMoveResponse createShowPlayerMoveResponse() {
        return new ShowPlayerMoveResponse();
    }

    /**
     * Create an instance of {@link IsFoundReset }
     * 
     */
    public IsFoundReset createIsFoundReset() {
        return new IsFoundReset();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFoundResetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "isFoundResetResponse")
    public JAXBElement<IsFoundResetResponse> createIsFoundResetResponse(IsFoundResetResponse value) {
        return new JAXBElement<IsFoundResetResponse>(_IsFoundResetResponse_QNAME, IsFoundResetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "resetGame")
    public JAXBElement<ResetGame> createResetGame(ResetGame value) {
        return new JAXBElement<ResetGame>(_ResetGame_QNAME, ResetGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPlayerMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showPlayerMoveResponse")
    public JAXBElement<ShowPlayerMoveResponse> createShowPlayerMoveResponse(ShowPlayerMoveResponse value) {
        return new JAXBElement<ShowPlayerMoveResponse>(_ShowPlayerMoveResponse_QNAME, ShowPlayerMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFoundReset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "isFoundReset")
    public JAXBElement<IsFoundReset> createIsFoundReset(IsFoundReset value) {
        return new JAXBElement<IsFoundReset>(_IsFoundReset_QNAME, IsFoundReset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWinLose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getWinLose")
    public JAXBElement<GetWinLose> createGetWinLose(GetWinLose value) {
        return new JAXBElement<GetWinLose>(_GetWinLose_QNAME, GetWinLose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetWinLose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setWinLose")
    public JAXBElement<SetWinLose> createSetWinLose(SetWinLose value) {
        return new JAXBElement<SetWinLose>(_SetWinLose_QNAME, SetWinLose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLoses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setLoses")
    public JAXBElement<SetLoses> createSetLoses(SetLoses value) {
        return new JAXBElement<SetLoses>(_SetLoses_QNAME, SetLoses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setPlayerMoveResponse")
    public JAXBElement<SetPlayerMoveResponse> createSetPlayerMoveResponse(SetPlayerMoveResponse value) {
        return new JAXBElement<SetPlayerMoveResponse>(_SetPlayerMoveResponse_QNAME, SetPlayerMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIsFoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateIsFoundResponse")
    public JAXBElement<UpdateIsFoundResponse> createUpdateIsFoundResponse(UpdateIsFoundResponse value) {
        return new JAXBElement<UpdateIsFoundResponse>(_UpdateIsFoundResponse_QNAME, UpdateIsFoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetResetGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setResetGameResponse")
    public JAXBElement<SetResetGameResponse> createSetResetGameResponse(SetResetGameResponse value) {
        return new JAXBElement<SetResetGameResponse>(_SetResetGameResponse_QNAME, SetResetGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowLeaderboardsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showLeaderboardsResponse")
    public JAXBElement<ShowLeaderboardsResponse> createShowLeaderboardsResponse(ShowLeaderboardsResponse value) {
        return new JAXBElement<ShowLeaderboardsResponse>(_ShowLeaderboardsResponse_QNAME, ShowLeaderboardsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIsFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateIsFound")
    public JAXBElement<UpdateIsFound> createUpdateIsFound(UpdateIsFound value) {
        return new JAXBElement<UpdateIsFound>(_UpdateIsFound_QNAME, UpdateIsFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWinLoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getWinLoseResponse")
    public JAXBElement<GetWinLoseResponse> createGetWinLoseResponse(GetWinLoseResponse value) {
        return new JAXBElement<GetWinLoseResponse>(_GetWinLoseResponse_QNAME, GetWinLoseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "resetGameResponse")
    public JAXBElement<ResetGameResponse> createResetGameResponse(ResetGameResponse value) {
        return new JAXBElement<ResetGameResponse>(_ResetGameResponse_QNAME, ResetGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIsCreatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateIsCreatedResponse")
    public JAXBElement<UpdateIsCreatedResponse> createUpdateIsCreatedResponse(UpdateIsCreatedResponse value) {
        return new JAXBElement<UpdateIsCreatedResponse>(_UpdateIsCreatedResponse_QNAME, UpdateIsCreatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getSquareResponse")
    public JAXBElement<GetSquareResponse> createGetSquareResponse(GetSquareResponse value) {
        return new JAXBElement<GetSquareResponse>(_GetSquareResponse_QNAME, GetSquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetFoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "resetFoundResponse")
    public JAXBElement<ResetFoundResponse> createResetFoundResponse(ResetFoundResponse value) {
        return new JAXBElement<ResetFoundResponse>(_ResetFoundResponse_QNAME, ResetFoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlayerMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setPlayerMove")
    public JAXBElement<SetPlayerMove> createSetPlayerMove(SetPlayerMove value) {
        return new JAXBElement<SetPlayerMove>(_SetPlayerMove_QNAME, SetPlayerMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getPlayers")
    public JAXBElement<GetPlayers> createGetPlayers(GetPlayers value) {
        return new JAXBElement<GetPlayers>(_GetPlayers_QNAME, GetPlayers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsFoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getIsFoundResponse")
    public JAXBElement<GetIsFoundResponse> createGetIsFoundResponse(GetIsFoundResponse value) {
        return new JAXBElement<GetIsFoundResponse>(_GetIsFoundResponse_QNAME, GetIsFoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowComboBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showComboBoxResponse")
    public JAXBElement<ShowComboBoxResponse> createShowComboBoxResponse(ShowComboBoxResponse value) {
        return new JAXBElement<ShowComboBoxResponse>(_ShowComboBoxResponse_QNAME, ShowComboBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSquare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getSquare")
    public JAXBElement<GetSquare> createGetSquare(GetSquare value) {
        return new JAXBElement<GetSquare>(_GetSquare_QNAME, GetSquare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "joinGame")
    public JAXBElement<JoinGame> createJoinGame(JoinGame value) {
        return new JAXBElement<JoinGame>(_JoinGame_QNAME, JoinGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getPlayersResponse")
    public JAXBElement<GetPlayersResponse> createGetPlayersResponse(GetPlayersResponse value) {
        return new JAXBElement<GetPlayersResponse>(_GetPlayersResponse_QNAME, GetPlayersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDrawsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setDrawsResponse")
    public JAXBElement<SetDrawsResponse> createSetDrawsResponse(SetDrawsResponse value) {
        return new JAXBElement<SetDrawsResponse>(_SetDrawsResponse_QNAME, SetDrawsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLosesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setLosesResponse")
    public JAXBElement<SetLosesResponse> createSetLosesResponse(SetLosesResponse value) {
        return new JAXBElement<SetLosesResponse>(_SetLosesResponse_QNAME, SetLosesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowLeaderboards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showLeaderboards")
    public JAXBElement<ShowLeaderboards> createShowLeaderboards(ShowLeaderboards value) {
        return new JAXBElement<ShowLeaderboards>(_ShowLeaderboards_QNAME, ShowLeaderboards.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetWins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setWins")
    public JAXBElement<SetWins> createSetWins(SetWins value) {
        return new JAXBElement<SetWins>(_SetWins_QNAME, SetWins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSquare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateSquare")
    public JAXBElement<UpdateSquare> createUpdateSquare(UpdateSquare value) {
        return new JAXBElement<UpdateSquare>(_UpdateSquare_QNAME, UpdateSquare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "joinGameResponse")
    public JAXBElement<JoinGameResponse> createJoinGameResponse(JoinGameResponse value) {
        return new JAXBElement<JoinGameResponse>(_JoinGameResponse_QNAME, JoinGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDraws }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setDraws")
    public JAXBElement<SetDraws> createSetDraws(SetDraws value) {
        return new JAXBElement<SetDraws>(_SetDraws_QNAME, SetDraws.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIsCreated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateIsCreated")
    public JAXBElement<UpdateIsCreated> createUpdateIsCreated(UpdateIsCreated value) {
        return new JAXBElement<UpdateIsCreated>(_UpdateIsCreated_QNAME, UpdateIsCreated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetWinLoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setWinLoseResponse")
    public JAXBElement<SetWinLoseResponse> createSetWinLoseResponse(SetWinLoseResponse value) {
        return new JAXBElement<SetWinLoseResponse>(_SetWinLoseResponse_QNAME, SetWinLoseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetWinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setWinsResponse")
    public JAXBElement<SetWinsResponse> createSetWinsResponse(SetWinsResponse value) {
        return new JAXBElement<SetWinsResponse>(_SetWinsResponse_QNAME, SetWinsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "resetFound")
    public JAXBElement<ResetFound> createResetFound(ResetFound value) {
        return new JAXBElement<ResetFound>(_ResetFound_QNAME, ResetFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowComboBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showComboBox")
    public JAXBElement<ShowComboBox> createShowComboBox(ShowComboBox value) {
        return new JAXBElement<ShowComboBox>(_ShowComboBox_QNAME, ShowComboBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPlayerMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "showPlayerMove")
    public JAXBElement<ShowPlayerMove> createShowPlayerMove(ShowPlayerMove value) {
        return new JAXBElement<ShowPlayerMove>(_ShowPlayerMove_QNAME, ShowPlayerMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetResetGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "setResetGame")
    public JAXBElement<SetResetGame> createSetResetGame(SetResetGame value) {
        return new JAXBElement<SetResetGame>(_SetResetGame_QNAME, SetResetGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "getIsFound")
    public JAXBElement<GetIsFound> createGetIsFound(GetIsFound value) {
        return new JAXBElement<GetIsFound>(_GetIsFound_QNAME, GetIsFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game.server.ttt/", name = "updateSquareResponse")
    public JAXBElement<UpdateSquareResponse> createUpdateSquareResponse(UpdateSquareResponse value) {
        return new JAXBElement<UpdateSquareResponse>(_UpdateSquareResponse_QNAME, UpdateSquareResponse.class, null, value);
    }

}
