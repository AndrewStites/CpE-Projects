#project.s
#Andrew Stites

.intel_syntax noprefix
.data

Funds:
.quad 100

Sluice:
.quad 100

Endurance:
.quad 100

WeekNum:
.quad 0

SluiceReturn:
.quad 0

Choice:
.byte 0

Cost:
.quad 0

Gain:
.quad 0

Loss:
.quad 0

Greeting:
    .ascii "======================\n CALIFORNIA GOLD RUSH\n======================\n\nRules:\n1. 20 weeks (5 months)\n2. Your endurance drops 10-25% each week. If it reaches 0%, the game ends\n3. Panning for gold yields 0-100 dollars\n4. A sluice yields 0-1000 dollars (durability drops 20-50% each week)\n5. Food costs 30-50 dollars\n\0"

Week:
    .ascii "\nWEEK \0"

WeekUpdateUno:
    .ascii "\nPanning for gold yielded $\0"

WeekUpdateDos:
    .ascii "\nThe sluice yielded $\0"

WeekUpdateTres:
    .ascii "\nYou ate $\0"

WeekUpdateQuatro:
    .ascii " in food\n\0"

PercentSymbol:
    .ascii "%\0"

FundsStatement:
    .ascii "\nYou have $\0"

EnduranceStatement:
    .ascii "\nYour endurance is at \0"

SluiceStatement:
    .ascii "\nSluice is at \0"

SluiceMachineBrokenMessage:
    .ascii "\nSluice is broken!!! Fix it t' git gold!!!\n\0"

Question:
    .ascii "\nIt' Sunday! Do you want to:\n1. Do nothing\n2. Repair sluice\n3. Go to town\n\0"

SundayMessageTwo:
    .ascii "\nYou repaired the sluice to 100%\n\0"

SundayMessageThree:
    .ascii "\nGoing to town cost you $\0"

SundayMessageThreeDos:
    .ascii "\nYou regained \0"

SundayMessageThreeTres:
    .ascii "% endurance\n\0"

Dead:
    .ascii "Sorry, you died!\n               ...\n             ;::::;\n           ;::::; :;\n         ;:::::'   :;\n        ;:::::;     ;.\n       ,:::::'       ;           OOO\n       ::::::;       ;          OOOOO\n       ;:::::;       ;         OOOOOOOO\n      ,;::::::;     ;'         / OOOOOOO\n    ;:::::::::`. ,,,;.        /  / DOOOOOO\n  .';:::::::::::::::::;,     /  /     DOOOO\n ,::::::;::::::;;;;::::;,   /  /        DOOO\n;`::::::`'::::::;;;::::: ,#/  /          DOOO\n:`:::::::`;::::::;;::: ;::#  /            DOOO\n::`:::::::`;:::::::: ;::::# /              DOO\n`:`:::::::`;:::::: ;::::::#/               DOO\n :::`:::::::`;; ;:::::::::##                OO\n ::::`:::::::`;::::::::;:::#                OO\n `:::::`::::::::::::;'`:;::#                O\n  `:::::`::::::::;' /  / `:#\n   ::::::`:::::;'  /  /   `#\0"

GameOverMessage:
    .ascii "===== GAME OVER =====\n\0"

Steal:
    .ascii "\nDo you want to steal some gold?\nIf you get caught, you will be hanged.\nThough, you can make an extra $1000 dollars. (y/n)\n\0"

HangedMessage:
    .ascii "You got caught red handed!!! You were hanged!!!\n         |\n     　　|\n   　　　|\n   　　　|\n 　　　　|\n　／￣￣\\|\n＜ ´ ･   |\\\n　|　３  | \\\n＜ 、･   |  \\\n　＼＿＿／∪_∪)\n         Ｕ Ｕ\n\0"

.text
.global _start

_start:   
    mov rbx, 7
    call SetForeColor
    mov rbx, 3             #Changes the color to yellow
    call SetForeColor
    lea rbx, Greeting
    call PrintCString
    mov rbx, 7
    call SetForeColor

    jmp While

While:                    #Main Game loop
    cmpq WeekNum, 20
    je GameOver

    cmpq Endurance, 0
    jle Death
    
    mov rbx, 10           #This a random question at a 10% chance
    call Random
    cmp rbx, 5
    je GoldSteal
    
    lea rbx, Week
    call PrintCString
   
    addq WeekNum, 1
    mov rbx, WeekNum
    call PrintInt
    
    lea rbx, FundsStatement
    call PrintCString

    mov rbx, 2               #changes the color to green
    call SetForeColor
    mov rbx, Funds
    call PrintInt
    mov rbx, 7
    call SetForeColor

    lea rbx, EnduranceStatement
    call PrintCString
    
    mov rbx, 2
    call SetForeColor
    mov rbx, Endurance
    call PrintInt
    mov rbx, 7
    call SetForeColor

    lea rbx, PercentSymbol   #adds a percent after the int printed
    call PrintCString

    lea rbx, SluiceStatement
    call PrintCString
    
    mov rbx, 2
    call SetForeColor
    mov rbx, Sluice
    call PrintInt
    mov rbx, 7
    call SetForeColor
    
    lea rbx, PercentSymbol
    call PrintCString

    mov rbx, 15             #produces a number 10-25
    call Random
    add rbx, 10
    movq Loss, 0
    mov Loss, rbx
    mov rax, 0
    add rax, Loss
    sub Endurance, rax   
 
    mov rbx, 30             #produces a number 20-50
    call Random
    add rbx, 20
    movq Loss, 0
    mov Loss, rbx
    mov rax, 0
    add rax, Loss
    sub Sluice, rax

    jmp Sunday

GoldSteal:                 #for the random question
    lea rbx, Steal
    call PrintCString
    call ScanChar                       #bl = input;

    cmp bl, 121
    je GoldAddGamble
    jne While

GoldAddGamble:             #if yes is chosen for random question
    mov rbx, 2
    call Random
    cmp rbx, 1
    je Hanged
    addq Funds, 1000       #adds 1000 to funds if random is not 1
    jmp While
    
Hanged:                    #if you die by stealing
    mov rbx, 1
    call SetForeColor
    lea rbx, HangedMessage
    call PrintCString
    mov rbx, 7
    call SetForeColor

    jmp End

SluiceMachineBroke:       #sluice breaks
    mov rbx, 1
    call SetForeColor
    lea rbx, SluiceMachineBrokenMessage
    call PrintCString
    mov rbx, 7
    call SetForeColor

    mov rbx, 100           
    call Random
    movq Gain, 0
    mov Gain, rbx
    mov rax, 0
    add rax, Gain
    add Funds, rax
  
    lea rbx, WeekUpdateUno
    call PrintCString

    mov rbx, Gain
    call PrintInt

    movq SluiceReturn, 0   #adds $0 when sluice broken
    mov rax, 0
    add rax, SluiceReturn
    add Funds, rax

    lea rbx, WeekUpdateDos
    call PrintCString

    mov rbx, SluiceReturn
    call PrintInt

    mov rbx, 20            
    call Random
    add rbx, 30
    movq Cost, 0
    mov Cost, rbx
    mov rax, 0
    add rax, Cost
    sub Funds, rax

    lea rbx, WeekUpdateTres
    call PrintCString

    mov rbx, Cost
    call PrintInt

    lea rbx, WeekUpdateQuatro
    call PrintCString
    
    jmp While

Sunday:                    #prints the sunday statement
    lea rbx, Question
    call PrintCString    
    mov rbx, 5
    call SetForeColor
    call ScanInt           #rbx = input

    mov Choice, rbx
    mov rbx, 7
    call SetForeColor
       
    cmpb Choice, 1
    jl Sunday
    je WeekUpdate

    cmpb Choice, 2
    je SundayChoiceTwo
    
    cmpb Choice, 3
    je SundayChoiceThree
    
    cmpb Choice, 4
    jge Sunday    

SundayChoiceTwo:              #if choice 2 is picked
    lea rbx, SundayMessageTwo
    call PrintCString

    subq Funds, 100
    movq Sluice, 100
    
    jmp WeekUpdate

SundayChoiceThree:              #if choice 3 is picked
    lea rbx, SundayMessageThree
    call PrintCString
    
    mov rbx, Sluice
    call PrintInt
    
    lea rbx, SundayMessageThreeDos
    call PrintCString

    mov rbx, Endurance
    call PrintInt

    lea rbx, SundayMessageThreeTres
    call PrintCString

    mov rbx, 45
    call Random
    add rbx, 5
    movq Gain, 0
    mov Gain, rbx          #Changed here
    mov rax, 0
    add rax, Gain
    add Endurance, rax

    jmp WeekUpdate

WeekUpdate:              #gives the week update
    cmpq Sluice, 0
    jle SluiceMachineBroke
 
    mov rbx, 100
    call Random
    movq Gain, 0
    mov Gain, rbx
    mov rax, 0
    add rax, Gain
    add Funds, rax
  
    lea rbx, WeekUpdateUno
    call PrintCString
    
    mov rbx, 2
    call SetForeColor
    mov rbx, Gain
    call PrintInt
    mov rbx, 7
    call SetForeColor

    mov rbx, 1000
    call Random
    movq SluiceReturn, 0
    mov SluiceReturn, rbx
    mov rax, 0
    add rax, SluiceReturn
    add Funds, rax
 
    lea rbx, WeekUpdateDos
    call PrintCString

    mov rbx, 2
    call SetForeColor
    mov rbx, SluiceReturn
    call PrintInt
    mov rbx, 7
    call SetForeColor
 
    mov rbx, 20
    call Random
    add rbx, 30
    movq Cost, 0
    mov Cost, rbx
    mov rax, 0
    add rax, Cost
    sub Funds, rax

    lea rbx, WeekUpdateTres
    call PrintCString
    
    mov rbx, 2
    call SetForeColor
    mov rbx, Cost
    call PrintInt
    mov rbx, 7
    call SetForeColor
   

    lea rbx, WeekUpdateQuatro
    call PrintCString

    jmp While

Death:                   #if enduracne goes to 0%
    mov rbx, 1
    call SetForeColor
    lea rbx, Dead
    call PrintCString
    jmp End

GameOver:                    #prints gameover screen
    lea rbx, GameOverMessage
    call PrintCString

    lea rbx, FundsStatement
    call PrintCString

    mov rbx, Funds
    call PrintInt

    lea rbx, EnduranceStatement
    call PrintCString
 
    mov rbx, Endurance
    call PrintInt

    lea rbx, PercentSymbol
    call PrintCString

    lea rbx, SluiceStatement
    call PrintCString

    mov rbx, Sluice
    call PrintInt

    lea rbx, PercentSymbol
    call PrintCString

    jmp End

End:
    call EndProgram


