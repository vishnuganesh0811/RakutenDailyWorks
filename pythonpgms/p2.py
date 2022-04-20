thislist = ["apple", "banana", "cherry"]
print(thislist)

thislist = ["apple", "banana", "cherry", "apple", "cherry"]
print(thislist)

list1 = ["apple", "banana", "cherry"]
list2 = [1, 5, 7, 9, 3]
list3 = [True, False, False]

list1 = ["abc", 34, True, 40, "male"]

mylist = ["apple", "banana", "cherry"]
print(type(mylist))

thislist = list(("apple", "banana", "cherry")) # note the double round-brackets
print(thislist)

thislist = ["apple", "banana", "cherry"]
print(thislist[1])

thislist = ["apple", "banana", "cherry"]
print(thislist[-1])

thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:5])

thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:])

thislist = ["apple", "banana", "cherry"]
if "apple" in thislist:
  print("Yes, 'apple' is in the fruits list")

thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"
print(thislist)

thislist = ["apple", "banana", "cherry"]
thislist[1:2] = ["blackcurrant", "watermelon"]
print(thislist)

thislist = ["apple", "banana", "cherry"]
thislist[1:3] = ["watermelon"]
print(thislist)

thislist = ["apple", "banana", "cherry"]
thislist.insert(2, "watermelon")
print(thislist)

print("Using the append() method")

thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)

print("Using the insert() method")
thislist = ["apple", "banana", "cherry"]
thislist.insert(1, "orange")
print(thislist)

print("Using tropical to thuislist ")
thislist = ["apple", "banana", "cherry"]
tropical = ["mango", "pineapple", "papaya"]
thislist.extend(tropical)
print(thislist)

print("adding elements tuples to list")
thislist = ["apple", "banana", "cherry"]
thistuple = ("kiwi", "orange")
thislist.extend(thistuple)
print(thislist)

print("using remove() method")
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)

print("using pop() method")
thislist = ["apple", "banana", "cherry"]
thislist.pop()
print(thislist)

print("using del")
thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)

print("deleting entire list")
thislist = ["apple", "banana", "cherry"]
del thislist
print("list deleted")


print("pythons loops and lists")

thislist = ["apple", "banana", "cherry"]
for x in thislist:
  print(x)

print("for loop")
thislist = ["apple", "banana", "cherry"]
for i in range(len(thislist)):
  print(thislist[i])


print("while loop")

thislist = ["apple", "banana", "cherry"]
i = 0
while i < len(thislist):
  print(thislist[i])
  i = i + 1

print("Looping Using List Comprehension")
thislist = ["apple", "banana", "cherry"]
[print(x) for x in thislist]

