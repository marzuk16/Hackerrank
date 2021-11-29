public class EnglishToBanglaNumberConverter {

    public static String converter(String numbers){
        String banglaNumbers = "০১২৩৪৫৬৭৮৯";
        String convertedNumber = "";
        for(int i=0; i<numbers.length(); i++){
            convertedNumber += banglaNumbers.charAt((int)numbers.charAt(i) - 48);
        }

        return convertedNumber;
    }

    public static void main(String[] args) {
    
        System.out.println(converter("12122"));
    }
    
}
