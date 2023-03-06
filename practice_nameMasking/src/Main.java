import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Main {


    public static void main(String[] args) {

        Map<String, Object>testMap = new HashMap<String, Object>();

        testMap.put("entrNo","500107295168");
        testMap.put("lssinsEntrSeqno","7035293579");
        testMap.put("dvicMdlCd","SM-G930L");
        testMap.put("dvicNo","00000000000000471391");
        testMap.put("petNm","SM-A530N");//단말기 모델명 팻네임 추가됨190511
        testMap.put("cntcMgmtNo","LGT20161429160");

        testMap.put("lbciEntrProdNo", "010012341234");
        testMap.put("lssinsChngDvCd","04");
        testMap.put("lssinsNowSttsCd","C");
        testMap.put("lssinsNowSttsNm","서비스해지");
        testMap.put("entrDt","20190701");
        testMap.put("chngDt","20180511122851");
        testMap.put("prssDlrCd","313060");
        testMap.put("realOprtrId","771230011");
        testMap.put("extnAgrmtYn","");
        testMap.put("infoOpenAgrmtYn","Y");
        testMap.put("lssinsRcrtDvCd","G");
        testMap.put("enprNo","");
        testMap.put("devDlvrAmt","836000");
        testMap.put("lbciEntrCustNm","Reonarld Roberto");
        testMap.put("custDvCd","I");
        testMap.put("devSbgnDt","20161117143607");
        testMap.put("lbciEntrEmailAddr","");
        testMap.put("insrValdEndDt","20180511");
        testMap.put("insrValdStrtDt","20161117");
        testMap.put("lbciDvisCd","P6");
        testMap.put("lbciDivsNm","폰케어플러스(P6)");
        testMap.put("lbciKdCd","A");
        testMap.put("lbciKdNm","종합형");
        testMap.put("entrPrm","836000");
        testMap.put("oncePmntPrm","4500");
        testMap.put("scurNo","20164980798");
        testMap.put("lgtDlrTelno","001056877804");
        testMap.put("insdprsPrsnYn","Y");
        testMap.put("ppCd","LPZ0002027");
        testMap.put("tmpecYn","");
        testMap.put("tmpecItemId","");
        testMap.put("tmpDvicNo","");
        testMap.put("totPrm","54000");
        testMap.put("cmpsnYn","");
        testMap.put("manfCd","0000002");

        Map<String, Object>copyMap = new HashMap<String, Object>();
        copyMap.putAll(testMap);
        checkValue(copyMap);
        System.out.println("testMap_Value = " + testMap);
        System.out.println("========================================================================================");
        System.out.println("copyMap_Value = " + copyMap);
    }
    public static Map<String,Object> checkValue(Map<String,Object> copyMap) {

        String newName ="";
        if(copyMap.containsKey("lbciEntrCustNm")) {
            // 이름 관련으로 이름 마스킹
            newName = nameMasking((copyMap.get("lbciEntrCustNm")).toString());
            copyMap.put("lbciEntrCustNm",newName);

        }

        if(copyMap.containsKey("entrCustNm")) {
            // 이름과 타 개인정보 관련으로 이름은 마스킹, 타 개인정보는 AES 암호화
            newName = nameMasking((copyMap.get("entrCustNm")).toString());

        }

        if(copyMap.containsKey("banoDepsrNm")) {
            // 이름과 타 개인정보 관련으로 이름은 마스킹, 타 개인정보는 AES 암호화
        }

        if(copyMap.containsKey("pymCustNm")) {
            // 이름 과 이름 이외의 개인정보 관련으로 이름은 마스킹, 타 개인정보는 AES 암호화
        }
        return copyMap;
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
                    // 한국 이름이 외자인 경우
                    if(custNm.length() == 2) {
                        firstNm = custNm.substring(0,1);
                        lastNm = "*";
                        maskCustNm = firstNm.concat(lastNm);
                    }

                    else if(custNm.length() > 2 ) {
                    // 한국 이름이 외자가 아닌 경우

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
                    // 외국 이름의 경우
                    if(custNm.length() > 2) {

                        int len = custNm.length();
                        int endIdx = len -1;
                        String startNm = custNm.substring(0,1);
                        String endNm = custNm.substring(endIdx - 1, endIdx);

                        maskCustNm = startNm;

                        for(int i=1; i< endIdx - 1; i++) {
                            maskCustNm += "*";
                        }

                        maskCustNm += endNm;


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
