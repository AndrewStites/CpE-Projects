#lab3.s
#Andrew Stites


.intel_syntax noprefix
.data
Greeting:
    .ascii "Capsule Corp Bank!\n\0"

.text
.global _start

QuestionOne:
    .ascii "How many zenies do you earn a month from tournaments?\n\0"

.text
.global _start

QuestionTwo:
    .ascii "How much do you spend on training?\n\0"

.text
.global _start

QuestionThree:
    .ascii "How much do you spend on Hyperbolic Time Chamber visits?\n\0"

.text
.global _start

QuestionFour:
    .ascii "How much do you spend on food & sensu beans?\n\0"

.text
.global _start

Income:
    .ascii "Your net income: \0"

.text
.global _start

PosMoney:
    .ascii "\nHuzzah! More Zenies to Spend!\n\0"

.text
.global _start

NegMoney:
    .ascii "\nOops! You have nothing my dude! Train some more to win tournaments!\n\0"

.text
.global _start

_start:
    lea rbx, Greeting
    call PrintCString
    
    lea rbx, QuestionOne
    call PrintCString
    call ScanInt
    mov rax, rbx 
    
    lea rbx, QuestionTwo
    call PrintCString
    call ScanInt
    mov rcx, rbx
        
    sub rax, rcx
    mov rbx, rax

    lea rbx, QuestionThree
    call PrintCString
    call ScanInt
    mov rdx, rbx

    sub rax, rdx
    mov rbx, rax

    lea rbx, QuestionFour
    call PrintCString
    call ScanInt
    mov r8, rbx

    sub rax, r8
    mov rbx, rax

    lea rbx, Income
    call PrintCString
    mov rbx, rax
    call PrintInt

    cmp rbx, 0
    jge Then
    
    lea rbx, NegMoney
    call PrintCString
    jmp End

Then:
    lea rbx, PosMoney 
    call PrintCString

End:
    call EndProgram

