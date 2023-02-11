package day46_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_SahibindenStructure {

    public static void main(String[] args) {

        Map<String, Map<String,Map<String,String>>> audi = new HashMap<>();

        Map<String,Map<String,String>> a1 = new HashMap<>();
        Map<String,Map<String,String>> a2 = new HashMap<>();
        Map<String,Map<String,String>> a3 = new HashMap<>();
        Map<String,Map<String,String>> a4 = new HashMap<>();

        audi.put("Model1",a1);
        audi.put("Model2",a2);
        audi.put("Model3",a3);
        audi.put("Model4",a4);

        Map<String,String> model1 = new HashMap<>();
        model1.put("1066373256","Manisa / Salihli / Beşeylül Mh.\n" +
                "İlan No 1066373256\n" +
                "İlan Tarihi 06 Aralık 2022\n" +
                "Marka Audi \n" +
                "Seri A1 \n" +
                "Model 1.6 TDI Attraction \n" +
                "Yıl 2013\n" +
                "Yakıt Dizel\n" +
                "Vites Yarı Otomatik\n" +
                "Araç Durumu İkinci El\n" +
                "KM 167.000\n" +
                "Kasa Tipi Hatchback 5 kapı\n" +
                "Motor Gücü 90 hp\n" +
                "Motor Hacmi 1598 cc\n" +
                "Çekiş Önden Çekiş\n" +
                "Renk Siyah\n" +
                "Garanti Evet\n" +
                "Plaka / Uyruk Türkiye (TR) Plakalı\n" +
                "Kimden Galeriden\n" +
                "Görüntülü Arama İle Görülebilir Evet\n" +
                "Takas Evet ");

        model1.put("1066332869","Edirne / Merkez / İstasyon Mh.\n" +
                "İlan No 1066332869\n" +
                "İlan Tarihi 06 Aralık 2022\n" +
                "Marka Audi \n" +
                "Seri A1 \n" +
                "Model 1.4 TFSI Attraction \n" +
                "Yıl 2012\n" +
                "Yakıt Benzin\n" +
                "Vites Yarı Otomatik\n" +
                "Araç Durumu İkinci El\n" +
                "KM 127.316\n" +
                "Kasa Tipi Hatchback 3 kapı\n" +
                "Motor Gücü 122 hp\n" +
                "Motor Hacmi 1390 cc\n" +
                "Çekiş Önden Çekiş\n" +
                "Renk Siyah\n" +
                "Garanti Hayır\n" +
                "Plaka / Uyruk Türkiye (TR) Plakalı\n" +
                "Kimden Galeriden\n" +
                "Görüntülü Arama İle Görülebilir Hayır\n" +
                "Takas Evet ");



            a1.put("car1",model1);

        System.out.println(audi);


    }

}
