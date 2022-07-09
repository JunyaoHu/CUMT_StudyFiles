package net.mooctest;
// *******************************************
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
/**
 * Class Name: Jipa
 * Class Use: This class is the core of the interpreter, handling
 *            the processing and interpreting of the code.
 * @author Dominic Charley-Roy
 */
import java.io.*;
import java.util.*;

public class Jipa {
    public static int TOTAL_INSTRUCTIONS=0;
    public static String[] instruction = new String[0];
    public static int iPtr = 0;

    public enum opcodes{
        halt, novalue,                            // System Commands
        set, mov, cpy, var, del, arr,             // Setting Commands
        add, sub, mul, div, mod,                  // Arithmethic
        inc, dec,                                 // Increment / Decrement
        in, out,                                  // Input/Output commands
        jmp, jnz, jz, je, ja, jae, jb, jbe, jne,  // Jump commands
        xor, or, and,                             // Logical Arithmethic
        cmp                                       // Compare commands
        ;

        public static opcodes toOpcode(String str)
        {
            try {
                return valueOf(str);
            } catch (Exception e){
                return novalue;
            }
        }
    }

    public static void processInstruction(String instruction)
    {
        //////////////////////////////////////
        // Instruction Format               //
        // ------------------               //
        // opcode (operand[0](,operand[1])) //
        //////////////////////////////////////
        String opcode;
        String operand[];
        int spaceLoc = instruction.indexOf(' '), commaLoc = instruction.indexOf(',');

        // Get the op code and operands
        
        if (spaceLoc != -1)
        {
            opcode = instruction.substring(0, spaceLoc);

            // Split up arguments and parse them to an array
            //operand = instruction.substring(spaceLoc+1).split(",");
            //operand = new int[operandString.length];
            //for (int i = 0; i < operandString.length; i++)
            //    operand[i] = Integer.parseInt(operandString[i]);
            operand = splitArguments(instruction.substring(spaceLoc+1));
        }
        else
        {
            // No arguments
            opcode = instruction;
            operand = new String[1];
        }

        switch (opcodes.toOpcode(opcode.toLowerCase()))
        {
            case halt:
                System.exit(0);
                break;

            // out r - Displays a string value
            case out:
                System.out.println(getStringValue(operand[0]));
                break;


            // in var1 - Reads for user input (integer) and places it in r1
            case in:
                Variable.setVariableValue(operand[0], readValue());
                break;

            // mov var1, var2 - moves the value of variable 1 to variable 2
            case mov:
                Variable.setVariableValue(operand[1], Variable.getVariableValue(operand[0]));
                Variable.setVariableValue(operand[0], 0);
                break;

            // cpy var1, var2 - copies the value of variable 1 to variable 2
            case cpy:
                Variable.setVariableValue(operand[1], Variable.getVariableValue(operand[0]));
                break;

            // set var1,(n/var2) - sets the value of variable var1 to either n or var2
            case set:
                Variable.setVariableValue(operand[0],getValue(operand[1]));
                break;

            // del var1 - removes the variable, consequently shifting all above pointers down by one
            case del:
                Variable.removeVariable(operand[0]);
                break;

            // arr var, n - Creates an array named var1 with n elements. First element
            //              is called var, all consequent ones are var1, var2,..,varn-1
            case arr:
                // Create first one
                Variable.addVariable(operand[0]);

                for (int i=1;i<Integer.parseInt(operand[1]);i++)
                    Variable.addVariable(operand[0]+""+i);

                break;

            // var string - creates a variable named string
            case var:
                Variable.addVariable(operand[0]);
                break;

            // inc var1 - Increments var1 value
            case inc:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + 1);
                break;

            // dec r1 - Decrements var1 value
            case dec:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) - 1);
                break;
                
            // add var1, n|var2 - adds the values of n/variable2 to variable1
            case add:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + getValue(operand[1]));
                break;

            // sub var1, var2 - subsract variable2 value from variable 1 value
            case sub:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) - getValue(operand[1]));
                break;

            // mul var1, var2 - multiply variable1 value by variable2 value
            case mul:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) * getValue(operand[1]));
                break;

            // div var1, var2 - divide variable1 value by variable2 value
            case div:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) / getValue(operand[1]));
                break;

            // mod var1, var2 - modulus variable1 value by variable 2 value
            case mod:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) % getValue(operand[1]));
                break;

            // xor var1, var2 - xors the values of variable2 to variable1
            case xor:

                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) ^ getValue(operand[1]));
                break;

            // or var1, var2 - ors the values of variable2 to variable1
            case or:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) | getValue(operand[1]));
                break;

            // and var1,va r2 - ors the values of variable2 to variable1
            case and:
                Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + getValue(operand[1]));
                break;

            // jmp l1 - jump to line l1
            case jmp:
                iPtr = getJumpValue(operand[0]);
                break;

            // jnz var1, l1 - Jump to line l1 if variable1 is not zero
            case jnz:
                if (getValue(operand[0]) != 0)
                    iPtr = getJumpValue(operand[1]);
                break;

            // ja var1,var2,l1 - Jump to line l1 if variable1 is above variable2
            case ja:
                if (getValue(operand[0]) > getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // jae var1,var2,l1 - Jump to line l1 if variable 1 is above or equal variable2
            case jae:
                if (getValue(operand[0]) >= getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // jb var1,var2,l1 - Jump to line l1 if variable 1 is below variable2
            case jb:
                if (getValue(operand[0]) < getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // jbe var1,var2,l1 - Jump to line l1 if variable 1 is below or equal variable2
            case jbe:
                if (getValue(operand[0]) <= getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // jz var1, l1 - Jump to the line l1 if variable 1 is zero
            case jz:
                if (getValue(operand[0]) == 0)
                    iPtr = getJumpValue(operand[1]);
                break;

           // je r2, r2, l1 - Jump to the line l1 if variable 1 and 2 are equal
            case je:
                if (getValue(operand[0]) == getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // jne r2, r2, l1 - Jump to the line l1 if variable 1 and 2 are not equal
            case jne:
                if (getValue(operand[0]) != getValue(operand[1]))
                    iPtr = getJumpValue(operand[2]);
                break;

            // cmp r1, r2, r3 - Compares r1 and r2. If they are equal, places 1 in r3. If not, places 0.
            case cmp:
                if (getValue(operand[1]) == getValue(operand[0]))
                    Variable.setVariableValue(operand[2], 1);
                else
                    Variable.setVariableValue(operand[2], 0);
                break;

        }
        
        iPtr++;
        return;


    }

    public static String getFileName()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the full path to the file or type q to quit :");
        return in.nextLine();
    }

    public static boolean loadInstructions(String fileName)
    {
        String currentLine;
        int i=0;

        // Reset instructions before we do anything
        resetInstructions();

        // Get file name if we don't have one
        if (fileName.isEmpty())
            fileName = getFileName();

        // Check if user wants to quit
        if (fileName.equalsIgnoreCase("q"))
            System.exit(0);
       
        try {
            // Initialize file reader
            FileInputStream fin = new FileInputStream(fileName);
            BufferedReader inputFile = new BufferedReader(new InputStreamReader(fin));

            // Count the number of lines
            LineNumberReader linecount = new LineNumberReader(new FileReader(fileName));
            while ((currentLine = linecount.readLine()) != null){}
            TOTAL_INSTRUCTIONS = linecount.getLineNumber();
            instruction = new String[TOTAL_INSTRUCTIONS];
            linecount.close();

            // Read every line and parse it to the instruction array
            while ((currentLine = inputFile.readLine()) != null )
            {
                // Is there a comment in the line? Remove it
                currentLine = removeComment(currentLine);

                // Add the instruction to the list
                instruction[i]=currentLine.trim();
                i++;
            }

            // Build label list
            Label.buildLabelList();
        }
        catch (Exception e) {
            e.printStackTrace();
            //System.out.println(fileName);
            //System.out.println("File not found. Please enter another one.");
            return false;
        }

        return true;
    }

    public static String removeComment(String line)
    {
        if (line.lastIndexOf(';') == -1)
            return line.trim();
        else
            // Check to make sure the semi colon isn't in quotes.
            if (line.lastIndexOf(';') > line.lastIndexOf('"'))
                return line.substring(0,line.lastIndexOf(';')).trim();
            else
                return line.trim();
    }

    public static void resetInstructions()
    {
        for (int i = 0; i < TOTAL_INSTRUCTIONS; i++)
            instruction[i]="";
    }

    public static String[] splitArguments(String original)
    {
        int lastArg = 0;
        String[] args;
        Collection<String> argList = new ArrayList<String>();
        boolean inQuotes=false;

        // Check if there are no arguments
        if (original.indexOf(',') == -1){
            args = new String[1];
            args[0]=original.trim();
            return args;
        }

        // Add each argument found to the collection
        for (int i = 0;i < original.length();i++)
        {
            // Are we in quotes
            if (original.charAt(i)== '"')
            {
                inQuotes = !inQuotes;
            } else if(original.charAt(i)==',' && inQuotes==false)
            {
                argList.add(original.substring(lastArg,i).trim());
                lastArg = i+1;
            }
        }
        
        // Add the last argument
        argList.add(original.substring(lastArg).trim());
        
        // Convert it to a string array.
        args = (String[]) argList.toArray(new String[0]);

        return args;
        
    }

    public static int getValue(String operand)
    {
        if (!isNumeric(operand))
        {
            return Variable.getVariableValue(operand);
        } else {
            return Integer.parseInt(operand);
        }
    }

    public static int getJumpValue(String operand)
    {
        if (isNumeric(operand))
            return Integer.parseInt(operand) - 1;
        else 
            return Label.findLabel(operand) - 1;

    }

    public static int readValue()
    {
        Scanner in = new Scanner(System.in);
        String tmpInt = in.nextLine();
        if (isNumeric(tmpInt))
            return Integer.parseInt(tmpInt);
        else
            return 0;
    }

    public static String getStringValue(String original)
    {
        String finalString = "";
        boolean inQuotes = false;
        int lastQuotes = 0;

        // Check if there is any quotes?
        if (original.indexOf('"') == -1)
            return Integer.toString(getValue(original));

        // Loop through every character and process quotes
        for (int i = 0;i < original.length();i++)
        {
            if (original.charAt(i) == '"'){
                if (inQuotes)
                {
                    finalString = finalString + original.substring(lastQuotes,i);
                    inQuotes=false;
                    lastQuotes=i+1;
                } else {
                    inQuotes=true;
                    if (i!=0)
                        finalString = finalString + getValue(original.substring(lastQuotes,i));
                    lastQuotes=i+1;
                }
            }
        }

        // Check if there is any values at the end that haven't been processed.
        if (lastQuotes != original.length())
             finalString = finalString + getValue(original.substring(lastQuotes));
        
        return finalString;
    }

    public static boolean isNumeric(String str)
    {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
