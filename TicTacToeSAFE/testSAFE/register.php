<?php include('server.php'); 
if (isset($_SESSION['previous'])) {
   if (basename($_SERVER['PHP_SELF']) != $_SESSION['previous']) {
        session_destroy();
        ### or alternatively, you can use this for specific variables:
        ### unset($_SESSION['varname']);
   }
}?>
<!DOCTYPE html>
<html>
<head>
	<title> User registration system using PHP and MySQL</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	
	<div class="header">
		<h2>Registration</h2>
	</div>
	<form method="post" action = "register.php">
		<?php include('errors.php');  ?>
		<div class = "input-group">
			<label>Username</label>
			<input type="text" name="username">
		</div>
		<div class = "input-group">
			<label>Password</label>
			<input type="password" name="password">
		</div>
		<div class="input-group">
		<button type = "submit" name="registers" class = "btn">Register</button>
		</div>
		<p>Already a member? <a href="login.php">Sign in</p>



	</form>

</body>
</html>