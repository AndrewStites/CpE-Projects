#lab4.s
#Andrew Stites


.intel_syntax noprefix
.data
Greeting:
    .ascii "Welcome to Hogwars!\n\0"

GreetingDos:
    .ascii "The Sorting Hat is being placed upon your head.\n\0"

QuestionOne:
    .ascii "Do you wish to command/control others?(y/n)\n\0"

QuestionTwo:
    .ascii "Do you find contentment in reading?(y/n)\n\0"

QuestionThree:
    .ascii "Is it better to help yourself more than others?(y/n)\n\0"

Gryffindor:
    .ascii "Gryffindor!\n\0"

Slytherin:
    .ascii "Slytherin!\n\0"

RavenClaw:
    .ascii "Ravenclaw!\n\0"

HufflePuff:
    .ascii "Hufflepuff!\n\0"

.text
.global _start

_start:
    lea rbx, Greeting
    call PrintCString

    lea rbx, GreetingDos
    call PrintCString
    
    lea rbx, QuestionOne
    call PrintCString
    call ScanChar			#bl = input;
    
    cmp bl, 121
    je Then

    jne ThenDos

Then:
   lea rbx, QuestionThree 
   call PrintCString
   call ScanChar

   cmp bl, 121
   je SlytherinPos

   jne GryffindorPos
   
   
GryffindorPos:
  lea rbx, Gryffindor
  call PrintCString
  jmp End

SlytherinPos:
  lea rbx, Slytherin
  call PrintCString
  jmp End

ThenDos:
  lea rbx, QuestionTwo
  call PrintCString
  call ScanChar
 
  cmp bl, 121
  je RavenClawPos
  
  jne HufflePuffPos

RavenClawPos:
  lea rbx, RavenClaw
  call PrintCString
  jmp End

HufflePuffPos:
  lea rbx, HufflePuff
  call PrintCString
  jmp End

End:
    call EndProgram


