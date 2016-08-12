conv_dict = {
    "thou":           1, "th":          1,
    "inch":        1000, "in":       1000,
    "foot":       12000, "ft":      12000,
    "yard":       36000, "yd":      36000,
    "chain":     792000, "ch":     792000,
    "furlong":  7920000, "fur":   7920000,
    "mile":    63360000, "mi":   63360000,
    "league": 190080000, "lea": 190080000
}



input_str = input()
parse_ip = input_str.split(' ')
u = float(parse_ip[0])
f = parse_ip[1]
garbage = parse_ip[2]
t = parse_ip[3]
print(str(u * conv_dict[f]/conv_dict[t]) + '\n')
