# lab5.s
# Andrew Stites


.intel_syntax noprefix             #Use Intel formatting
.data                              #Start the data section
Greeting:                          #Message is an address
    .ascii "Getting an A         : 27 points\nCleaning your robes  : 5 points\nBeing late to class  : -11 points\nSaying the V-word    : -34 points\n\0"

QuestionOne:
    .ascii "How many students got A's?\n\0"

QuestionTwo:
    .ascii "How many students cleaned their robes?\n\0"

QuestionThree:
    .ascii "How many students were late to class?\n\0"

QuestionFour:
    .ascii "How many students said the V-Word?\n\0"

Output:
    .ascii "RavenClaw gained \0" 

OutputDos:
    .ascii " points!\n\0"

.text                              #Start the text section
.global _start                 

_start:                            #UNIX starts here
    lea  rbx, Greeting             #Put address into rdx
    call PrintCString

    lea  rbx, QuestionOne
    call PrintCString
    call ScanInt		   #rbx  = input;
    
    mov  rax, 27
    imul rbx

    mov  rbx, rax
    mov  rcx, rbx    
   
    lea rbx, QuestionTwo
    call PrintCString
    call ScanInt                   #rbx  = input;

    mov  rax, 5
    imul rbx

    mov  rbx, rax
    add  rbx, rcx

    mov  r8, rbx

    lea rbx, QuestionThree
    call PrintCString
    call ScanInt                   #rbx  = input;

    mov  rax, -11 
    imul rbx

    mov  rbx, rax
    add  rbx, r8

    mov  r10, rbx

    lea rbx, QuestionFour
    call PrintCString
    call ScanInt                   #rbx  = input;

    mov  rax, -34
    imul rbx
    
    mov  rbx, rax
    add  rbx, r10
    
    mov r12, rbx
        
    lea rbx, Output
    call PrintCString
 
    mov rbx, r12
    call PrintInt    

    lea rbx, OutputDos
    call PrintCString

    call EndProgram                #Execute the csc35.o subroutine



