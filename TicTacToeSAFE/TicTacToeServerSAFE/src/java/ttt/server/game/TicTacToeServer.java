/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.server.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author Jack
 */
@WebService(serviceName = "TicTacToeServer")
public class TicTacToeServer {
    //works
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        boolean validID = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            String sqlCmd = "select * from gamesearch";
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sqlCmd);
                while(rs.next() && !validID){
                    if(rs.getString(2).equals(username)){
                        if(rs.getString(3).equals(password))
                        {
                            validID = true;
                        }
                    }
                    
                }
                conn.close();
            } catch(Exception e) {
                System.out.println( "LOGIN ERROR" );
            }
        } catch(ClassNotFoundException ex) {
                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return validID;
    }
    //works
    //returns if registeration was successful
    @WebMethod(operationName = "register")
    public boolean register(@WebParam(name = "username") String username, @WebParam(name = "password") String password){
        boolean regSuccess = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from gamesearch");
            try {
                while(rs.next() && !regSuccess){
                    if(rs.getString(2).equals(username)){
                        if(rs.getString(3).equals(password))
                        {
                            regSuccess = false;
                        }
                    }
                    else{
                        String query = "insert into gamesearch (accountID, username, password, isCreated, isFound, wins, loses, Draws)" + " values (?,?,?,?,?,?,?,?)";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setInt(1, 0);
                        ps.setString(2, username);
                        ps.setString(3, password);
                        ps.setInt(4, 0);
                        ps.setInt(5, 0);
                        ps.setInt(6, 0);
                        ps.setInt(7, 0);
                        ps.setInt(8, 0);
                        ps.execute();
                        conn.close();
                        regSuccess = true;
                    }
                    
                }
            } catch(Exception e) {
                System.out.println( "Registration ERROR" );
            }
        } catch(SQLException ex) {
                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regSuccess;
    }
    //works
    @WebMethod(operationName = "updateIsCreated")
    public void updateIsCreated(@WebParam(name = "username") String username, @WebParam(name = "isCreated") int value) {
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
                    PreparedStatement ps = conn.prepareStatement("Update gamesearch set isCreated =? where username =?");
                    ps.setInt(1, value);
                    ps.setString(2, username);
                    ps.executeUpdate();
                    conn.close();
                } 
                catch (Exception ex) {
                    System.out.println(ex);
                }
    }
    //works
    @WebMethod(operationName = "updateIsFound")
    public void updateIsFound(@WebParam(name = "username") String username, @WebParam(name = "value") int value) {
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
                    PreparedStatement ps = conn.prepareStatement("Update gamesearch set isFound =? where username =?");
                    ps.setInt(1, value);
                    ps.setString(2, username);
                    ps.executeUpdate();
                    conn.close();
                } 
                catch (Exception ex) {
                    System.out.println(ex);
                }
    }
    //works
    @WebMethod(operationName = "isFoundReset")
    public boolean isFoundReset(@WebParam(name = "username") String username) {
        boolean isFound = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st  = conn.createStatement();
            st.executeQuery("Select * from gamesearch where isFound =1");
            ResultSet rs = st.getResultSet();
            String result = "";
            while(rs.next()){
                result+= rs.getString("username") + ",";
            }
            String[] idArray = result.split(",");
            for(int i = 0; i < idArray.length;i++){
                if(idArray[i].equals(username))
                {
                    isFound = true;
                    
                    try {
                        int found = 0;
                        Class.forName("com.mysql.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
                        PreparedStatement ps = conn.prepareStatement("Update gamesearch set isCreated =? where username =?");
                        //ResultSet rs = ps.executeQuery("select * from login");
                        ps.setInt(1, found);
                        ps.setString(2, username);
                        ps.executeUpdate();
                        conn.close();
                    }
                    catch (Exception ex) {                
                        System.out.println(ex);
                    }
                }
            }
            if(conn != null)
                try{
                    conn.close();
                }catch(SQLException e){
                    
                }

        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return isFound;
    }
    //works
    @WebMethod(operationName = "showLeaderboards")
    public ArrayList<String> showLeaderboards(){
        ArrayList list = new ArrayList<String>();
        String wins = "";
        String draws = "";
        String loses = "";
        String result = "";
        String username = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
                PreparedStatement ps = conn.prepareStatement("Select * from gamesearch ORDER BY wins DESC");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    wins = rs.getString("wins");
                    loses = rs.getString("loses");
                    draws = rs.getString("Draws");
                    username = rs.getString("username");
                    result = "USERNAME:           " + username + "           WINS:          " + wins + "          LOSSES         " + loses + "            DRAWS           " + draws;
                    list.add(result);
                    list.add("");
                }
                conn.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
                result += "hah";
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
            return list;
                    
    }
    
    @WebMethod(operationName = "joinGame")
    public boolean joinGame(@WebParam(name = "uName") String uName, @WebParam(name = "userID") String userID) {
        boolean uFound = false;
        try {
            int isCreated = 0;
            Connection connection;
            PreparedStatement ps;;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gamesearch");
            while(rs.next() && !uFound){
                if(rs.getString(2).equals(uName)){
                    uFound = true;
                    isCreated = 1;
                }
            }
            
            if(isCreated == 1){
                int found = 1;
                ps = connection.prepareStatement("Update gamesearch set isFound =? where username =?");
                ps.setInt(1, found);
                ps.setString(2, uName);
                ps.executeUpdate();
                connection.close();
                //resetFound(uName,userID);
                int player = 1;
            }
            
            return uFound;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uFound;
    }
    
    //From joingame
    @WebMethod(operationName = "resetFound")
    public void resetFound(@WebParam(name = "uName") String uName, @WebParam(name = "userID") String userID) {
                try {
                        int reset = 0;
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
                        PreparedStatement ps = connection.prepareStatement("Update gamesearch set isFound=? where username =?");
                        ps.setInt(1, reset);
                        ps.setString(2, uName);
                        ps.executeUpdate();
                        String query = "insert into game (player1, player2, square, resetGame, playerMove, winLose)" + " values (?,?,?,?,?,?)";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, userID);
                        ps.setString(2, uName);
                        ps.setInt(3, 9);
                        ps.setInt(4, 0);
                        ps.setInt(5, 1);
                        ps.setInt(6, -2);
                        ps.execute();
                        connection.close();
                    } 
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null,ex);
                    } catch (SQLException ex) {
                Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @WebMethod(operationName = "showComboBox")
    public String[] showComboBox() {
        String[] idArray = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = connection.createStatement();
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            st.executeQuery("Select * from gamesearch where isCreated =1");
            ResultSet rs = st.getResultSet();
            String result = "";
            while(rs.next()){
                result+= rs.getString("username") + ",";
            }
            idArray = result.split(",");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idArray;
    }
    
    @WebMethod(operationName = "showPlayerMove")
    public int showPlayerMove(@WebParam(name = "serverTurn") int serverTurn, @WebParam(name = "userID") String userID){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from game");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                serverTurn = Integer.parseInt(rs.getString("playerMove"));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            serverTurn = 8;
        } catch (ClassNotFoundException ex) {
            serverTurn = 8;
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serverTurn;
    }
    
      @WebMethod(operationName = "getPlayerMove")
    public int getPlayerMove(@WebParam(name = "userID") String userID){
        int serverTurn = 2;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from game where player1 = '" + userID +"' OR player2 = '" + userID +"'");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                serverTurn = Integer.parseInt(rs.getString("playerMove"));
            } 
            return serverTurn;
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            serverTurn = 8;
        } catch (ClassNotFoundException ex) {
            serverTurn = 8;
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serverTurn;
    }
    
    @WebMethod(operationName = "resetGame")
    public int resetGame(@WebParam(name = "userID") String userID, @WebParam(name = "win") int win){
        int resetGame = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from game");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                resetGame = Integer.parseInt(rs.getString("resetGame"));
            }
            if(resetGame == 1)
            {
                win = -2;
                PreparedStatement ps;
                
                ps = conn.prepareStatement("Update game set resetGame =? where player1 =? OR player2 =?");
                ps.setInt(1, 0);
                ps.setString(2, userID);
                ps.setString(3, userID);
                ps.executeUpdate();
                conn.close();
            }
            
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
            return win;
        }
    
    @WebMethod(operationName = "getWinLose")
    public int getWinLose(@WebParam(name = "win") int win, @WebParam(name = "userID") String userID){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from game");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                win = Integer.parseInt(rs.getString("winLose"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return win;
    }
    
    @WebMethod(operationName = "getSquare")
    public int getSquare( @WebParam(name = "userID") String userID){
        int playermove = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("SELECT * FROM game WHERE player1 = '" + userID + "' OR player2 = '" + userID + "'");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                playermove = rs.getInt(3);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playermove;
    }
    //works
    @WebMethod(operationName = "setWins")
    public void setWins( @WebParam(name = "userID") String userID){
        int wins = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from gamesearch");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                wins = Integer.parseInt(rs.getString("wins"));
            }
            PreparedStatement ps = conn.prepareStatement("Update gamesearch set wins =? where username =?");
                ps.setInt(1, (wins+1));
                ps.setString(2, userID);
                ps.executeUpdate();
                conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //works
    @WebMethod(operationName = "setLoses")
    public void setLoses( @WebParam(name = "userID") String userID){
        int losses = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from gamesearch");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                losses = Integer.parseInt(rs.getString("loses"));
            }
            PreparedStatement ps = conn.prepareStatement("Update gamesearch set loses =? where username =?");
                losses++;
                ps.setInt(1, losses);
                ps.setString(2, userID);
                ps.executeUpdate();
                conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
        
    }
    //works
    @WebMethod(operationName = "setDraws")
    public void setDraws( @WebParam(name = "userID") String userID){
        int draws = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from gamesearch");
            ResultSet rs = st.getResultSet();
            while(rs.next() && (rs.getString(1).equals(userID) || rs.getString(2).equals(userID))){
                draws = Integer.parseInt(rs.getString("Draws"));
            }
            PreparedStatement ps = conn.prepareStatement("Update gamesearch set Draws =? where username =?");
                ps.setInt(1, (draws+1));
                ps.setString(2, userID);
                ps.executeUpdate();
                conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @WebMethod(operationName = "updateSquare")
    public void updateSquare( @WebParam(name = "userID") String userID, @WebParam(name = "square") int square){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            PreparedStatement ps = connection.prepareStatement("Update game set square =? where player1 =? OR player2 =?");
            ps.setInt(1, square);
            ps.setString(2, userID);
            ps.setString(3, userID);
            ps.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @WebMethod(operationName = "setWinLose")
    public void setWinLose( @WebParam(name = "userID") String userID, @WebParam(name = "winLose") int winLose){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            PreparedStatement ps = connection.prepareStatement("Update game set winLose =? where player1 =? OR player2 =?");
            ps.setInt(1, winLose);
            ps.setString(2, userID);
            ps.setString(3, userID);
            ps.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @WebMethod(operationName = "setPlayerMove")
    public int setPlayerMove( @WebParam(name = "userID") String userID, @WebParam(name = "serverTurn") int serverTurn){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            PreparedStatement ps = connection.prepareStatement("Update game set playerMove = '" + serverTurn + "' where player1 = '" + userID + "' OR player2 = '" + userID + "'");
            ps.executeUpdate();
            connection.close();
            return serverTurn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            return serverTurn;
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
            return serverTurn;
        }

    }
    
    @WebMethod(operationName = "setResetGame")
    public void setResetGame( @WebParam(name = "userID") String userID){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            PreparedStatement ps = connection.prepareStatement("Update game set resetGame =? where player1 =? OR player2 =?");
            ps.setInt(1, 1);
            ps.setString(2, userID);
            ps.setString(3, userID);
            ps.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @WebMethod(operationName = "getIsFound")
    public int getIsFound(@WebParam(name = "userID") String userID){
            int isFound = 0;        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("Select * from gamesearch");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
             if(rs.getString(2).equals(userID)){
                isFound = Integer.parseInt(rs.getString("isFound"));
             } 
            }
            conn.close();
            return isFound;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isFound;
    }
    
    @WebMethod(operationName = "getPlayer1")
    public String getPlayer1(@WebParam(name = "userID") String userID){
        String result = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("SELECT * FROM game WHERE player1 = '" + userID + "' OR player2 = '" + userID + "'");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                result = rs.getString(1);
            }
            conn.close();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    @WebMethod(operationName = "getPlayer2")
    public String getPlayer2(@WebParam(name = "userID") String userID){
        String result = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("SELECT * FROM game WHERE player1 = '" + userID + "' OR player2 = '" + userID + "'");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                result = rs.getString(2);
            }
            conn.close();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    @WebMethod(operationName = "getLeaderSplit")
    public String getLeaderSplit(){
        String result = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverable3","root", "");
            Statement st = conn.createStatement();
            st.executeQuery("SELECT * FROM gamesearch ORDER BY wins DESC");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                result += rs.getString(2) + ":" + rs.getInt(6) + ":" + rs.getInt(7) + ":" + rs.getInt(8) + ",";
            }
            conn.close();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
