;Program to perform Selection Sort:

.model small
.stack 100h
.data
array db '7','1','2','3','8','4','7','1','8','6'
var1 db ?                                          
var2 dw ?                                          
var3 db '---------"Selection Sort"--------$' 
var4 db 'Enter elements : $'   
var5 db '7123847186 $'                    
var6 db 'Elements after sorting are : $'  
var7 db '---------"Output"---------$'    
.code
main proc
mov ax,@data    ;to acess the data segment in code segment                                  
mov ds,ax
lea dx,var3     ;it will move offset address of var3 in dx
mov ah,9        ;it will print string that is declared in var3 variable
int 21h
Call ENTERKEY   ;for carriage return and newline
lea dx,var4     ;it will move offset address of var4 in dx   
mov ah,9        ;it will print string that is declared in var4 variable
int 21h
Call ENTERKEY   ;for carriage return and newline
lea dx,var5    ;it will move offset address of var5 in dx   
mov ah,9        ;it will print string that is declared in var5 variable
int 21h
lea si,array   ;it is used for storing offset adress of array
mov cx,10        ;counter register has 10 values 
;-------"slection sort"------
lea si,array       ;it is used for storing offset address of array
mov var2,10     
mov cx,10      ;control outerloop
;-------"outer loop"----------
l2:                                          ;
mov al,[si]     ;al contain  frst value of array
mov var1,al      ;variable 1 store value of source index register
mov bx,si
inc bx           ;increment the bx register for next index
mov ax,cx
mov cx,var2
;--------"innerloop"------------
l3:
mov dl,[bx]         
cmp var1,dl          ;compare for innerswapping
jg l4              ;if jump is greater move to inner swap 
l5:
inc bx
cmp cx,1            ;compare counter regster with 1
je swap            
loop l3
;--------"innerswap"------------             
l4:
mov var1,dl       ;store value of dl in var1
mov di,bx        ;store offset of bx in di
jmp l5              ;move again in innerloop after swap
;--------"swap"------------------
swap:                   ;for swap of small and largest
mov cl,[si]       ;move value of si at cl
mov [di],cl        ;move value of cl at di
mov cl,var1        ;move smallest value in a temporary register cl
mov [si],cl        ;move smallest value at si address
inc si             ;increment the next index for outerloop
mov cx,ax         
cmp cx,1                 
je print
dec var2          ;decrease cx of innerloop
loop l2          
;----------"print"-------
print:
Call ENTERKEY    ;for carriage return and new line
lea dx,var6       ;it will move offset address of var6 in dx
mov ah,9     ;it will print the string that is declared in var6
int 21h
Call ENTERKEY
lea dx,var7    ;it will move offset address of var7 in dx
mov ah,9      ;it will print the string that is declared in var7
int 21h
Call ENTERKEY
lea si,array
mov cx,10
;-------"print after selection sorting"---------
printloop:       ;for print the arary after sorting
mov dx,[si]
mov ah,2
int 21h
inc si
loop printloop
mov ah,4ch                    
int 21h
main endp
;PROCEDURE FOR NEWLINE AND CARRIAGE RETURN
ENTERKEY PROC                 
mov dx,10
mov ah,2
int 21h
mov dx,13
mov ah,2
int 21h
RET
ENTERKEY ENDP
end main