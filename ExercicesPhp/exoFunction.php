<?php
//exo1:Create a function named myFunction.
function myFunction(): void
{
    echo ("Hello World");
}

//exo2:Call (execute) a function named myFunction.
function myFunction2(): void
{
    echo "Hello World!";
}

myFunction2();

//exo3:Inside a function with two parameters, print the first parameter.
function myFunction3($fname, $lname): void
{
echo($fname);
}

//exo4:Let the function return the second value.
function myFunction4($fname, $lname): String
{
    return $lname;
}