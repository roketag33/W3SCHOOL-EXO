<?php
//exo1:Write a correct syntax to include a file named "footer.php".
include ('footer.php');

//exo2:Assume we have a file named "webdict.txt", write the correct syntax to open and read the file content.
echo(readfile('webdict.txt'));

//exo3:Open a file, and write the correct syntax to output one character at the time, until end-of-file.
$myfile = fopen("webdict.txt","r");
while(!feof($myfile)) {
    echo fgetc($myfile);
}

//exo4:Create a cookie named "username".
setcookie("username", "John", time() + (86400 * 30), "/");

//exo5:Create a session variable named "favcolor".
session_start();
$_SESSION["favcolor"] = "green";

//exo6:Output the value of the session variable "favcolor".
echo($_SESSION["favcolor"]);