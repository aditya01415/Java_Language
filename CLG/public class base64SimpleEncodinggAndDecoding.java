import java.util.Base64;
public class base64SimpleEncodinggAndDecoding {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Encoding
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded String: " + encodedString);
        
        // Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
}

