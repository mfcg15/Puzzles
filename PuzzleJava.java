import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava
{
    public ArrayList<Integer> getTenRolls()
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for(int i = 0; i < 10 ; i++)
        {
            Random numeroAleatorio = new Random();
            int agregarNumero = 1 + numeroAleatorio.nextInt(20);
            numeros.add(agregarNumero);
        }
       
        return numeros;
    }

    public char getRandomLetter()
    {
        char letra = ' ';
        char alfabeto [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random numeroAleatorio = new Random();        
        int indice = numeroAleatorio.nextInt(25);
        for(int i = 0; i < alfabeto.length; i++)
        {
            if(indice == i)
            {
                letra = alfabeto[i];
            }
        }
       
        return letra;
    }

    public String generatePassword()
    {
        String password = "";

        for(int i = 0; i < 8; i++)
        {
            char caracter = getRandomLetter();
            password += caracter+"";
        }
       
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int longitud)
    {
        ArrayList<String> lista_paswords = new ArrayList<String>();

        for(int i = 0; i < longitud ; i++ )
        {
            String password = "";

            for(int j = 0; j < 8; j++)
            {
                char caracter = getRandomLetter();
                password += caracter+"";
            }

            lista_paswords.add(password);
        }
        
        return lista_paswords;
    }

    public String [] shuffleArray(String frase)
    {
        String [] palabra = frase.split(" ");

        String auxArray[] = new String[palabra.length];

        for(int i = 0; i < palabra.length;i++)
        {
            Random numeroAleatorio = new Random();        
            int indice = numeroAleatorio.nextInt(palabra.length);
            auxArray[i] = palabra[indice];
        }
        
        return auxArray;
    }
}