#lab5.s
#Andrew Stites

.intel_syntax noprefix
.data
Greeting:
    .ascii "Hello! I am your delicious Hogwarts Alphabet SOup!\nBefore you can eat me, you must guess my letter!\n\0"

TooLow:
    .ascii "Alas, you are too low.\n\0"

TooHigh:
    .ascii "Sorry, you are too high.\n\0"

Correct:
    .ascii "Congrats! you guessed it!\n\0"

UserGuess:
    .ascii "Guess: \0"


.text
.global _start

_start:
   lea rbx, Greeting
   call PrintCString

   mov rbx, 26
   call Random
   call PrintInt
   add rbx, 97
   call PrintInt

   mov rax, rbx
   jmp While
   
While:
   lea rbx, UserGuess
   call PrintCString
   call ScanChar          #bl = input
   
   cmp bl, al
   je Win
   
   jg High

   jl Low
   
High:
   lea rbx, TooHigh
   call PrintCString
   jmp While

Low:
   lea rbx, TooLow
   call PrintCString
   jmp While

Win:
   lea rbx, Correct
   call PrintCString
   jmp End

End:
    call EndProgram
