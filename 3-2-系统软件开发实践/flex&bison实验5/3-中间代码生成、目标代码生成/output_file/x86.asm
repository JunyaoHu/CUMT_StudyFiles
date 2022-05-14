.MODEL SMALL
.STACK 100H
.DATA
.CODE
start:mov ax,@data
mov ds,ax
push bp
mov bp,sp
jmp alloc
main:
MOV AX,12
MOV [BP+2],AX
MOV AX,13
MOV [BP+4],AX
MOV AX,[BP+2]
MOV BX,[BP+4]
ADD AX,BX
MOV BX,2
MUL BX
MOV BX,3
DIV BX
MOV [BP+6],AX
jmp over
alloc:
MOV AX,0
PUSH AX
MOV AX,13
PUSH AX
MOV AX,12
PUSH AX
jmp main
over:
mov ah,4ch
int 21h
end start
