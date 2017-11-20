<!DOCTYPE html>
<html>
<head>
	<title></title>
	<h2>Leaderboard</h2>
	 <table class="gradienttable">
        <tr>
          <th>Ranking</th>
          <th>UserName</th>      
         <th>Wins</th>
         <th>Losses</th>
         <th>Draws</th>
        </tr>
  <?php
  		include('server.php');
  		//replace
    $proxy = new SoapClient("http://localhost:53340/TicTacToeServer/TicTacToeServer?wsdl",array('trace' => true, 'exceptions' => true));
     $varR = $proxy->getLeaderSplit();
     $varResult = $varR->return;
     $leadArray = explode(",", $varResult);
  		//$query = "SELECT * FROM gamesearch ORDER BY wins DESC";
  		//$result = mysqli_query($db,$query);
  		$ranking = 1;
         foreach($leadArray as $splitArray){
           $finalsplit = explode(":", $splitArray);
           ?>
           <tr>
             <td><?php echo $ranking; ?></td>
             <td><?php echo $finalsplit[0]; ?></td>       
             <td><?php echo $finalsplit[1]; ?></td>
             <td><?php echo $finalsplit[2]; ?></td>
             <td><?php echo $finalsplit[3]; ?></td>
           <?php
             $ranking = $ranking + 1; /* INCREMENT RANKING BY 1 */
           ?>
           </tr>
       <?php
         } /* END OF WHILE LOOP */
       ?>

      </table>
</head>
<body>

</body>
</html>