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
 * Class Name: Variable
 * Class Use: This class is the basis for the variables in JIPA and will
 *            provide an interface for the interpreter to access.
 * @author Dominic Charley-Roy
 */
import java.util.*;
/**
 *
 * @author Dominic
 */

public class Variable {
    public static List<Variable> variableList = new ArrayList<Variable>();

    private String varName;
    private int varValue;

    Variable(String varName)
    {
        this.varName = varName;
        this.varValue=0;
    }

    int getValue(){return this.varValue;}

    void setValue(int varValue){
        this.varValue = varValue;
    }

    String getName() {return varName;}

    public static boolean addVariable(String varName){
        if (findVariable(varName) == -1)
        {
            variableList.add(new Variable(varName));
            return true;
        }

        return false;
    }

    public static void removeVariable(String varName){
        int index = findVariable(varName);
        if (index != -1)
            variableList.remove(index);

    }

    public static int getVariableValue(String varName)
    {
        // Check if we are working with a pointer
        if (varName.startsWith("*")){
            return findVariable(varName.substring(1));
        }

        int varIndex = findVariable(varName);
        
        if (varIndex != -1)
            return variableList.get(varIndex).getValue();
        else
            return 0;
    }


    public static void setVariableValue(String varName, int varValue)
    {
        int varIndex = findVariable(varName);

        if (varIndex != -1)
            variableList.get(varIndex).setValue(varValue);

    }


    static int findVariable(String varName){

        ListIterator<Variable> i = variableList.listIterator();
        Variable curVariable;

        // Check if it is a reference variable, and if so, remove ampersand
        boolean isReference = varName.startsWith("&")?true:false;
        if (isReference)
            varName = varName.substring(1);

        while (i.hasNext())
        {
            curVariable = (Variable) i.next();
            if (curVariable.getName().equals(varName))
                // Check if we are working with a reference pointer
                if (!isReference)
                    return i.previousIndex();
                else
                    return curVariable.getValue();
            
        }

        return -1;
    }

}
