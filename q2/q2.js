var line = readline();
var numMinions = parseInt(line);
var list = [];

var index = 0;
while (index < numMinions) {
    line = readline();
    var nums = line.split(' ');
    var low = parseInt(nums[0]);
    var high = parseInt(nums[1]);
    list.push({x:low, y:high});
    index++;
}

list.sort(function(a,b){
    if (a.x < b.x) return -1;
    if (a.x > b.x) return 1;
    if (a.y < b.y) return -1;
    if (a.y > b.y) return 1;
    return 0;
});

var counter = 1;
var thres = list[0].y;

for (var i = 0;i<list.length;i++){
    if (list[i].x <= thres) {
        if (list[i].y <= thres) {
            thres = list[i].y;
        }
        continue;
    }
    counter++;
    thres = list[i].y;
    
}
print(counter);
