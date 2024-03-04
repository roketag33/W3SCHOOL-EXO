<?php
//Exo1:Use the correct function to output the number of items in an array.
$fruits = array("Apple", "Banana", "Orange");
echo(count($fruits));

//exo2:Output the second item in the $fruits array.
$fruits = array("Apple", "Banana", "Orange");
echo($fruits[1]);

//exo3:Create an associative array containing the age of Peter, Ben and Joe.
$age = array("peter"=>"35","ben"=>"37", "joe"=>"43");

//exo4:Here you see an associative array. Output "age" of Ben.
$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
echo("ben is ".$age['Ben']."years old.");

//exo5:Loop through an associative array and output the key and the value.
foreach($age as $x => $y){
    echo("key=" .$x. ",Value =".$y);
}

//exo6:Use the correct array method to sort the $colors array alphabetically.
$colors = array("red", "green", "blue", "yellow");
sort($colors);

//exo7:Use the correct array method to sort the $colors array descending alphabetically.
$colors = array("red", "green", "blue", "yellow");
rsort($colors);

//exo8:Use the correct array method to sort the $age array according to the values.
$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
asort($age);