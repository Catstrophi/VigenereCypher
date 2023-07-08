# VigenereCypher
Vigenere Cypher Encrypter and Decrypter

The code defines a public class named vigernereCipher.
Inside the vigernereCipher class, there is a main method that serves as the entry point of the program.
The main method calls the Cipher method with three arguments: "OM" (the text to be encrypted or decrypted), "hello" (the keyword), and "decrypt" (the type of operation to be performed).
The Cipher method is responsible for encrypting or decrypting the input text using the Vigenere cipher algorithm. It takes three arguments: txt (the text to be encrypted or decrypted), key (the keyword), and type (the type of operation).
The Cipher method first converts the txt parameter to uppercase using the toUpperCase method. This ensures that the text is treated consistently regardless of the case.
It initializes two empty strings: finalWord (which will hold the encrypted or decrypted text) and keyStream (which will store the repeated keyword to match the length of the text).
The Cipher method then calls the keys method to generate the keyStream.
The keys method takes the txt and key parameters and creates a repeated string of the key to match the length of the txt string. This is done using a loop that concatenates the key to the keyStream until it reaches a length that is at least equal to txt.length().
After the loop, the keyStream is truncated to the length of the txt using the substring method and converted to uppercase.
The keys method returns the generated keyStream string.
Back in the Cipher method, a loop iterates through each character of the txt.
Inside the loop, it calculates the numerical values (t and k) of the current characters in the txt and keyStream, respectively. This is done by converting the characters to their ASCII values and subtracting 65 to map them to the range 0-25 (A-Z).
Depending on the type of operation (encrypt or decrypt), the code performs the appropriate calculations to obtain the encrypted or decrypted character value.
The resulting character value is then converted back to a character using the ASCII value addition and concatenates it to the finalWord string.
After the loop, the finalWord string, containing the encrypted or decrypted text, is returned.
