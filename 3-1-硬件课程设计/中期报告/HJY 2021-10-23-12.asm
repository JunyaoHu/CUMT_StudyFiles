 ;-------------------Ӳ��ͨ������OK--------------------------
PORT_A   EQU 280H      ; 8255ͨ��A���������LCD����д�룩
PORT_B   EQU 281H      ; 8255ͨ��B��������̶�ȡ��
PORT_C   EQU 282H      ; 8255ͨ��C���������д�룩
PORT_CTL EQU 283H      ; 8255����
CLK_1    EQU 289H      ; 8254������1ͨ��������ֱ�����ת��������
CLK_CTL  EQU 28BH      ; 8254����������
LS273    EQU 290H      ; 74LS273������ӿ������ַ������LCD�����źſ��ƣ�
PORT_0832 EQU 298H     ; DAC0832��ģת�����˿ڵ�ַ��������Ƶ��ת����

;-------------------LCD12864���������OK-----------------------
LCD_CMD_SET MACRO      ; LCD��������
    MOV DX,LS273     ; ָ��273���ƶ˿�
    NOP
    MOV AL,00000000B ; out2��0,out0��0 ��LCD W��=0��I��=0��
    OUT DX, AL
    NOP
    MOV AL,00000100B ; out2��1 ��LCD E��=1��
    OUT DX, AL
    NOP
    MOV AL,00000000B ; out2��0,��LCD E��=0��
    OUT DX, AL
    NOP
ENDM

;-------------------LCD12864д���ݺ�OK------------------------
LCD_DATA_SET MACRO     ; LCDд����
    MOV DX,LS273     ; ָ��273���ƶ˿�
    MOV AL,00000001B ; out2��0��out0=1 ��LCD I��=1��
    OUT DX,AL
    NOP
    MOV AL,00000101B ; out2��1 ��LCD E�ˣ�1��
    OUT DX,AL
    NOP
    MOV AL,00000001B ; out2��0,��LCD E�ˣ�0��
    OUT DX,AL
    NOP
ENDM

;----------------------LCD12864��ʾ�ַ�OK---------------------
;------------һ����ʾINT_N�����֣�INT_NΪ����------------------
STRING_SHOW MACRO INT_N
    LOCAL NEXT_WORD
    MOV CL,INT_N
NEXT_WORD:    
    PUSH CX
    MOV AL,WORD_ADDRESS
    MOV DX,PORT_A ;��һ�Σ�pa0=0
    OUT DX,AL
    LCD_CMD_SET ; �趨DDRAM��ַ����
    MOV AX,[BX]
    PUSH AX
    MOV AL,AH ; ���ͺ��ֱ����λ
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET ; ������ֱ�����ֽ�
    POP AX
    MOV DX,PORT_A
    OUT DX, AL
    LCD_DATA_SET ; ������ֱ�����ֽ�
    INC BX
    INC BX ; �޸���ʾ���뻺����ָ��
    INC BYTE PTR WORD_ADDRESS ; �޸�LCD��ʾ�˿ڵ�ַ WORD_ADDRESS���ֽڵ�Ԫ
    POP CX
    DEC CL
    JNZ NEXT_WORD
ENDM

; ------------------------����ʱ��OK-----------------------
DELAY_MACRO MACRO
    LOCAL FOR1
    LOCAL FOR2
    PUSH BX
    PUSH CX
    MOV BX,400H
FOR1: MOV CX,0FFFFH
FOR2: LOOP FOR2
    DEC BX
    JNZ FOR1
    POP CX
    POP BX
ENDM

;-------------------------���������ݶ�----------------------------
DATA SEGMENT
;---------------������---------------------------
SunFee         DB  10H    ; �����𲽼ۣ�10Ԫ��
NightFee       DB  12H    ; ҹ���𲽼ۣ�12Ԫ��
FeeRate        DB  02H    ; һ����۸�2Ԫ��
FeeTime        DB  01H    ; �ȴ�һ���Ӽ۸�1Ԫ��
INT16          DB  16     ; ����16
INT3           DB  3      ; ����3

;---------------�������ڲ��洢����ʾ��---------------------------
WORD_ADDRESS   DB  00H    ; �����ʾ����ʼ�˿ڵ�ַ
SunOrNIght     DB  00H    ; ���죨0��ҹ�䣨1��״̬

Speed          DB  0A0H   ; �ٶȣ�A0ֹͣ��
Kilometer      DB  00H    ; ����̣�BCD�룩      eg �洢18 => 1.8 km
Price          DB  00H    ; �ܷ��ã�BCD�룩      eg �洢24 => 24 rmb
WaitingTimeSec DB  00H    ; �ȴ�ʱ�䣨�룬BCD�룩 eg �洢36 => 36 sec
WaitingTimeMin DB  02H    ; �ȴ�ʱ�䣨�룬BCD�룩 eg �洢36 => 02 min
Count          DW  0000H  ; �����ϴμ��� IF LESS +10000
CountNow       DW  0000H  ; ������μ���

;---------------�������ⲿ��Ҫ��ʾ��---------------------------
KilometerLCD      DW    2030H,2E30H  ; eg *0.0
SpeedLCD          DW    3030H        ; eg 00
WaitingTimeMinLCD DW    2030H        ; eg *0
WaitingTimeSecLCD DW    3030H        ; eg 00
PriceLCD          DW    3030H        ; eg 00
InitPriceLCD      DW    3030H        ; eg 00

;-------------------LCD12864��ӭ��������ok------------------------
INIT_WELCOME DW 0BBB6H,0D3ADH,0B3CBH,0D7F8H,0B1BEH,0CBBEH,0B3F6H,0D7E2H
    DW 0CBBEH,0BBFAH,0A1A0H,0BAFAH,0BEFBH,0D2ABH,0A1A0H,0A1A0H
    DW 0B1E0H,0BAC5H,2030H,3631H,3932H,3038H,3120H,0A1A0H
    DW 0BCE0H,0B6BDH,2031H,3839H,3030H,3030H,3030H,3030H
   ;��ӭ������˾����
   ;˾��  ����ҫ
   ;��� 06192081
   ;�ල 18900000000

;-------------------�ػ���������ok------------------------
STATE_OFF DW 0A1A0H,0A1A0H,0D2D1H,0B9D8H,0BBFAH,0A1A0H,0A1A0H,0A1A0H
;�ѹػ�

;-------------------�������ý�������ok------------------------
STATE_SUN DW 0B0D7H,0CCECH
;����

;-------------------ҹ�����ý�������ok------------------------
STATE_NIGHT DW 0D2B9H,0BCE4H
;ҹ��         

; ----------------------------�հ���ok--------------------------------
BLANK_LINE DW 0A1A0H,0A1A0H,0A1A0H,0A1A0H,0A1A0H,0A1A0H,0A1A0H,0A1A0H 

; ------------------------����ɨ����ok-----------------------------
KEYBOARD_DATA DB 77H,7BH,7DH,7EH,0B7H,0BBH,0BDH,0BEH,0D7H,0DBH,0DDH,0DEH,0E7H,0EBH,0EDH,0EEH
;----����ɨ�����--0---1---2---3---4----5----6----7----8----9----a----b----c----d----e----f    


;----------------֧�����棨�˿��³�����ʾ��---------------------
STRING_PAY DW 0D6A7H,0B8B6H
;֧��
STRING_YUAN DW 0D4AAH
;Ԫ

;----------------���мƼ۽��棨�˿ͳ˳�ʱ��ʾ��---------------------
STRING_RUN DW 0C6F0H,0B2BDH,3130H,0D4AAH,0B5A5H,0BCDBH,02032H,0D4AAH
    DW 0C0EFH,0B3CCH,0A1A0H,0A1A0H,0B9ABH,0C0EFH,0A1A0H,0A1A0H
    DW 0CAB1H,0CBD9H,0A1A0H,0A1A0H,6B6DH,2F68H,0A1A0H,0A1A0H
    DW 0B5C8H,0B4FDH,0A1A0H,0B7D6H,0A1A0H,0C3EBH,0A1A0H,0A1A0H
;��10Ԫ���� 2Ԫ
;��� 2.3����
;ʱ��  30km/h
;�ȴ� 3��21��

;----------------ɨ��֧��������΢��֧����ά�룩ok---------------------
QR_CODE DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,07H,0F3H,38H,0CBH,0DFH,0C0H,00H,00H,04H,16H,0B6H,4AH,10H,40H,00H
DB 00H,05H,0D0H,2EH,61H,97H,40H,00H,00H,05H,0D3H,0A4H,0D3H,97H,40H,00H
DB 00H,05H,0D2H,9DH,0D6H,0D7H,40H,00H,00H,04H,15H,57H,66H,90H,40H,00H
DB 00H,07H,0F5H,55H,55H,5FH,0C0H,00H,00H,00H,04H,0BCH,96H,40H,00H,00H
DB 00H,00H,79H,6AH,8BH,18H,80H,00H,00H,07H,0A5H,66H,43H,8EH,80H,00H
DB 00H,05H,0F0H,0CFH,0CBH,0DH,40H,00H,00H,06H,6DH,0D6H,80H,91H,00H,00H
DB 00H,04H,0BDH,2CH,30H,19H,0C0H,00H,00H,07H,0E0H,0D0H,0FH,98H,40H,00H
DB 00H,01H,15H,27H,05H,02H,80H,00H,00H,01H,4FH,0A4H,0AH,2AH,40H,00H
DB 00H,04H,0D9H,0C7H,0EH,0DH,40H,00H,00H,03H,67H,0A1H,0C2H,26H,40H,00H
DB 00H,00H,0D8H,01H,0FH,0BH,00H,00H,00H,02H,0EBH,81H,0E4H,0A8H,0C0H,00H
DB 00H,00H,0FCH,40H,22H,5EH,00H,00H,00H,04H,84H,0A1H,0E7H,0CAH,40H,00H
DB 00H,02H,51H,80H,03H,4EH,0C0H,00H,00H,00H,0AAH,0D9H,04H,7AH,40H,00H
DB 00H,06H,55H,0C2H,0BFH,31H,0C0H,00H,00H,07H,65H,5EH,16H,0BAH,0C0H,00H
DB 00H,01H,0BAH,41H,5AH,25H,00H,00H,00H,01H,2EH,35H,69H,18H,0C0H,00H
DB 00H,07H,75H,2BH,0A1H,7FH,0C0H,00H,00H,00H,06H,54H,0BH,46H,00H,00H
DB 00H,07H,0F4H,73H,69H,54H,00H,00H,00H,04H,14H,0DFH,0FCH,45H,0C0H,00H
DB 00H,05H,0D5H,16H,51H,7FH,0C0H,00H,00H,05H,0D3H,19H,4FH,46H,0C0H,00H
DB 00H,05H,0D1H,0AFH,0D2H,7AH,80H,00H,00H,04H,12H,0D0H,0FDH,41H,40H,00H
DB 00H,07H,0F0H,03H,0D0H,0B7H,0C0H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DB 00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H,00H
DATA      ENDS

;-----------------------�ݴ�ջok---------------------
STACKS    SEGMENT
          DB 2560 DUP(?)
STACKS    ENDS

;---------------------------������-------------------------
CODE SEGMENT
    ASSUME CS:CODE,DS:DATA,SS:STACKS,ES:DATA

START:
;========================�������㣬��ʼ��======================

    MOV WORD_ADDRESS,00H
    MOV SunOrNIght,00H
    MOV HaveOrNot,00H
    MOV WaitOrNOt,00H
    MOV Speed,0A0H
    MOV Kilometer,00H
    MOV Price,00H
    MOV WaitingTimeMin,00H
    MOV WaitingTimeSec,00H
    MOV Count,0000H
    MOV CountNow,0000H

    MOV AX, DATA
    MOV DS, AX
    MOV DX, PORT_CTL
    MOV AL, 10000010B    ; 8255��ʼ����A�������B�����룬C�����
    OUT DX, AL
    CALL CLEAR
    CALL LCD_DISP_INIT   ; LCD��������ʾ��ӭ����                                                                                                                                        
    
DO_MAIN:
    CALL KEYBROAD
; ===============�������������뿪�ػ����ؿ͡�����================
    CMP BX,0000H ; ����0�����ػ�
    JZ ON_OFF
    CMP BX,0001H ; ����1���ؿ�
    JZ ON_PERSON
    CMP BX,0003H ; ����3������
    JZ SETTING
    JMP DO_MAIN  ; ������������Ч���ط�DO_MAIN������ȡ����

ON_OFF:
    CALL LCD_DISP_OFF
    JMP START
    
ON_PERSON:
    CALL LCD_DISP_ON_PERSON
    JMP START

SETTING:
    CALL LCD_DISP_SETTING
    JMP START
    
; =======================����MAIN===================
KEYBROAD PROC
    MOV DX,PORT_C
    MOV AL,00H
    OUT DX,AL
    MOV DX,PORT_B
    IN AL,DX         ; �ٲ��У��������Ƿ��Ա�ѹ��
    AND AL,0FH
    CMP AL,0FH
WAIT_OPEN:           ; �鿴���м��Ƿ��ɿ�
    IN AL,DX
    AND AL,0FH
    CMP AL,0FH
    JNE WAIT_OPEN    ; �������ɿ��������Ƿ���0
WAIT_PRES:
    IN AL,DX
    AND AL,0FH       ; ֻ�����λ
    CMP AL,0FH
    JE WAIT_PRES     ; ��ʱ20ms��������
    MOV CX,16EAH
DELAY1:LOOP DELAY1   ; CXΪ0������ѭ��
    IN AL,DX         ; �ٲ��У��������Ƿ��Ա�ѹ��
    AND AL,0FH
    CMP AL,0FH
    JE WAIT_PRES     ; ���Ա����£�ȷ����һ����������
    MOV AL,0FEH
    MOV CL,AL
NEXT_ROW:
    MOV DX,PORT_C
    OUT DX,AL        ; ��һ������͵�ƽ
    MOV DX,PORT_B
    IN AL,DX         ; ����B��״̬
    AND AL,0FH       ; ֻ������λ������ֵ
    CMP AL,0FH       ; �Ƿ��Ϊ1�����ǣ�������ް�������
    JNE ENCODE       ; �񣬴����а������£�תȥ����
    ROL CL,1         ; ��Ϊ1��תȥ����
    MOV AL,CL
    JMP NEXT_ROW     ; �鿴��һ��
ENCODE:
    MOV BX,000FH
    IN AL,DX
NEXT_TRY:
    CMP AL,KEYBOARD_DATA[BX] ; ���������ֵ�Ƿ�����е�ֵ���
    JE FINISH_MAIN_KEYBROAD
    DEC BX
    JNS NEXT_TRY ; �Ǹ����������
FINISH_MAIN_KEYBROAD:
    RET
KEYBROAD ENDP

;=======================����FOR PERSON========================
KEYBROAD_FOR_PERSON PROC
    MOV DX,PORT_C
    MOV AL,00H
    OUT DX,AL
    MOV DX,PORT_B
    IN AL,DX                ; �ٲ��У��������Ƿ��Ա�ѹ��
    AND AL,0FH
    CMP AL,0FH
    JE DO_NOTHING           ; û�а��¾�ֱ�ӽ���     
    MOV AL,0FEH             ; ���Ա����£�ȷ����һ����������
    MOV CL,AL
NEXT_ROW_FOR_PERSON:
    MOV DX,PORT_C
    OUT DX,AL               ; ��һ������͵�ƽ
    MOV DX,PORT_B
    IN AL,DX                ; ����B��״̬
    AND AL,0FH              ; ֻ������λ������ֵ
    CMP AL,0FH              ; �Ƿ��Ϊ1�����ǣ�������ް�������
    JNE ENCODE_FOR_PERSON   ; �񣬴����а������£�תȥ����
    ROL CL,1                ; ��Ϊ1��תȥ����
    MOV AL,CL
    JMP NEXT_ROW_FOR_PERSON ; �鿴��һ��
ENCODE_FOR_PERSON:
    MOV BX,000FH
    IN AL,DX
NEXT_TRY_FOR_PERSON:
    CMP AL,KEYBOARD_DATA[BX] ; ���������ֵ�Ƿ�����е�ֵ���
    JE FINISH_FOR_PERSON
    DEC BX
    JNS NEXT_TRY_FOR_PERSON  ; �Ǹ����������
DO_NOTHING:
    MOV BX,00FFH
FINISH_FOR_PERSON:
    RET
KEYBROAD_FOR_PERSON ENDP

;======================LCD��������====================
CLEAR PROC
    MOV AL,00000001B        ; ���������    
    MOV DX,PORT_A
    OUT DX,AL 
    LCD_CMD_SET             ; ����LCDִ������
    RET
CLEAR ENDP

;==================LCD��ʼ����ӭ����=================
LCD_DISP_INIT PROC
    CALL CLEAR
    MOV AX, DATA
    LEA BX, INIT_WELCOME           ; ���ػ�ӭ����
    MOV BYTE PTR WORD_ADDRESS, 80H ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 90H ; �ڶ�����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 88H ; ��������ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 98H ; ��4����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    
    CMP SunOrNIght,00H
    JNZ DO_NIGHT
DO_SUN:
    MOV AH,00H
    MOV AL,SunFee                 ; 10 BCD => 3130H
    JMP FINISH_SUN_OR_NIGHT
DO_NIGHT:
    MOV AH,00H
    MOV AL,NightFee               ; 12 BCD => 3132H
FINISH_SUN_OR_NIGHT:
    DIV INT16                     ; AL = 01H, AH = 00H
    XCHG AH,AL                    ; AX = 0100H
    ADD AH,30H
    ADD AL,30H                    ; AX = 3130H
    LEA BX,InitPriceLCD
    MOV [BX],AX
    RET
LCD_DISP_INIT ENDP

;======================LCD_DISP_OFF����=================
LCD_DISP_OFF PROC
    CALL CLEAR
    MOV AX,DATA
    LEA BX, STATE_OFF              ; ����OFF����
    MOV BYTE PTR WORD_ADDRESS, 90H ; ��2����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    LEA BX, BLANK_LINE             ; ����OFF����
    MOV BYTE PTR WORD_ADDRESS, 98H ; ��4����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    CALL KEYBROAD                  ; �����������
    RET
LCD_DISP_OFF ENDP

;-----------------------LCD_DISP_ON_PERSON����----------------------
LCD_DISP_ON_PERSON PROC
    CALL BUZZ
    CALL CLEAR
    CALL MOTOR_INIT
    
    ;8254ͨ��1��ʼ��
    MOV AL,01110101B  ; ͨ��1���ȵͺ�ߣ���ʽ2��BCD����,N=10000
    MOV DX,CLK_CTL
    OUT DX,AL
    MOV DX,CLK_1
    MOV AL,99H
    OUT DX,AL
    MOV AL,99H
    OUT DX,AL

    MOV AX,DATA
    LEA BX,STRING_RUN              ; ���ؽ���
    MOV BYTE PTR WORD_ADDRESS, 80H ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 90H ; �ڶ�����ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 88H ; ��������ʼ�˿ڵ�ַ
    STRING_SHOW 8
    MOV BYTE PTR WORD_ADDRESS, 98H ; ��4����ʼ�˿ڵ�ַ
    STRING_SHOW 8

    LEA BX,InitPriceLCD             
    MOV BYTE PTR WORD_ADDRESS, 82H
    STRING_SHOW 1

UPDATE_INFO:
    CALL READ_MOTOR_INFO
    CALL WRITE_RUN_INFO
DO_PERSON:
    CALL KEYBROAD_FOR_PERSON
; ----------LCD_DISP_ON_PERSON�������������¿͡����١�����-----------------
    CMP BX,0001H ; �¿�
    JZ PAY
    CMP BX,0000H ; STOP/GO
    JZ STOP_GO
    CMP BX,0002H ; FAST
    JZ FAST
    CMP BX,0003H ; SLOW
    JZ SLOW
    JMP UPDATE_INFO

PAY:
    CALL CLEAR
    CALL DRAW_PAY_INFO
    JMP START

STOP_GO:
    CALL MOTOR_STOP
    JMP UPDATE_INFO

FAST:
    CALL MOTOR_INC
    JMP UPDATE_INFO

SLOW:
    CALL MOTOR_DEC
    JMP UPDATE_INFO
    RET
LCD_DISP_ON_PERSON ENDP


;---------------------LCD_DISP_SETTING����-----------------------
; -------------------���죨0��ҹ�䣨1��״̬-----------------------
LCD_DISP_SETTING PROC
    CALL CLEAR
    CMP SunOrNIght,00H
    JZ BECOME_NIGHT
BECOME_SUN:
    MOV SunOrNIght,00H
    MOV AX,DATA
    LEA BX,STATE_SUN                ; ����OFF����
    JMP FINISH_SETTING
BECOME_NIGHT:
    MOV SunOrNIght,01H
    MOV AX,DATA
    LEA BX,STATE_NIGHT              ; ����OFF����
FINISH_SETTING:
    MOV BYTE PTR WORD_ADDRESS, 93H  ; ��2����ʼ�˿ڵ�ַ
    STRING_SHOW 2
    LEA BX,BLANK_LINE               ; ����OFF����
    MOV BYTE PTR WORD_ADDRESS, 98H  ; ��4����ʼ�˿ڵ�ַ
    STRING_SHOW 8

    CALL DELAY_MACRO
    RET
LCD_DISP_SETTING ENDP


;----------------------LCD����ά���Լ���Ǯ���溯��---------------------------
DRAW_PAY_INFO PROC
    MOV DX,PORT_A
    MOV AL,00110100B ; ���书���趨 ��ͼ��ʾ OFF
    OUT DX,AL
    LCD_CMD_SET        ; ����LCDִ������
    LEA BX,QR_CODE

    ;�ϰ벿��
    MOV CL,0   ;����һֱ��CL = 32

LOOP1:
    MOV CH,0   ;����һֱ��CH = 4
LOOP2:
    MOV AL,80H 
    ADD AL,CL 
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,80H
    ADD AL,4
    ADD AL,CH
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,[BX]
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    MOV AL,[BX]
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    INC CH
    CMP CH,4
    JNZ LOOP2
    
    INC CL
    CMP CL,32
    JNZ LOOP1

    ;�°벿��
    MOV CL,0
LOOP3:
    MOV CH,0
LOOP4:
    MOV AL,80H
    ADD AL,CL
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,88H
    ADD AL,4
    ADD AL,CH
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,[BX]
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    MOV AL,[BX]
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    INC CH
    CMP CH,4
    JNZ LOOP4
    
    INC CL
    CMP CL,32
    JNZ LOOP3
    

    ;�ϰ벿��
    MOV CL,0
LOOP5:
    MOV CH,0
LOOP6:
    MOV AL,80H
    ADD AL,CL
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,80H
    ADD AL,CH
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,00H
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    MOV AL,00H
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    INC CH
    CMP CH,4
    JNZ LOOP6
    
    INC CL
    CMP CL,32
    JNZ LOOP5

    ;�°벿��
    MOV CL,0
LOOP7:
    MOV CH,0
LOOP8:
    MOV AL,80H
    ADD AL,CL
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,88H
    ADD AL,CH
    MOV DX,PORT_A
    OUT DX,AL
    LCD_CMD_SET

    MOV AL,00H
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    MOV AL,00H
    MOV DX,PORT_A
    OUT DX,AL
    LCD_DATA_SET
    INC BX

    INC CH
    CMP CH,4
    JNZ LOOP8
    
    INC CL
    CMP CL,32
    JNZ LOOP7
    
    MOV DX,PORT_A
    MOV AL,00110110B   ;���书���趨 ��ͼ��ʾ ON
    OUT DX,AL
    LCD_CMD_SET

    MOV DX,PORT_A
    MOV AL,00110000B  ;�ָ�
    OUT DX,AL
    LCD_CMD_SET

    ;д���ֵ�
    MOV AX,DATA
    LEA BX,STRING_PAY
    MOV BYTE PTR WORD_ADDRESS, 91H
    STRING_SHOW 2
    LEA BX,STRING_YUAN
    MOV BYTE PTR WORD_ADDRESS, 8AH
    STRING_SHOW 1
    
    LEA BX,Kilometer
    MOV AH,00H
    MOV AL,[BX]       ; AX = 00 18
    DIV INT16         ; AX = 08 01
    MOV AH,00H
    MUL FeeRate       ; AX = 00 02
    AAM
    ADD Price,AL
    DAA

    LEA BX,WaitingTimeMin
    MOV AH,00H
    MOV AL,[BX]
    ADD Price,AL
    DAA
    
    LEA BX,SunFee
    MOV AH,00H
    MOV AL,[BX]
    ADD Price,AL
    DAA

    MOV AH,00H
    MOV AL,Price               ; 09 => *9 => 2039 | 29 => 3239   
    DIV INT16                  ; AL = 02H, AH = 09H
    XCHG AH,AL                 ; AX = 0209H
    CMP AH,00H
    JZ SET_BLANK
    ADD AH,10H
SET_BLANK:
    ADD AH,20H
    ADD AL,30H                 ; AX = 2039 3239
    LEA BX,PriceLCD
    MOV [BX],AX

    LEA BX,PriceLCD                 
    MOV BYTE PTR WORD_ADDRESS, 89H
    STRING_SHOW 1

    CALL KEYBROAD
    RET
DRAW_PAY_INFO ENDP


; -----------------���⳵�����ʼ����ת����-------------------
MOTOR_INIT PROC
    MOV Speed,0A0H
    MOV AL,Speed     ; ������A0H����ת��
    MOV DX,PORT_0832
    OUT DX,AL
    ret
MOTOR_INIT ENDP


; -----------------д��������̼۸�Ⱥ���-------------------
;---------------�������ⲿ��Ҫ��ʾ��---------------------------
;KilometerLCD      DW    2030H,2E30H ; eg *0.0
;SpeedLCD          DW    3030H       ; eg 00
;WaitingTimeMinLCD DW    2030H       ; eg *0
;WaitingTimeSecLCD DW    3030H       ; eg 00
;��10Ԫ���� 2Ԫ
;��� 2.3����
;ʱ��  30km/h
;�ȴ� 3��21��
WRITE_RUN_INFO PROC
    MOV AX, DATA
    LEA BX, KilometerLCD
    MOV BYTE PTR WORD_ADDRESS, 92H ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 2

    LEA BX, SpeedLCD
    MOV BYTE PTR WORD_ADDRESS, 8BH ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 1
    
    ret
WRITE_RUN_INFO ENDP

; -----------------��ȡ������ת����ת������-------------------
READ_MOTOR_INFO PROC
    DELAY_MACRO
    MOV AL,01000000B
    MOV DX,CLK_CTL
    OUT DX,AL
    MOV DX,CLK_1
    IN AL,DX
    MOV AH,AL
    IN AL,DX
    XCHG AH,AL
    
    MOV CountNow,AX
    CMP AX,Count
    JBE PASS_ADD
    ADD Count,1000H
    DAA
PASS_ADD:
    LEA BX,Count
    MOV AL,[BX+1]
    LEA BX,CountNow
    MOV AH,[BX+1]
    SUB AL,AH
    DAS

KILO_ADD:
    ADD Kilometer,AL           ; ��������sub al(count),ah(count_now)
    DAA
    MOV AH,00H
    MOV AL,Kilometer           ; 82 BCD => *8.2H  => 2038 2E32
    DIV INT16                  ; AL = 08H, AH = 02H
    MOV AH,00H
    DIV INT3
    XCHG AH,AL                 ; AX = 0802H
    ADD AH,30H
    ADD AL,30H                 ; AX = 3832H
    LEA BX,KilometerLCD
    MOV [BX],AH
    MOV AH,20H
    MOV [BX+1],AH
    MOV [BX+2],AL
    MOV AL,2EH
    MOV [BX+3],AL             ; WaitingTimeMinLCD = 20 AH 2E AL = 20 38 2E 32 => *8.2 


    MOV AL,Speed               ; C0 BCD => C0-A0 = 20 => 32 00
    SUB AL,A0H                 ; AL = 20
    DAS
    MOV AH,00H
    DIV INT16                  ; AH = 00 AL = 02
    XCHG AH,AL                 ; AH = 02 AL = 00
    ADD AH,30H
    DAA
    LEA BX,SpeedLCD
    MOV [BX],AH
    MOV [BX+1],AL
    ret
READ_MOTOR_INFO ENDP

; -----------------���⳵������ٺ���-------------------
MOTOR_INC PROC
    CMP Speed,0E0H
    JZ PASS_INC
    ADD Speed,10H
    MOV AL,Speed      ; �ٶ�+10   A0 B0 C0 E0 D0
    MOV DX,PORT_0832
    OUT DX,AL
PASS_INC:
    ret
MOTOR_INC ENDP

; -----------------���⳵������ٺ���-------------------
MOTOR_DEC PROC
    CMP Speed,0C0H
    JZ PASS_DEC
    SUB Speed,10H
    MOV AL,Speed      ; �ٶ�-10   A0 B0 C0 E0 D0
    MOV DX,PORT_0832
    OUT DX,AL
PASS_DEC: 
    ret
MOTOR_DEC ENDP

; -----------------���⳵���STOP����-------------------
MOTOR_STOP PROC
TIMEING_ADD:
    CALL MOTOR_INIT
    ADD WaitingTimeSec,1H
    DAA
    CMP WaitingTimeSec,60H
    JNZ NOT_SECOND_INC
    MOV WaitingTimeSec,00H
    ADD WaitingTimeSec,1H
    DAA
NOT_SECOND_INC:
    MOV AH,00H
    MOV AL,WaitingTimeSec      ; 16 BCD => 3136H
    DIV INT16                  ; AL = 01H, AH = 06H
    XCHG AH,AL                 ; AX = 0106H
    CMP AH,00H
    JNZ SET_BLANK1
    ADD AH,10H
SET_BLANK1:
    ADD AH,20H
    ADD AL,30H                 
    LEA BX,WaitingTimeSecLCD
    MOV [BX],AX
    JMP FINISH_READ

    ADD AL,30H
    ADD AH,30H                 ; AX = 3136H
    LEA BX,WaitingTimeSecLCD
    MOV [BX],AX

    MOV AH,00H
    MOV AL,WaitingTimeMin      ; 06 BCD => 2036H    16 BCD => 3136H
    DIV INT16                  ; AL = 01H, AH = 06H
    XCHG AH,AL                 ; AX = 0106H
    CMP AH,00H
    JNZ NOT_SET_BLANK2
    ADD AH,20H
NOT_SET_BLANK2:
    ADD AH,10H
    ADD AL,30H                 ; AX = 2036H 3136H
    LEA BX,WaitingTimeMinLCD
    MOV [BX],AX


    LEA BX, WaitingTimeMinLCD
    MOV BYTE PTR WORD_ADDRESS, 9AH ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 1
    
    LEA BX, WaitingTimeSecLCD
    MOV BYTE PTR WORD_ADDRESS, 9CH ; ��һ����ʼ�˿ڵ�ַ
    STRING_SHOW 1

    CALL DELAY_MACRO
    CALL KEYBROAD
    CMP BX,0002H
    JZ FINISH_TIMING_ADD
    
    JMP TIMEING_ADD

FINISH_TIMING:
    ret
MOTOR_STOP ENDP


CODE ENDS
    END START
