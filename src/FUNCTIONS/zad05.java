package FUNCTIONS;

public class zad05 {
    public static void main(String[] args) {
        System.out.println(printDiament('D'));
    }

    private static String printDiament(char c) {
        String text = "";
        int cId= c;
        char basicChar = 'A';
        int basicCharId = 65;
        int count = cId-basicCharId + cId-basicCharId + 1;

        for(int i = 0; i<count;i++){
            for(int j = 0;j<count;j++){
                if(j == c-basicChar || j == (count-1) - (cId - basicChar)){
                    text+=basicChar;
                }else{
                    text+=".";
                }
            }
            text+="\n";
            if(i<(cId-basicCharId)){
                basicChar++;
            }else{
                basicChar--;
            }

        }
        return text;
    }
}
