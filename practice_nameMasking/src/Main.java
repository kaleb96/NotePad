import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        String name ="그고";


        String changeName = nameMasking(name);

        System.out.println("name = " + name + "\n" + "maskingName = " + changeName);

    }

    public static String nameMasking (String custNm) {
        String maskCustNm = "";

        try {

            String firstNm = "";
            String lastNm = "";

            String koMatch = "^[ㄱ-ㅎ가-힣]*$";

            if((!custNm.isEmpty())) {

                boolean isKoCust = Pattern.matches(koMatch, custNm);

                if(isKoCust) {
                    if(custNm.length() == 2) {
                        firstNm = custNm.substring(0,1);
                        lastNm = "*";
                        maskCustNm = firstNm.concat(lastNm);
                    }

                    else if(custNm.length() > 2 ) {


                        firstNm = custNm.substring(0,1);
                        lastNm = custNm.substring(custNm.length()-1, custNm.length());

                        maskCustNm = firstNm;

                        for(int i=0; i<custNm.length()-2; i++) {
                            maskCustNm += "*";
                        }

                        maskCustNm += lastNm;

                    } else {
                        maskCustNm = custNm;
                    }

                } else {

                    if(custNm.length() > 4) {

                        String first =	custNm.substring(0,2);

                        int endIndex = custNm.length() - 2;

                        String middle = custNm.substring(first.length(), endIndex);
                        String last = custNm.substring(endIndex, custNm.length());

                        maskCustNm = first;

                        for(int i=0; i< middle.length(); i++) {
                            maskCustNm += "*";
                        }

                        maskCustNm += last;


                    } else {
                        for(int i=0; i<custNm.length(); i++) {
                            maskCustNm += "*";
                        }
                    }
                }
            }

        } catch (Exception e) {
            maskCustNm = custNm;
        }



        return maskCustNm;
    }
}
