<?php include('server.php');  ?>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<h2>Wait here for someone to accept your game!</h2>

	<?php
$page = $_SERVER['PHP_SELF'];
$sec = "1";
?>
<html>
    <head>
    <meta http-equiv="refresh" content="<?php echo $sec?>;URL='<?php echo $page?>'">
    </head>
    <body>
    <?php
       // echo "Watch the page reload itself in 1 second!";
        $username = $_SESSION['username'];
        echo $username;
       /*  $query = "SELECT * FROM gamesearch where username = '$username'";
   		 $results = mysqli_query($db,$query);
   		 if (!$results) { // add this check.
    		die('Invalid query: ' . mysql_error());
			}
   		 //echo "hi";
   		 $var = 0;
   		 $ri=mysqli_fetch_array($results);
   		// print_r($ri);
    */
       $proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $var = 0;
   		 	$vars = $proxy->getIsFound(array('userID' => $username));
        $var = (int)$vars->return;
        echo $var;

   		 if($var ==1){
        echo hello;
        $proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
        $proxy->updateIsCreated(array("username" => $username, "isCreated" =>0));
        header('location: game.php');

        // 
       // $query = "UPDATE gamesearch set isCreated = 0 where username = '$username'";
        //mysqli_query($db,$query);
   		 	
   		 } 
    ?>
    </body>
</html>

