// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int sum; 
	int num = 10; 
	int sub = 20; 
	int total = 1; 
	for(int i = 0; i < 30; i++){
		num = num + i; 
		sum = num + total; 
		sub = sub - sum;
		i++; 
	}
	cout << sub; 
	
	}			  
	


