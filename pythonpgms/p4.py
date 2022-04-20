print("----------------Python Sets----------------")
myset = {"apple", "banana", "cherry"}

print("Creating set")
thisset = {"apple", "banana", "cherry"}
print(thisset)

print("Duplicates are ignored in set")
thisset = {"apple", "banana", "cherry", "apple"}
print(thisset)

print("length of set")
thisset = {"apple", "banana", "cherry"}

print(len(thisset))

print("different data type sets")
set1 = {"apple", "banana", "cherry"}
set2 = {1, 5, 7, 9, 3}
set3 = {True, False, False}

print("single set with different datatype values")
set1 = {"abc", 34, True, 40, "male"}

print("type of set")
myset = {"apple", "banana", "cherry"}
print(type(myset))

print("set constructor")
thisset = set(("apple", "banana", "cherry")) # note the double round-brackets
print(thisset)


print("accessing sets using for loops")
thisset = {"apple", "banana", "cherry"}

for x in thisset:
  print(x)

print("using add() mehtod")
thisset = {"apple", "banana", "cherry"}

thisset.add("orange")

print(thisset)

print("tropical and this set")
thisset = {"apple", "banana", "cherry"}
tropical = {"pineapple", "mango", "papaya"}

thisset.update(tropical)

print(thisset)

print("removing set items")
thisset = {"apple", "banana", "cherry"}

x = thisset.pop()

print(x)

print(thisset)

print("discard()")
thisset = {"apple", "banana", "cherry"}

thisset.discard("banana")

print(thisset)

print("remove()")
thisset = {"apple", "banana", "cherry"}

thisset.remove("banana")

print(thisset)

print("loop sets")
thisset = {"apple", "banana", "cherry"}

for x in thisset:
  print(x)


print("joining sets")

print("Union()")
set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}

set3 = set1.union(set2)
print(set3)

print("update()")
set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}

set1.update(set2)
print(set1)

print("Intersection update")
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

x.intersection_update(y)

print(x)

print("intersection()")
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

z = x.intersection(y)

print(z)

print("symmetric difference update")
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

x.symmetric_difference_update(y)

print(x)

print("symmetric difference")
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

z = x.symmetric_difference(y)

print(z)