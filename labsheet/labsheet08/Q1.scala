object CaesarCipher {

  // Function to encrypt the plaintext
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Function to decrypt the ciphertext
  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  // Cipher function to process data using encryption or decryption function
  def cipher(text: String, shift: Int, mode: String): String = {
    mode match {
      case "encrypt" => encrypt(text, shift)
      case "decrypt" => decrypt(text, shift)
      case _ => throw new IllegalArgumentException("Mode must be either 'encrypt' or 'decrypt'")
    }
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, "encrypt")
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, "decrypt")
    println(s"Decrypted Text: $decryptedText")
  }
}
