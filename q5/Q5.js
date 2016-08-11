
var numTestCases = parseInt(readline());
var index = 0;
while (index < numTestCases) {
	var cmds = readline();
	var numInt = parseInt(readline());
	var line = readline();
	line = line.slice(1, -1);
	var strArr = line.split(',');
	
	for (var i = 0, len = cmds.length; i < len; i++) {
	  var cmd = cmds[i];
	  if (cmd == 'D'){
	  	if(strArr.length ==0 || numInt==0){
	  		print("error");
	  		break;
	  	}else{
	  		// 2 methods below, both TLE :(
	  		
	  		// Reversing and then popping and then reversing
	  		// strArr = temporarySwap(strArr);
	  		// strArr.pop();
	  		// strArr = temporarySwap(strArr);
	  		
	  		// Using shift
	  		strArr.shift();
	  	}
	  }else if(cmd == 'R'){
	  	strArr = temporarySwap(strArr);
	  }
	  
	  if (i == len - 1) {
	  	// var str = '[';
	  	
	  	// for(var j = 0 ; j < strArr.length; j++) {
	  	// 	if(j==0) str+=''+strArr[j];
	  	// 	else str+=','+strArr[j];
	  	// }
	  	// print(str+']');
	  	print('['+strArr+']');
	  }
	  	
	}
	
    index++;
}

function temporarySwap(array)
{
    var left = null;
    var right = null;
    var length = array.length;
    for (left = 0, right = length - 1; left < right; left += 1, right -= 1)
    {
        var temporary = array[left];
        array[left] = array[right];
        array[right] = temporary;
    }
    return array;
}
