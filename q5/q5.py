
test_cases = int(raw_input())

for n in range(test_cases):
	cmd = raw_input().strip()
	num = raw_input().strip()
	num_array = raw_input().strip()[1:-1].split(',')
	if num_array != ['']:
		num_array = map(int,num_array)
	else:
		num_array = []


	p1 = 0
	p2 = len(num_array)-1
	if len(num_array) == 0:
		p2 = -1
		p1 = -1

	order = 1
	error = False
	for c in cmd:
		
		if c == 'R':
			order *= -1
		elif c == 'D':
			if p2 - p1 < 0 or p1 == -1:
				print('error')
				error = True
				break
			if order == 1:
				p1 += 1
			elif order == -1:
				p2 -= 1
		#print [p1, p2, order, num_array[p1:p2+1]]

	if error == False:
		
		if order == -1:
			num_array = num_array[p1:p2+1]
			num_array = num_array[::-1]
		else:
			num_array = num_array[p1:p2+1]

		print(str(num_array).replace(' ', ''))
		


'''
4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
6
[1,1,2,3,5,8]
D
0
[]

'''