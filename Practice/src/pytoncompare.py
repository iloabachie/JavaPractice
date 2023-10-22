
def time_string_duration(time):
    years, secs_left = divmod(time, 365 * 24 * 60 * 60)
    days, secs_left = divmod(secs_left, 24 * 60 * 60)
    hours, secs_left = divmod(secs_left, 60 * 60)
    minutes, seconds = divmod(secs_left, 60)
    print("{:16d}".format(
        time) + f" seconds = {years} years, {days} days, {hours} hours, {minutes} minutes, {seconds} seconds")


def time_string_duration2(time):
    years, secs_left = divmod(time, 365 * 24 * 60 * 60)
    days, secs_left = divmod(secs_left, 24 * 60 * 60)
    hours, secs_left = divmod(secs_left, 60 * 60)
    minutes, seconds = divmod(secs_left, 60)
    print("{:16d} seconds = {:8d} years, {:8d} days, {:8d} hours, {:8d} minutes, {:8d} seconds".format(
        time, years, days, hours, minutes, seconds))


time = [1_000_000_000_000_000, 1_000_000_000_000,
        1_000_000_000, 1_000_000, 1_000, 9223372036854775807]

for t in time:
    time_string_duration(t)


for t in time:
    time_string_duration2(t)

i = 0
count = 0

def is_prime(num):
    global count
    if num <= 2:
        return num == 2
    
    for divisor in range(2, num//2 + 1):
        if num % divisor == 0:
            # print(count)
            print((count:=count+1)**2)
            return False
    return True


for i in range(10):
    print(i, is_prime(i))
    # is_prime(i)


for j in range(10):
    print((i:=i+3)*0.25)
    print(i)
    

def is_odd(number):
    if number < 1:
        return False
    return (number%2 != 0)

def sum_odd(start, end):
    sum = 0
    for i in range(start, end+1):
        if is_odd(i):
            sum += i        
    return sum

print(sum_odd(1, 11))


vars()["hello"]="xxxxxxxxxxxxxxxxxxxx"

me = 23

print(me)
# print(vars()[2])
# print(vars())




import json



me = {
    '__name__': '__main__', 
    '__doc__': None, 
    '__package__': None, 
    '__loader__': '<_frozen_importlib_external.SourceFileLoader object at 0x000001A219E83E50>', 
    '__spec__': None, 
    '__annotations__': "{\}", 
    '__builtins__': "<module 'builtins' (built-in)>", 
    '__file__': 'd:\\Documents\\Python lessons\\Java Training\\Practice\\src\\pytoncompare.py', 
    '__cached__': None, 
    'time_string_duration': "<function time_string_duration at 0x000001A219FF8E00>", 
    'time_string_duration2': "<function time_string_duration2 at 0x000001A219FF8EA0>", 
    'time': [1000000000000000, 1000000000000, 1000000000, 1000000, 1000, 9223372036854775807], 
    't': 9223372036854775807, 
    'i': 39, 
    'count': 4, 
    'is_prime': "<function is_prime at 0x000001A21A0827A0>", 
    'j': 9, 
    'is_odd': "<function is_odd at 0x000001A21A082840>", 
    'sum_odd': "<function sum_odd at 0x000001A21A0828E0>", 
    "try": 'xxxxxxxxxxxxxxxxxxxx', 
    'me': "{...}", 
    'json': "<module 'json' from 'C:\\Users\\udeme\\AppData\\Local\\Programs\\Python\\Python311\\Lib\\json\\__init__.py'>", 
    'file': "<_io.TextIOWrapper name='records.json' mode='w' encoding='cp1252'>"
    }
with open(r'records.json', 'w') as file:
    # me = vars()
    # print(me)
    json.dump(me, file, indent=2)
    
    
    
    
    
number = 122544533254253452345567

# Format the number with thousand separators
formatted_number = "{:15,d}".format(number)#.replace(",", " ")

# Output the formatted number
print(formatted_number)  # prints "1,234,567.89"


print(hello)


nested_array = [['a', 'b'], ['c', 'd'], ['e', 'f']]
flat_list = [element for inner_list in nested_array for element in inner_list]
print(flat_list) # output: ['a', 'b', 'c', 'd', 'e', 'f']


nested_list = [[1, 2], [3, 4], [5, 6]]
squared_list = [[x**2 for x in inner_list] for inner_list in nested_list]
print(squared_list) # output: [[1, 4], [9, 16], [25, 36]]


class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        return [num for num in range (left,right + 1) if all(n !=0 and num%n == 0 for n in map(int,str(num)))]
    
    




nested_list = [[[[[1, [[[[2]]]]], [[[[3, [4, 5]]]]], 6, [[[7]]], [[[[4,5]]]],[[[[[[6]]]]]],[[[[[7,[[[8]]]]]]]]]]]]


# def check(item):    
#     return isinstance(item, list)
# import time

# while [*filter(check, nested_list)] != []:
#     flat_list = []
#     for item in nested_list:
#         if check(item):
#             flat_list.extend(item)
#         else:
#             flat_list.append(item)
#     nested_list = flat_list
#     print(flat_list, flush=True) # output: [1, 2, 3, 4, 5, 6, 7]
#     time.sleep(0.1)
    
    
    
    
def check2(x, y):
    return isinstance(x, y)


while [*filter(lambda x: check2(x, list), nested_list)] != []:
    flat_list = []
    for item in nested_list:
        if check2(item, list):
            flat_list.extend(item)
        else:
            flat_list.append(item)
    nested_list = flat_list
    print(flat_list, flush=True) # output: [1, 2, 3, 4, 5, 6, 7]
  
  
  
def get_largest_prime(num):
    if num <= 1:
        return -1
    
    for factor in range(2, num + 1):
        while num % factor == 0:
            num /= factor
            prime_factor = factor
        

    print(prime_factor)


get_largest_prime(7)
get_largest_prime(23)
get_largest_prime(21)
get_largest_prime(16)
get_largest_prime(33)
# get_largest_prime(2147483646)
# get_largest_prime(2147483647)
          
          

def star_square(num):
    if num < 5:
        print("invalid number")
    else:
        num1 = num + 1
        for row in range(1, num1):
            for col in range(1, num1):
                if row == 1 or col == 1 or row == num or col == num:
                    print("@", end="")
                elif row == col:
                    print("@", end="")
                elif row + col == num1:
                    print("@", end="")  
                else:
                    print(" ", end="")              
                if col == num:
                    print()
            
                


star_square(15)

