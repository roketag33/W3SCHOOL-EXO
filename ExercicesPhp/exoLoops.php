<?php
//exo1:Output $i as long as $i is less than 6.
$i = 1;
while($i<6){
    echo($i);
    $i++;
}
//exo2:Output $i as long as $i is less than 6.
$i = 1;
do {
    echo($i);
    $i++;
}while($i <6);

//exo3:Create a loop that runs from 0 to 9.
for($i = 0; $i <10;$i++){
    echo($i);
}

//exo4:Loop through the items in the $colors array.
$colors = array("red","green","blue","yellow");
foreach($colors as $x){
    echo($x);
}