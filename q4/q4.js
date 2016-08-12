var n = readline();
n = parseInt(n);

var line;

while (n--) {
	line = readline();
    var nums = line.split(' ');
    var x = parseFloat(nums[0]);
    var y = parseFloat(nums[1]);

	x = x + 0.00001;
	
	var m1 = (2*y*x + Math.sqrt(4*Math.pow(y,2)*Math.pow(x,2) - 4*(Math.pow(x,2)-1)*(Math.pow(y,2)-1)))/(2*(Math.pow(x,2)-1));
	var c1 = y - m1*x;
	var m2 = (2*y*x - Math.sqrt(4*Math.pow(y,2)*Math.pow(x,2) - 4*(Math.pow(x,2)-1)*(Math.pow(y,2)-1)))/(2*(Math.pow(x,2)-1));
	var c2 = y - m2*x;
	
	m1 = -1*m1;
	m2 = -1*m2;
	print('(' + m1 + ',1,' + c1 + ',' +  m2 + ',1,' + c2 + ')');
	
	//print('(' + str(-1*m1) + ',' + str(1) + ',' + str(c1) + ',' + str(-1*m2) + ',' + str(1) + ',' + str(c2) + ')')
}

