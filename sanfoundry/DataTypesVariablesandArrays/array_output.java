package DataTypesVariablesandArrays;

public class array_output {
	public static void main(String args[]) 
    {    
        char array_variable [] = new char[10];
    for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + "" );
            i++;
        }
    } 
}
