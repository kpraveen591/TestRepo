package com.itemmaster.testingProject.testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class App 
{
    public static void main( String[] args ) throws Exception {
        /*int[] a = new int[]{1,2,3,4};
        a = ArrayUtils.removeElement(a, 2);
        for(int b : a){
            //System.out.println(b);
        }

        Boolean b = null;
        
        if (b!= null && b) {
            System.out.println("boolean in null");
        }
        System.out.println("boolean in not null");*/
        /*String outputPathPrefix = "/home/praveenkandula/Downloads/ben/gdnMongoJson_";
        int index=1;
        String str = "°praveen";
        str = str.replaceAll("°", "degrees");
        System.out.println(str);

        String fileName = outputPathPrefix + index + ".json";
        Files.write(Paths.get(fileName), str.getBytes());*/
        String st = "manufacturerContent/defaultContentPlus/bulletPoints/bulletPoint";
        //System.out.println(st.startsWith("manufacturerContent/defaultContentPlus"));

        /*for (int i=0;i<3;i++) {
            System.out.println(i);
            for (int j=4;j<7;j++) {
                if (j==5) {
                    break;
                }
                System.out.println(j);
            }
        }*/
        /*String st1 = "240.0";
        String energy = st1.substring(0, st1.indexOf("."));
        System.out.println(energy);*/
        /*String oldObject = "1";
        String newObject = null;
        if (oldObject instanceof String || newObject instanceof String) {
            String oldObjectString = (String) oldObject;
            String newObjectString = (String) newObject;
            if ((oldObject != null && !oldObjectString.equalsIgnoreCase(newObjectString)) || (newObject != null && !newObjectString.equalsIgnoreCase(oldObjectString))) {
                System.out.println("both strings are not equal");
            } else {
                System.out.println("both strings are equal");
            }
        }*/
        /*String extendedSize = "18 (1 lb 2 oz) 510 g";

        if (extendedSize.contains("[") && extendedSize.contains("]")) {
            extendedSize = extendedSize.substring(extendedSize.indexOf("[") + 1, extendedSize.indexOf("]"));
        }
        System.out.println("Extented size 1 "+ extendedSize);
        extendedSize = extendedSize.substring(0, extendedSize.indexOf("(")).trim();
        System.out.println("Extented size 2 "+ extendedSize);
        String[] splitedExtendedSize = extendedSize.split("\\s+");
        if (splitedExtendedSize.length > 1) {
            String uom = splitedExtendedSize[1];
            if (uom.equalsIgnoreCase("fl")) {
                uom = "FL OZ";
            }
            System.out.println(splitedExtendedSize[0]);
            System.out.println(uom.toUpperCase());
        }*/
        List<String> a46 = Arrays.asList("00092352208777","00030400792076","00032700157432","00032700158439","00032700158460","00032700158477","00039938228347","00039938327941","00039938415723","00039938512279","00039938512347","00041520105097","00073525119465","00073525119762","00073525875880","00092352206278","00092352206377","00092352521678","00677294991125","00677294991132","00677294991149","00677294991194","00677294991200","00677294998018","00677294998025","00677294998032","00677294999015","00677294999022","00677294999039","00677294999046","00718531131222","00732153024755","00732153024816","00732153026261","00732153026414","00732153026421","00732153026438","00732153026469","00732153028494","00732153028500","00732153028555","00732153028562","00732153028579","00732153028609","00732153029217","00732153029217","00810589030325");
        List<String> a27 = Arrays.asList("00030400792076","00032700157432","00677294991125","00677294991132","00677294991149","00677294991194","00677294991200","00677294998018","00677294998025","00677294998032","00677294999015","00677294999022","00677294999039","00677294999046","00732153024755","00732153024816","00732153026414","00732153026421","00732153026438","00732153026469","00732153028494","00732153028555","00732153028562","00732153028579","00732153028609","00732153029217","00810589030325");
        Collection<String> minus = CollectionUtils.subtract(a46,a27);
        System.out.println("Minus with size "+minus.size() + "."+minus);
        /*Boolean oldObject = null;
        Boolean newObject = true;
        if (oldObject instanceof Boolean || newObject instanceof Boolean) {
            if ((oldObject != null && !oldObject.equals(newObject)) || (newObject != null && !newObject.equals(oldObject))) {
                System.out.println("Both are not equal");
            }
        }*/
        String property = "planogramData/trayHeight";
        String planogramDataProperty = property.substring(property.indexOf("/") + 1);
        planogramDataProperty = WordUtils.capitalizeFully(planogramDataProperty);
        //System.out.println(planogramDataProperty);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Timestamp t = new Timestamp(new Date().getTime());
        Date d = t;
        //System.out.println(d);
        String makeCapital = "packageImporterAddress";
        //makeCapital = StringUtils.capitalize(makeCapital);
        makeCapital = WordUtils.capitalize(makeCapital);
        //System.out.println("##### "+makeCapital);
        List<String> upcs = Arrays.asList("2800006581");

        for (String upc : upcs) {
            //System.out.println(StringUtils.leftPad(upc, 14, "0"));
        }
        String line = "1,20180101,20190102";
        Map<String,String> publishedDatesForItemIds = new LinkedHashMap<>();
        publishedDatesForItemIds.put(line.substring(0, line.indexOf(",")), line.substring(line.indexOf(",")+1));
        //System.out.println(publishedDatesForItemIds);
        String fileContent = "{\"_id\": {\"$oid\": \"5ad0ea1b8d522f20f098898c\"}, \"Upc\": \"00643392501504\", \"Brand\": \"SCHARFFEN BERGER\", \"IsOnHold\": \"False\", \"Modifier\": \"X\", \"Container\": \"STD\", \"Gladson Product Name\": \"Scharffen Berger 00643392501504\", \"Source\": {\"Topco\": {\"Description\": \"Baking Chocolate, Semisweet Dark\", \"Language\": \"English\", \"Legacy_ItemId\": \"1300794\", \"ItemId\": \"00643392501504\", \"DateAndTimeOfReception\": {\"$date\": 1541805408000}, \"Gladson Product Name\": \"Scharffen Berger 00643392501504\", \"ProductId\": \"558db7b3-ff67-44c4-ad54-a8c103c5454a\", \"Upc\": \"00643392501504\", \"Brand\": \"SCHARFFEN BERGER\", \"IsOnHold\": \"False\", \"Modifier\": \"X\", \"Source Label\": \"Manufacturer Sponsored\", \"Source List\": \"Topco\", \"Syndication\": \"True\", \"Date\": {\"$date\": 1541805408000}, \"IsRestricted\": \"False\", \"IsRestrictedCategory\": \"False\", \"IsDiscontinued\": \"False\", \"Container\": \"STD\", \"Categories\": {\"Category\": {\"Name\": \"HRSHRNDR\", \"Code\": \"HRSHRNDR\"}}, \"Nutrition-Scoring\": {\"Upc\": \"0643392501504\", \"Lastscoreddate\": {\"$date\": 1422252000000}, \"Nuvalscore\": \"14\", \"Description\": \"SEMISWEET BAKING CHUNKS FINE ARTISAN DARK 62% CACAO\"}}}, \"CategoryNames\": [\"HRSHRNDR\"], \"Permissions\": [{\"$oid\": \"5975ef318d52322b2461462d\"}, {\"$oid\": \"59e7d7008d52302bd017e3b1\"}, {\"$oid\": \"5c40fe4e8d523522dc40eb9c\"}]}";
        //System.out.println(StringUtils.ordinalIndexOf(fileContent, "{",4));
        //System.out.println(fileContent.substring(fileContent.indexOf("\"Source\": {\"") + 12 , StringUtils.ordinalIndexOf(fileContent, "{",4)));
    }
}
