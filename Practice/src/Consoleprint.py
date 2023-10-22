import ConsolePrint.animate as prt       
import ConsolePrint.console2file as file  
import ConsolePrint.loading as load        

# Test Cases

file.startConsoleSave()
'Saves all output between the start and end functions to file.'
from calendar import calendar
print(calendar(2023))
file.endConsoleSave()


prt.printing("hello this should print letter by letter", delay=0.05, style="letter", stay=True, rev=False)
prt.printing("hello this should print word by word but in reverse", delay=0.05, style="word", stay=True, rev=True)
prt.flashprint("The entire text should flash", blinks=5, delay=0.2, stay=True)
prt.flashtext("The text in  will flash", "UPPER CASE", blinks=5, index=12, delay=0.2)
prt.animate1("This text is animated with #", symbol="#")
prt.animate2("Prints letter by letter but masked with # first", symbol="#", delay=0.05)
prt.text_box("M O N E Y  M A K E R", symbol="$", padding=True, wall=True, align="right")
load.countdown(5)
load.loading1(10)
print()
load.loading2(5)
print()
load.loading3(5)
prt.star_square(12, "%")



# animate.py
import ConsolePrint.animate as prt

prt.printing("hello this should print letter by letter", delay=0.05, style="letter", stay=True, rev=False, format='strike')
prt.printing("hello this should print word by word but in reverse", delay=0.3, style="word", stay=True, rev=True, format='red_bg')
prt.flashprint("The entire text should flash", blinks=5, delay=0.2, stay=True, format='green')
prt.flashtext("The text in  will flash", "UPPER CASE", blinks=5, index=12, delay=0.2, format='yellow')
prt.animate1("This text is animated with #", symbol="#", format='white')
prt.animate2("Prints letter by letter but masked with # first  ", symbol="#", delay=0.05, format="\033[48;5;150m")
prt.text_box("B O X E D  I N", symbol="#", padding=True, wall=True, align='right', format='\033[48;5;4m')
prt.star_square(10, symbol="@", align=15, flush="True", format="\033[104m")
prt.asteriskify('This has been asteriskified', align='center', underscore=True, format='cyan')

# console2file.pt
import ConsolePrint.console2file as file
import calendar

file.startConsoleSave()

print("Printing Calendar")
print(calendar.calendar(2023))

file.endConsoleSave()  

# loading.py
import ConsolePrint.loading as load

load.countdown(5)
print()
load.loading1(20)  
print()
load.loading2(5, 'thinking...')
print()
load.loading3(5)