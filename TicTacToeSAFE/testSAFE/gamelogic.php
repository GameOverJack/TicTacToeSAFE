<?php include('server.php');
	if(!isset($_SESSION['board'])){
		$_SESSION['board'] = array(2,2,2,2,2,2,2,2,2);
	}

	if(!isset($_SESSION['isPlaying'])){
		$_SESSION['isPlaying'] = 1;
	}


error_reporting(E_ALL ^ E_NOTICE); 
if(!function_exists('checkGame')){
function checkGame(){
	if($_SESSION['board'][0] == 1 && $_SESSION['board'][1] == 1 && $_SESSION['board'][2] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}
	if($_SESSION['board'][0] == 1 && $_SESSION['board'][4] == 1 && $_SESSION['board'][8] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][0] == 1 && $_SESSION['board'][3] == 1 && $_SESSION['board'][6] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][1] == 1 && $_SESSION['board'][4] == 1 && $_SESSION['board'][7] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][2] == 1 && $_SESSION['board'][5] == 1 && $_SESSION['board'][8] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][3] == 1 && $_SESSION['board'][4] == 1 && $_SESSION['board'][5] ==1){
		echo "You've won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][6] == 1 && $_SESSION['board'][4] == 1 && $_SESSION['board'][2] ==1){
		echo "You've won!";
		//session_unset();
	}	

	if($_SESSION['board'][0] == 0 && $_SESSION['board'][1] == 0 && $_SESSION['board'][2] ==0){
		echo " Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}
	if($_SESSION['board'][0] == 0 && $_SESSION['board'][4] == 0 && $_SESSION['board'][8] ==0){
		echo "Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][0] == 0 && $_SESSION['board'][3] == 0 && $_SESSION['board'][6] ==0){
		echo "Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][1] == 0 && $_SESSION['board'][4] == 0 && $_SESSION['board'][7] ==0){
		echo "Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][2] == 0 && $_SESSION['board'][5] == 0 && $_SESSION['board'][8] ==0){
		echo "Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][3] == 0 && $_SESSION['board'][4] == 0 && $_SESSION['board'][5] ==0){
		echo "Player two won!";
		$_SESSION['isPlaying'] = 0;
		//session_unset();
	}

	if($_SESSION['board'][6] == 0 && $_SESSION['board'][4] == 0 && $_SESSION['board'][2] ==0){
		echo "Player two won!";
		//session_unset();
	}	
}
}

if(isset($_POST['button1']) && $_SESSION['board'][0] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	//testing();
	//echo "bal";
	//echo $_SESSION['serverturn']."  working" ;
	if( $_SESSION['serverturn'] == 1){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = 'vars'";
		//mysqli_query($db,$query);
	}
	//echo $_SESSION['serverturn']."  working" ;
	if( $_SESSION['serverturn'] == 0){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	//comment the lines using $query
	//$query = "UPDATE game set square = 0 where player1 = '$vars' OR player1 = '$vars'";
	//mysqli_query($db,$query);
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 0));
	$_SESSION['board'][0] = 1;
	checkGame();
	echo $_SESSION['board'][0];
}
if(isset($_POST['button2']) && $_SESSION['board'][1] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	echo $_SESSION['serverturn']."  working" ;
	if( $_SESSION['serverturn'] == 1){
		$var = $_SESSION['currentopponent'];
		echo "hello";
		echo "Not kys";
		$vars = $_SESSION['username'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['serverturn'] == 0){
		//echo "kys";
		//echo "hi";
		$vars = $_SESSION['username'];
		//echo $vars;
		//echo "banana";
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}

	$_SESSION['board'][1] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	echo $vars;
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 1));
	//$query = "UPDATE game set square = 1 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();
	echo $_SESSION['board'][1];
}

echo $_SESSION['serverturn']."  ".$_SESSION['playerturn'];
if(isset($_POST['button3']) && $_SESSION['board'][2] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['serverturn'] == 1){
		echo "asdfg";
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['serverturn'] == 0){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];

		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	//testing();
	$_SESSION['board'][2] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 2));
	//$query = "UPDATE game set square = 2 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();	
	echo $_SESSION['board'][2];
}
if(isset($_POST['button4']) && $_SESSION['board'][3] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
		$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
		$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	$_SESSION['board'][3] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 3));
	//$query = "UPDATE game set square = 3 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();
	echo $_SESSION['board'][3];
}
if(isset($_POST['button5']) && $_SESSION['board'][4] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	echo "blep";
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 4));
	//$query = "UPDATE game set square = 4 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	$_SESSION['board'][4] = 1;
	checkGame();
	echo $_SESSION['board'][4];
}
if(isset($_POST['button6']) && $_SESSION['board'][5] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
		$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	$_SESSION['board'][5] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 5));
	//$query = "UPDATE game set square = 5 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();
	echo $_SESSION['board'][5];
}

if(isset($_POST['button7']) && $_SESSION['board'][6] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
		$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
		$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	$_SESSION['board'][6] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 6));
	//$query = "UPDATE game set square = 6 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();
	echo $_SESSION['board'][6];
}
if(isset($_POST['button8']) && $_SESSION['board'][7] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	$_SESSION['board'][7] = 1;
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 7));
	//$query = "UPDATE game set square = 7 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	checkGame();
}

if(isset($_POST['button9']) && $_SESSION['board'][8] == 2 && $_SESSION['isPlaying'] == 1 && $_SESSION['playerturn'] == $_SESSION['serverturn']){
	if( $_SESSION['playerturn'] == 0){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 1;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 1));
		//$query = "UPDATE game set playermove = 1 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	if( $_SESSION['playerturn'] == 1){
		$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
		$_SESSION['serverturn'] = 0;
		$varz = $_SESSION['serverturn'];
		//replace
		$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->setPlayerMove(array("userID" => $vars, "serverTurn" => 0));
		//$query = "UPDATE game set playermove = 0 where player1 = '$vars' or player2 = '$vars'";
		//mysqli_query($db,$query);
	}
	echo $_SESSION['board'][8];
	$var = $_SESSION['currentopponent'];
	$vars = $_SESSION['username'];
	//replace
	$proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
    $proxy->updateSquare(array("userID" => $vars, "square" => 8));
	//$query = "UPDATE game set square = 8 where player1 = '$vars' OR player1 = '$var'";
	//mysqli_query($db,$query);
	$_SESSION['board'][8] = 1;
	checkGame();
}




 ?>