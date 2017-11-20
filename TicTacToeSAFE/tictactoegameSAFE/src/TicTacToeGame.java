import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import ttt.game.server.TTTserver;
import ttt.game.server.TTTserver_Service;
import ttt.server.game.TicTacToeServer;
import ttt.server.game.TicTacToeServer_Service;
/**
 *
 * @author james.murphy
 */
public class TicTacToeGame extends JFrame implements ActionListener {

    private JPanel gameBoard;
    private JPanel menu;
    private JLabel menuText, curPlayerID;
    private JButton[] squares;
    private JButton reset;
    private int[][] board;
    private Color[] playerBadge;
    private int player;
    private int numSides;
    private int gameState;  /* -2: new game, -1: draw, 0: player1 win, 1: player2 win */
    private int numSquares;
    int playerturn;
    int serverTurn;
    int playermove = 9;
    int win = -2;
    boolean gameOver = false;
    String userID;
    int resetGame;
    private TicTacToeServer proxy;
    
    public TicTacToeGame(int playerturn, String userID) throws InterruptedException, SQLException, ClassNotFoundException {
        TicTacToeServer_Service ser = new TicTacToeServer_Service();
        proxy = ser.getTicTacToeServerPort();
        gameState = -2;
        numSides = 3;
        numSquares = 9;
        this.playerturn = playerturn;

        this.userID = userID;
        board = new int[numSides][numSides];
        playerBadge = new Color[2];
        playerBadge[0] = Color.RED;
        playerBadge[1] = Color.GREEN;
        
        this.setTitle("Tic Tac Toe Game board");
        this.setBounds(100,100,500,300);
        this.setPreferredSize(new Dimension(500,300));
        this.setLayout(new GridLayout(1,2));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        gameBoard = new JPanel();
        gameBoard.setBounds(new Rectangle(300,300));
        gameBoard.setLayout(new GridLayout(3,3));
        squares = new JButton[9];
        for(int i=0;i<9;i++) {
            squares[i] = new JButton(" ");
            squares[i].addActionListener(this);
            gameBoard.add(squares[i]);
        }
        
        for(int i=0;i<numSides;i++) {
            for(int j=0;j<numSides;j++) {
                board[i][j] = -1;
                int pos = ((i*numSides) + j);
                squares[pos].setBackground(Color.WHITE);
            }
        }
        //sets serverTurn
        serverTurn = proxy.getPlayerMove(userID);

        
        menu = new JPanel();
        menu.setLayout(new GridLayout(3,1));
        
        menuText = new JLabel("Click on a square to start.", SwingConstants.CENTER);
        menuText.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        curPlayerID = new JLabel("It's player " + (player + 1) + "'s move", SwingConstants.CENTER);
        curPlayerID.setBackground(playerBadge[player]);
        curPlayerID.setForeground(Color.WHITE);
        curPlayerID.setOpaque(true);
        curPlayerID.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        reset = new JButton("Start New Game");
        reset.addActionListener(this);
        
        menu.add(menuText);
        menu.add(curPlayerID);
        menu.add(reset);
        
        this.add(gameBoard);
        this.add(menu);
        this.pack();
        this.setVisible(true);
        updateSquare(9);
        gameOver(-2);
        new Thread(new Runnable() {

        @Override
        public void run() {

            try {
                // Do something
                updateBoard();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }).start();
        
        new Thread(new Runnable() {

        @Override
        public void run() {

            try {
                // Do something
                winCondition();
            } catch (SQLException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            

        }
    }).start();
    }
    
    public void resetGame() throws SQLException, ClassNotFoundException, InterruptedException{
        while(win != -2)
        {
            //resets game
            if(proxy.resetGame(userID,win) == -2){
            reset();
            win = -2;
            }
            Thread.sleep(2000);
        }
    }
        
    public void winCondition() throws SQLException, ClassNotFoundException, InterruptedException{
    while(win == -2){
         win = proxy.getWinLose(win, userID);
            if(win == -1){
            playermove =  proxy.getSquare(userID);
            if(playermove != 9 && !taken(playermove)){
                
                play(playermove);
            }
            JOptionPane.showMessageDialog(null, "Game over.\n It's a draw", "Drawn Game!", INFORMATION_MESSAGE);
            gameOver = true;
            setScore(-1);
            resetGame();
            }
            else if(win == 0){
                playermove =  proxy.getSquare(userID); 
            if(playermove != 9 && !taken(playermove)){
                
                play(playermove);
            }
            JOptionPane.showMessageDialog(null, "Game over.\n Player 1 Wins!", "PLAYER 1 WINS!", INFORMATION_MESSAGE);
            gameOver = true;
            setScore(0);
            updateSquare(playermove);
            resetGame();
            }
            else if(win == 1){
                playermove =  proxy.getSquare(userID); 
            if(playermove != 9 && !taken(playermove)){
                
                play(playermove);
            }
            JOptionPane.showMessageDialog(null, "Game over.\n Player 2 Wins!", "PLAYER 2 WINS!", INFORMATION_MESSAGE);
            setScore(1);
            gameOver = true;
            resetGame();
            }
            Thread.sleep(2000);
    }
    }
    
    public void setScore(int score)
    {
        Connection connection;
            PreparedStatement ps;
        if(score == -1)
        {
            proxy.setDraws(userID);
        }
        else if(score == 0 && player == 0){
            proxy.setWins(userID);
        }
        else if(score == 0 && player == 1){
            proxy.setLoses(userID);
        }
        else if(score == 1 && player == 0){
            proxy.setLoses(userID);
        }
        else if(score == 1 && player == 1){
            proxy.setWins(userID);
        }
    }
    public void updateBoard() throws InterruptedException, SQLException, ClassNotFoundException{
        while(win == -2){
            playermove =  proxy.getSquare(userID); 
            System.out.println(playermove);
            if(playermove != 9 && !taken(playermove)){
                
                play(playermove);
            }
            Thread.sleep(2000);
        }
    }
    
    public void updateSquare(int n){
        proxy.updateSquare(userID, n);
    }
    
    public void gameOver(int n){
    proxy.setWinLose(userID, n);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try {
            JButton source = (JButton) ae.getSource();
            System.out.println("bananazzzzzzzzzz"+ playerturn + serverTurn);
            serverTurn = proxy.getPlayerMove(userID);
            System.out.println("banana"+ playerturn + serverTurn);
            
            if(serverTurn == playerturn){
                //Have a boolean that changes to whos players turn it is
                if(source.equals(reset)) {
                    reset();
                }

                if(source.equals(squares[0])) {
                    play(0);
                    playermove = 0;
                }

                if(source.equals(squares[1])) {
                    play(1);
                    playermove = 1;
                }

                if(source.equals(squares[2])) {
                    play(2);
                    playermove = 2;
                }

                if(source.equals(squares[3])) {
                    play(3);
                    playermove = 3;
                }

                if(source.equals(squares[4])) {
                    play(4);
                    playermove = 4;
                }

                if(source.equals(squares[5])) {
                    play(5);
                    playermove = 5;
                }

                if(source.equals(squares[6])) {
                    play(6);
                    playermove = 6;
                }

                if(source.equals(squares[7])) {
                    play(7);
                    playermove = 7;
                }

                if(source.equals(squares[8])) {
                    play(8);
                    playermove = 8;
                }
                
        if(serverTurn == 0){
            serverTurn = 1;
        }
        else if(serverTurn == 1){
            serverTurn = 0;
        }  
        proxy.setPlayerMove(userID, serverTurn);
        System.out.println(serverTurn + "KILLMENOWPLEASESLOWELY:(");
            }
                
        }
        catch (SQLException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void takeSquare(int x, int y, int p) {
        board[x][y] = player;
    }
    
    public void play(int n) throws InterruptedException, SQLException, ClassNotFoundException {
        if(gameState == -2) {
            if(!taken(n) && numSquares > 0) {
                int p = getPlayer();
                if(numSquares == 9){
                    p = 1;
                }
                squares[n].setBackground(playerBadge[p]);
                int y = n%numSides;
                int x = (int) n/numSides;
                takeSquare(x, y, player);
                gameState = getGameState(player);
                switch(gameState) {
                    case -2:
                        player = getPlayer();
                        numSquares = numSquares - 1;
                        curPlayerID.setText("It's player " + (p + 1) + "'s move");
                        curPlayerID.setBackground(playerBadge[p]);
                       // System.out.println(player);
                        //System.out.println(n);
                        updateSquare(n);
                    break;
                    
                    case -1:
                        JOptionPane.showMessageDialog(null, "Game over.\n It's a draw", "Drawn Game!", INFORMATION_MESSAGE);
                        updateSquare(n);
                        gameOver(-1);
                    break;
                    
                    case 0: 
                       JOptionPane.showMessageDialog(null, "Game over.\n Player 1 Wins!", "PLAYER 1 WINS!", INFORMATION_MESSAGE);
                       updateSquare(n);
                       gameOver(0);
                    break;
                    
                    case 1:
                       JOptionPane.showMessageDialog(null, "Game over.\n Player 2 Wins!", "PLAYER 2 WINS!", INFORMATION_MESSAGE);
                       updateSquare(n);
                       gameOver(1);
                    break;
                    
                    default:
                }
            } else {
                JOptionPane.showMessageDialog(null, "That square is already taken.\n Please try again.", "Square taken!", ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Game Over.\n Please press reset to restart.", "Game Over", ERROR_MESSAGE);    
        }
    }
    
    public int getPlayer() {
        player = serverTurn;

       //player = serverTurn + 1;
       //player = player % 2;
        return player;
    }
    
    public int getGameState(int p) {
        int state = -2;
        
        for(int i=0;i<numSides;i++) {
            if(board[i][0] == p && board[i][1] == p && board[i][2] == p) {
                state = p;
            }
            if(board[0][i] == p && board[1][i] == p && board[2][i] == p) {
                state = p;
            }
        }
        
        if(board[0][0] == p && board[1][1] == p && board[2][2] == p) {
            state = p;
        }
        if(board[0][2] == p && board[1][1] == p && board[2][0] == p) {
            state = p;
        }
        
        if(numSquares == 1) {
            state = -1;
        }
        return state;
    }
    
    public int[][] getBoard() {
        return board;
    }
    
    public boolean taken(int n) {
        int y = n%numSides;
        int x = (int) n/numSides;
        
        board = getBoard();
        if(board[x][y] == -1) {
            return false;
        } else {
            return true;
        }
    }
    
    public void reset() throws SQLException, ClassNotFoundException, InterruptedException {
        gameState = -2;
        win = -2;
        numSquares = 9;
        
        proxy.setResetGame(userID);
            
            updateSquare(9);
            gameOver(-2);
            
        for(int i=0;i<numSides;i++) {
            for(int j=0;j<numSides;j++) {
                board[i][j] = -1;
                squares[((i*numSides) + j)].setBackground(Color.WHITE);
            }
        }
        
        curPlayerID.setText("It's player " + (player + 1) + "'s move");
        curPlayerID.setBackground(playerBadge[player]);
        
        new Thread(new Runnable() {

        @Override
        public void run() {

            try {
                // Do something
                updateBoard();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }).start();
        
        new Thread(new Runnable() {

        @Override
        public void run() {

            try {
                // Do something
                winCondition();
            } catch (SQLException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            

        }
    }).start();
    }
}