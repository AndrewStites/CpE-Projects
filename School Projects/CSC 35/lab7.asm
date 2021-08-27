#lab6.s
#Andrew Stites

.intel_syntax noprefix
.data
Greeting:
    .ascii "Welcome to The Three Broomsticks. Here is today's menu:\n\n1. Bertie Bott's Ecery Flavor Sliders (823 knuts)\n2. Mobius strip Pancakes (677 knuts)\n3. Cauldron Cakes (1937 knuts)\n4. Cornish Pasties (759 knuts)\n5. Pumpkin Pasties (1237 knuts)\n\0"

Sliders:
    .ascii "1. Bertie Bott's Ecery Flavor Sliders (823 knuts)\n\0"

Pancakes:
    .ascii "2. Mobius strip Pancakes (677 knuts)\n\0"

Cakes:
    .ascii "3. Cauldron Cakes (1937 knuts)\n\0"

Pasties:
    .ascii "4. Cornish Pasties (759 knuts)\n\0"

PastiesDos:
    .ascii "5. Pumpkin Pasties (1237 knuts)\n\0"

Question:
    .ascii "\nWhat is your order?\n\0"

Choice:
    .ascii "\nYour party enjoyed:\n\0"

People:
    .ascii "\nHow many people are splitting the bill?\n\0"

FinalStatement:
    .ascii "\nOkay, witches and wizards, give \0"
    
FinalStatementDos:
    .ascii " knuts each.\n\0"

Total:
.quad 0

Items:
.quad Sliders
.quad Pancakes
.quad Cakes
.quad Pasties
.quad PastiesDos

Cost: 
.quad 823
.quad 677
.quad 1937
.quad 759
.quad 1237

.text
.global _start

_start:
   lea rbx, Greeting
   call PrintCString

Do:
   lea rbx, Question
   call PrintCString
   call ScanInt        #rbx = input
   cmp rbx, 0
   jle Do
   
   cmp rbx, 6
   jge Do

   mov rsi, rbx
   sub rsi, 1
   mov rdi, rsi

   lea rbx, Choice
   call PrintCString

   mov rbx, [Items + rsi * 8]
   call PrintCString

NewDo:   
   lea rbx, People
   call PrintCString
   call ScanInt        #rbx = input 
   cmp rbx, 0
   jle NewDo

   mov rax, [Cost + rdi * 8]
   cqo
   idiv rbx
   mov rbx, rax
   mov Total, rbx
   
   lea rbx, FinalStatement
   call PrintCString

   mov rbx, Total
   call PrintInt

   lea rbx, FinalStatementDos
   call PrintCString 

   jmp End

End:
   call EndProgram
