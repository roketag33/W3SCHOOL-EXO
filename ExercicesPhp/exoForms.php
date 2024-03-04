//exo1:If the form in the white section below gets submitted, how can you,
// in welcome.php, output the value from the "first name" field?

<form action="welcome.php" method="get">
    First name: <input type="text" name="fname">
</form>

<html>
<body>

Welcome <?php echo($_GET["fname"])
; ?>

</body>
</html>

//exo2:If the form in the white section below gets submitted, how can you, in welcome.php, output the value from the "first name" field?.
//Hint: The http method is not the same as in Exercise 1.

<form action="welcome.php" method="post">
    First name: <input type="text" name="fname">
</form>

<html>
<body>

Welcome <?php echo($_POST["fname"]);
; ?>

</body>
</html>

