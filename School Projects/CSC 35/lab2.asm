# lab2.s
# Andrew Stites
# 
# 1. Assemble : as -o lab2.o lab2.asm
# 2. Link     : ld -o a.out lab2.o csc35.o
# 3. Execute  : a.out

.intel_syntax noprefix             #Use Intel formatting
.data                              #Start the data section
Greeting:                          #Message is an address
    .ascii "Hello, world!\n\0"     #Create a buffer of ASCII

.text                              #Start the text section
.global _start                     #Make the _start label public

Name:
    .ascii "My name is Andrew Stites!\n\0" #Message of name

.text
.global _start

Quote:
    .ascii "Do your best and forget the rest! - Tony Horton\n\0"

.text
.global _start

Year:
    .ascii "In the year \0 "

.text
.global _start

YearDos:
    .ascii ", the Federal Reserve was created and the U.S. dollar has become more fiat since its inception\0"

.text
.global _start

_start:                            #UNIX starts here
    lea  rbx, Greeting             #Put address into rdx
    call PrintCString
    lea  rbx, Name
    call PrintCString              #Execute the csc35.o subroutine
    lea  rbx, Quote
    call PrintCString

    lea rbx, Year
    call PrintCString
    mov rbx, 1913
    call PrintInt
    lea rbx, YearDos
    call PrintCString

    call EndProgram                #Execute the csc35.o subroutine


