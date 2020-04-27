public class HienThi {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
                String result ="*********";
                System.out.println(result);
        }
        for (int i=1;i<7;i++){
            String result ="";
            for (int j=1;j<=i;j++){
                result+="*";
            }
            System.out.println(result);
        }
        for (int i=1;i<7;i++){
            String result ="";
            for (int j =1;j<7-i;j++){
                result+="*";
            }
            System.out.println(result);
        }
    }
}
