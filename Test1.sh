#!/bin/bash
amount="1 EUROS"
correctP="1.0 Pounds = 1.36 Dollars 1.0 Pound = 1.19 Euros Thank you for using the converter."
correctD="1.0 Dollars = 0.74 Pounds 1.0 Dollars = 0.88 Euros Thank you for using the converter."
correctE="1.0 Euros = 1.31 Dollars 1.0 Euros = 0.84 Pounds Thank you for using the converter."
var=$(java CurrencyConverter $amount)
	echo "Welcome"
	echo "Recording Demo"
if [ ! -n "$var" ]
then
       echo "A Value must be inputted"
else
        echo "Test Passed Value picked up"
fi
if [ "$amount" == "1 dollars" ] || [ "$amount" == "1 pounds" ] || [ "$amount" == "1 euros" ] || [ "$amount" == "1 Dollars" ] || [ "$amount" == "1 Pounds" ] || [ "$amount" == "1 Euros" ] || [ "$amount" == "1 DOLLARS" ] || [ "$amount" == "1 POUNDS" ] || [ "$amount" == "1 EUROS" ]
then 
	echo "Test Passed Format correct"
else 
	echo $amount
	echo "Input must be in correct format e.g 50 dollars, 50 Dollars, 50 DOLLARS"
fi
if [ "$correctP" == "$var" ] || [ "$correctD" == "$var" ] || [ "$correctE" == "$var" ]
then
        echo "Test Passed Conversion Correct"
else
        echo "Conversion Not Correct. 1 Dollar = 0.74 Pounds, 0.88 Euros 1 Pound = 1.36 Dollars, 1.19 Euros 1 Euro = 1.13 Dollars, 0.84 Pounds."
	echo $var
fi


