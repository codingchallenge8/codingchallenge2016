numMinions = int(input())
list = []

index = 0;
while (index < numMinions):
    line = input()
    nums = line.split(' ')
    low = int(nums[0])
    high = int(nums[1])
    list.append((low, high))
    index = index+1

sortL = sorted(list, key=lambda x: x[0])
sortL = sorted(sortL, key=lambda x: x[1])

counter = 1
thres = sortL[0][1]
            
for i in range(len(sortL)):
    if sortL[i][0] <= thres:
        if sortL[i][1] <= thres:
            thres = sortL[i][1]
        continue
    counter = counter+1
    thres = sortL[i][1]
                        
print(counter)
