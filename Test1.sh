source Test1.sh

$output

expected =$(" 0.74 Pounds ")

if [[ "$result" == "${expected}" ]]; then 
		echo "Thanks for using the converter!"
else
		echo "Please input a value"
		exit 1
fi
