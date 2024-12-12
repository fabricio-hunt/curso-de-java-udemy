public class FuncoesString {
    public static void main(String[] args) {
        /*

        1. **charAt(int index)**: Retorna o caractere na posição especificada.
   ```java
        String str = "Acadêmico Tech";
        char caractere = str.charAt(2); // Retorna 'a'
   ```

        2. **indexOf(String str)** e **lastIndexOf(String str)**: Retornam a posição da primeira e última ocorrência da substring especificada.
   ```java
        String str = "Acadêmico Tech";
        int firstIndex = str.indexOf("Aca"); // Retorna 0
        int lastIndex = str.lastIndexOf("c"); // Retorna 12
   ```

        3. **startsWith(String prefix)** e **endsWith(String suffix)**: Verificam se a string começa ou termina com a substring especificada.
   ```java
        String str = "Acadêmico Tech";
        boolean inicio = str.startsWith("Acad"); // Retorna true
        boolean fim = str.endsWith("Tech"); // Retorna true
   ```

        4. **split(String regex)**: Divide a string em um array de strings com base na expressão regular fornecida.
   ```java
        String str = "Olá, Acadêmico Tech!";
        String[] partes = str.split(","); // Retorna ["Olá", " Acadêmico Tech!"]
   ```

        5. **replace(CharSequence target, CharSequence replacement)**: Substitui todas as ocorrências da substring especificada pela nova substring.
   ```java
        String str = "Acadêmico Texx";
        String substituido = str.replace("xx", "ch"); // Retorna "Acadêmico Tech"
   ```

        6. **length()**: Retorna o comprimento da string.
   ```java
        String str = "Tech";
        int tamanho = str.length(); // Retorna 4
   ```

        7. **substring(int beginIndex, int endIndex)**: Retorna uma substring da string original com base nos índices especificados.
   ```java
        String str = "Acadêmico Tech";
        String sub = str.substring(0, 8); // Retorna "Acadêmico"
   ```

        8. **contains(CharSequence s)**: Verifica se a string contém a substring especificada.
   ```java
        String str = "Tech";
        boolean contem = str.contains("ch"); // Retorna true
   ```

        9. **isEmpty()**: Verifica se a string está vazia.
   ```java
        String str = "";
        boolean vazia = str.isEmpty(); // Retorna true
   ```

        10. **toLowerCase()** e **toUpperCase()**: Convertem todos os caracteres da string para minúsculas ou maiúsculas, respectivamente.
    ```java
        String str = "Tech";
        String minuscula = str.toLowerCase(); // Retorna "tech"
        String maiuscula = str.toUpperCase(); // Retorna "TECH"
    ```

        Essas funções são bastante úteis para diversas operações com strings em Java[1](https://www.academicotech.com/post/manipulando-strings-com-java-10-funcoes-e-metodos-uteis)[2](https://www.guru99.com/pt/string-manipulation-in-java.html)[3](https://www.devmedia.com.br/java-string-manipulando-metodos-da-classe-string/29862). Se precisar de mais detalhes ou exemplos, sinta-se à vontade para perguntar! */
    }
}
