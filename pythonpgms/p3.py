print("--------------Tuples----------------")

mytuple = ("apple", "banana", "cherry")
print("-------------creating a tuple-----------")
thistuple = ("apple", "banana", "cherry")
print(thistuple)

print("tuples allow duplicate values")
thistuple = ("apple", "banana", "cherry", "apple", "cherry")
print(thistuple)

print("the number of items in tuples")
thistuple = ("apple", "banana", "cherry")
print(len(thistuple))


print("create tuple with one item")
thistuple = ("apple",)
print(type(thistuple))

#NOT a tuple
thistuple = ("apple")
print(type(thistuple))

print("different datatype tuples")
tuple1 = ("apple", "banana", "cherry")
tuple2 = (1, 5, 7, 9, 3)
tuple3 = (True, False, False)

print("using type()")
mytuple = ("apple", "banana", "cherry")
print(type(mytuple))

print("tuple constructor")
thistuple = tuple(("apple", "banana", "cherry")) # note the double round-brackets
print(thistuple)


print("---------------------------------------------------------")
print("Accessing tuple items")

thistuple = ("apple", "banana", "cherry")
print(thistuple[1])

print("Printing last item of tuple")
thistuple = ("apple", "banana", "cherry")
print(thistuple[-1])

print("range of indexes")
thistuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(thistuple[2:5])

print("check if apple is present")
thistuple = ("apple", "banana", "cherry")
if "apple" in thistuple:
  print("Yes, 'apple' is in the fruits tuple")

print("------------------------------------------------------------")
print("Updating tuples")
x = ("apple", "banana", "cherry")
y = list(x)
y[1] = "kiwi"
x = tuple(y)
print(x)

print("convert to a list")
thistuple = ("apple", "banana", "cherry")
y = list(thistuple)
y.append("orange")
thistuple = tuple(y)

print("adding tuple to a tuple")
thistuple = ("apple", "banana", "cherry")
y = ("orange",)
thistuple += y

print(thistuple)
print("------------------------------------------------------------")
print("Unpacking a tuple")
fruits = ("apple", "banana", "cherry")

(green, yellow, red) = fruits

print(green)
print(yellow)
print(red)

print("Using asterisk *")
fruits = ("apple", "banana", "cherry", "strawberry", "raspberry")

(green, yellow, *red) = fruits

print(green)
print(yellow)
print(red)

print("tropic variables")
fruits = ("apple", "mango", "papaya", "pineapple", "cherry")

(green, *tropic, red) = fruits

print(green)
print(tropic)
print(red)


print("for loop ")
thistuple = ("apple", "banana", "cherry")
for x in thistuple:
  print(x)

print("printing item by index number")
thistuple = ("apple", "banana", "cherry")
for i in range(len(thistuple)):
  print(thistuple[i])

print("using while loop")
thistuple = ("apple", "banana", "cherry")
i = 0
while i < len(thistuple):
  print(thistuple[i])
  i = i + 1

print("join two tuples")
tuple1 = ("a", "b" , "c")
tuple2 = (1, 2, 3)

tuple3 = tuple1 + tuple2
print(tuple3)

print("Multiply tuples")
fruits = ("apple", "banana", "cherry")
mytuple = fruits * 2

print(mytuple)


print("count()")
thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)

x = thistuple.count(5)

print(x)

print("index()")
thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)

x = thistuple.index(8)

print(x)

print("len()")
fruits = ("apple", "banana", "cherry")
print(
len(fruits)
)
