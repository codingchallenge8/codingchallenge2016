var line;
var conv_dict={
    "thou":1, "th":1,
    "inch":        1000, "in":       1000,
    "foot":       12000, "ft":      12000,
    "yard":       36000, "yd":      36000,
    "chain":     792000, "ch":     792000,
    "furlong":  7920000, "fur":   7920000,
    "mile":    63360000, "mi":   63360000,
    "league": 190080000, "lea": 190080000
};



function compute(line){
    var s=line.split(' ');
    var u=s[0];
    var f=s[1];
    var t=s[3];
    
    return u * conv_dict[f]/conv_dict[t];
    
}
while (line = readline()) {
    
    print(compute(line));
}
