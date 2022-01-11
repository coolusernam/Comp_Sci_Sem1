// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int num1; 
	char operation; 
	int num2; 
	int answer; 
	cout<<"Enter the first number:"<<endl;
	cin>>num1;
	cout<<"Enter the operator:"<<endl;
	cin>>operation; 
	cout<<"Enter the second number:"<<endl; 
	cin>>num2; 
	
	if(operation == "+" ){
		answer = num1 + num2; 
	}
	else if(operation == "-" ){
		answer = num1 - num2; 
	}
	else if(operation == "*"){
		answer = num1 * num2; 
	}
	else if(operation =="/"){
		answer = num1 * num2; 
	}
	cout<<answer<<endl;

}
