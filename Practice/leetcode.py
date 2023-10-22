class Solution:
    def calculate(self, s: str) -> int:
        s = s.replace(" ", "")

        stack = []
        current_number = 0
        sign = 1
        result = 0

        for char in s:
            if char.isdigit():
                current_number = (current_number * 10) + int(char)
            elif char == "+":
                result += sign * current_number
                current_number = 0
                sign = 1
            elif char == "-":
                result += sign * current_number
                current_number = 0
                sign = -1
            elif char == "(":
                stack.append(result)
                stack.append(sign)
                result = 0
                sign = 1
            elif char == ")":
                result += sign * current_number
                current_number = 0
                result *= stack.pop()  # pop the sign
                result += stack.pop()  # pop the previous result

        result += sign * current_number
        return result

leet = Solution()

print(leet.calculate("-(26+9)-1-(3-  9)+7"))



# Defining a positive infinite integer
positive_infinity = float('inf')
print('Positive Infinity: ', positive_infinity)
 
# Defining a negative infinite integer
negative_infinity = float('-inf')
print('Negative Infinity: ', negative_infinity)

print((-1)**(1/2))


for text in range(15):
    # text = 'hello', 4
    # print(type(text))
    match text:
        case 1 | 9 | 14: print(text, 11111111)
        case 2 | 6: print(text, 22222222222222)
        case 3 | 7: print(text, 3333333333)
        case 5: print(text, 4444444444)
        case other: print(text, "the rest")
        
        
        
def test():
    return 5, 6


print(type(test()))


def provideAccess(user):
    return {
        "username": user,
        "password": "admin"
    }
 
 
def runMatch():
    # user = str(input("Write your username -: "))
    user = "Rishabh"
    # match statement starts here .
    match user:
        case "Om":
            print("Om do not have access  to the database \
            only for the api code.")
        case "Vishal":
            print(
                "Vishal do not have access to the database ,\
only for the frontend code.")
 
        case "Rishabh":
            print("Rishabh have the access to the database")
            print(provideAccess("Rishabh"))
 
        case _:
            print("You do not have any access to the code")
 
 
if __name__ == "__main__":
    for _ in range(3):
        runMatch()
        
        
print("Om do not have access to the database \
only for the api code.")

print("Vishal do not have access to the database ,\
only for the frontend code.")


print("Rishabh have the access to the database")