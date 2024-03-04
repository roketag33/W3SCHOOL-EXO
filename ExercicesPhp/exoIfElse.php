<?php
//exo1:Output "Hello World" if $a is greater than $b.
$a = 50;
$b = 10;
if ($a > $b){
    echo ("Hello World");
}
//exo2:Output "Hello World" if $a is NOT equal to $b.
$a = 50;
$b = 10;
if ($a != $b){
    echo("Hello World");
}

//exo3: Output "Yes" if $a is equal to $b, otherwise output "No".
$a = 50;
$b = 10;
if ($a==$b){
    echo("Yes");
} else {
    echo("No");
}
//exo4:Output "1" if $a is equal to $b, print "2" if $a is greater than $b, otherwise output "3".
$a = 50;
$b = 10;
if ($a==$b){
    echo(1);
} elseif($a >$b) {
    echo(2);
} else {
    echo(3);
}