list1=[5,7,4,2,3,9,8]
list2=[9,2,5,2,3,9,6]

print("First List", list1)
print("Second List", list2)

ThirdList=[]

for num in list1:
    if (num%2!=0):
        ThirdList.append(num)


for num in list2:
    if (num%2==0):
        ThirdList.append(num)

print("Result List:")
print(ThirdList)