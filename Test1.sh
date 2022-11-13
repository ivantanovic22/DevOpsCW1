#!/bin/bash
amount="1 dollars"
var=[ java CurrencyConverter $amount ]
if [ "$var" == 0.74 ]
then
        echo "Thanks"
else
        echo "failed"
fi
if [ ! -n "$var" ]
then
      echo "A Value must be inputted"
else
  echo "Test Passed"
fi
if [ "$amount" == "1 dollars" ] || [ "$amount" == "1 pounds" ] || [ "$amount" == "1 euros" ]
then 
	echo "Test Passed"
else 
	echo "Input must be in correct format e.g 50 dollars"
fi
if [ "$amount" == "1 Dollars" ] || [ "$amount" == "1 Pounds" ] || [ "$amount" == "1 Euros" ]
then 
	echo "Test Passed"
else
	echo "Test Failed"
fi
if [ "$amount" == "1 DOLLARS" ] || [ "$amount" == "1 POUNDS" ] || [ "$amount" == "1 EUROS" ]
then
        echo "Test Passed"
else
        echo "Test Failed"
fi

