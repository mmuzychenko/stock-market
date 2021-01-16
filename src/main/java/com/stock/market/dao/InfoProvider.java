package com.stock.market.dao;

import com.stock.market.dto.Share;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmuzichenko on 11/9/2017.
 */
public class InfoProvider {

    public List<Share> getSharesList() {
        List<Share> sharesList = new ArrayList<>();
        sharesList.add(new Share("BP", 524.10, -0.60, -0.11));
        sharesList.add(new Share("Barclays", 179.45, -1.90, -1.05));
        sharesList.add(new Share("HSBC", 738.10, 5.20, 0.71));
        sharesList.add(new Share("Lloyds Banking",	66.82,	-0.48,	-0.71));
        sharesList.add(new Share("London Stock Exchange",	3770.0,	-3.0,	-0.08));
        sharesList.add(new Share("BMW",	87.240,	-0.180,	-0.21));
        sharesList.add(new Share("Commerzbank",	11.725,	-0.075,	-0.64));
        sharesList.add(new Share("Deutsche Bank",	14.740,	0.210,	1.45));
        sharesList.add(new Share("Deutsche Borse",	91.960,	1.550,	1.71));
        sharesList.add(new Share("Lufthansa",	26.750,	-1.010,	-3.64));
        sharesList.add(new Share("Metro AG",	11.540,	0.050,	0.44));
        sharesList.add(new Share("SAP",	98.500,	+0.010,	0.01));
        sharesList.add(new Share("Volkswagen VZO",	158.30,	-3.60,	-2.22));
        sharesList.add(new Share("Credit Suisse",	16.17,	0.01,	+0.06));
        sharesList.add(new Share("Nestle SA",	84.25,	0.75,	0.90));
        sharesList.add(new Share("Swisscom",	506.50,	3.50,	0.70));
        sharesList.add(new Share("UBS Group",	16.95,	0.01,	0.06));
        sharesList.add(new Share("Airbus Group",	85.46,	-0.94,	-1.09));
        sharesList.add(new Share("Axa",	25.390,	+0.070,	0.28));
        sharesList.add(new Share("BNP Paribas",	64.82,	0.07,	0.11));
        sharesList.add(new Share("Credit Agricole",	14.260,	-0.465,	-3.16));
        sharesList.add(new Share("Mazda Motor",	1577.0,	-8.8,	-0.55));
        sharesList.add(new Share("Mitsubishi Motors Corp.",	868.5,	-38.0,	-4.19));
        sharesList.add(new Share("Mizuho Financial",	204.55,	-1.60,	-0.78));
        sharesList.add(new Share("Nissan Motor",	1119.3,	+9.0,	0.81));
        sharesList.add(new Share("Shinsei Bank",	1802.5,	-19.0,	-1.04));
        sharesList.add(new Share("Softbank Corp.",	10012.5,	-55.0,	-0.55));
        sharesList.add(new Share("Sumitomo Mitsui",	4411.6,	-62.0,	-1.39));
        sharesList.add(new Share("Toshiba Corp.",	320.5,	-4.0,	-1.23));
        sharesList.add(new Share("Bank of China",	3.840,	0.000,	0.00));
        sharesList.add(new Share("HSBC",	75.33,	-0.55,	-0.72));

        return sharesList;
    }

    public String getRaits() {
        return "Dow 30\\t23,328.84\\t23,201.78\\t+0.71%\\t0:02:00\\n\" +\n" +
                "        \"S&P 500\\t2,575.44\\t2,567.56\\t+0.51%\\t20/10\\n\" +\n" +
                "        \"Russell 2000\\t1,514.35\\t1,509.90\\t+0.43%\\t20/10\\n\" +\n" +
                "        \"DAX\\t13,063.57\\t12,956.42\\t+0.01%\\t20/10\\n\" +\n" +
                "        \"FTSE 100\\t7,560.04\\t7,517.07\\t+-0.05%\\t20/10\\n\" +\n" +
                "        \"CAC 40\\t5,392.09\\t5,368.21\\t+0.08%\\t20/10\\n\" +\n" +
                "        \"Euro Stoxx 50\\t3,617.52\\t3,600.05\\t+0.06%\\t20/10\\n\" +\n" +
                "        \"AEX\\t546.45\\t543.82\\t+0.01%\\t20/10\\n\" +\n" +
                "        \"IBEX 35\\t10,249.00\\t10,176.50\\t+0.25%\\t20/10\\n\" +\n" +
                "        \"FTSE MIB\\t22,362.23\\t22,165.70\\t+0.97%\\t20/10\\n\" +\n" +
                "        \"SMI\\t9,279.08\\t9,213.76\\t+0.04%\\t20/10\\n\" +\n" +
                "        \"Nikkei 225\\t21,489.26\\t21,363.10\\t+0.04%\\t20/10\\n\" +\n" +
                "        \"Hang Seng\\t28,519.76\\t28,313.70\\t+1.17%\\t20/10\\n\" +\n" +
                "        \"S&P/ASX 200\\t5,924.90\\t5,868.60\\t+0.18%\\t20/10\\n\" +\n" +
                "        \"    USD/RUB\\t57.4945\\t57.6345\\t57.2725\\t+0.39%\\t20/10\\n\" +\n" +
                "        \" USD/UAH\\t26.5400\\t26.5500\\t26.4550\\t+0.11%\\t20/10\\n\" +\n" +
                "        \" EUR/USD\\t1.1784\\t1.1858\\t1.1763\\t-0.57%\\t20/10\\n\" +\n" +
                "        \" USD/JPY\\t113.53\\t113.57\\t112.52\\t+0.88%\\t20/10\\n\" +\n" +
                "        \" GBP/USD\\t1.3186\\t1.3201\\t1.3088\\t+0.21%\\t20/10\\n\" +\n" +
                "        \" USD/CHF\\t0.9843\\t0.9853\\t0.9757\\t+0.81%\\t20/10\\n\" +\n" +
                "        \" USD/CAD\\t1.2628\\t1.2630\\t1.2477\\t+1.15%\\t20/10\\n\" +\n" +
                "        \" AUD/USD\\t0.7819\\t0.7882\\t0.7809\\t-0.76%\\t20/10\\n\" +\n" +
                "        \" NZD/USD\\t0.6960\\t0.7037\\t0.6955\\t-0.97%\\t20/10\\n\" +\n" +
                "        \" USD/SGD\\t1.3625\\t1.3625\\t1.3562\\t+0.43%\\t20/10\\n\" +\n" +
                "        \" USD/HKD\\t7.8049\\t7.8049\\t7.8000\\t+0.05%\\t20/10\\n\" +\n" +
                "        \" USD/DKK\\t6.3162\\t6.3277\\t6.2773\\t+0.58%\\t20/10";
    }

//    public getMaterials
}
