package com.example.necro.msitfortut;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;


public class MyDBHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MSIT.db";


    public MyDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        Log.e("偵錯", "創建資料表");
        db.execSQL("CREATE  TABLE profession(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL)");
        db.execSQL("CREATE  TABLE course(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL, grade INTEGER)");
        db.execSQL("CREATE  TABLE license(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL, pass BOOLEAN)");
        db.execSQL("CREATE  TABLE pac(_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,profession TEXT,course TEXT, FOREIGN KEY(profession) REFERENCES profession(name), FOREIGN KEY(course) REFERENCES course(name))");
        db.execSQL("CREATE  TABLE pal(_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, profession TEXT,license TEXT,FOREIGN KEY (profession) REFERENCES profession(name), FOREIGN KEY (license) REFERENCES license(name))");

        String[] p = new String[]{"軟體設計工程師","Internet程式設計師","電腦系統分析師","資訊助理人員","資料庫管理人員","MIS程式設計師","網路管理工程師","系統維護/操作人員","網路安全分析師","資訊設備管制人員","行政人員","文件管理師","教育訓練人員","人力資源人員","行銷企劃人員","網站行銷企劃","市場分析人員","ERP專案師","軟體相關專案管理師","電子商務行銷主管","電子商務技術主管","MIS／網管人員","MIS工程師","遊戲企劃人員","多媒體動畫設計師","網頁設計師","電腦繪圖人員","電玩程式設計師","排版人員","網頁程式設計師"};
        String[] c = new String[]{"程式設計（一）","資訊管理導論","本國語文（一）","體育（一）","全民國防教育軍事訓練—全民國防（一）","大一英文（一）","計算機概論","資訊概論","程式設計（二）","本國語文（二）","電腦與資訊應用","體育（二）","全民國防教育軍事訓練—全民國防（二）","大一英文（二）","大二英文","電子商務","資料結構","視覺語言","公民社會與文化","體育興趣選項（一）","多元服務學習（一）","資料庫系統與管理","物件導向程式設計","職場倫理","體育興趣選項（二）","多元服務學習（二）","計算機網路","系統分析與設計","RFID概論","行動裝置開發與應用","作業系統","資訊管理專案研究","行動網際網路","資訊安全","雲端技術概論","資訊管理專案設計","論文寫作技巧","網路管理","APP實務專題","職場實習","專案管理","系統管理","會計學","企業管理","經濟學","會計資訊系統","統計學","行銷管理","生產與作業管理","統計應用軟體","企業資源規劃","系統分析與設計","企業資源規劃實務","企劃書製作與簡報","品質管理","資料探勘","供應鏈管理","RFID與電子商務應用","企業電子化應用","資訊管理個案","文化創意導論","資訊管理導論","視覺語言","行銷管理","數位內容概論與應用","媒體動畫製作","W3C技術導論","多媒體實務應用","數位教材製作","RFID應用","進階網頁程式設計","互動媒體開發應用","數位內容產業實務"};
        String[] l = new String[]{"TQC-OA 中文輸入 實用級","QC-OA 英文輸入 實用級","TQC-PD Java 程式設計(JDK 1.4) 實用級","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-DA Access(2003) 進階級","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC-OA Word(2003) 專業級","TQC-OA PowerPoint(2003) 進階級","TQC 專業網頁設計工程師","TQC-OA Excel(2003) 實用級","TQC-DA Access(2003) 實用級","TQC-WD HTML(4.01) 實用級","TQC-WD HTML(4.01) 進階級","TQC-DA MySQL(5) 專業級","TQC-PD Visual Baisic 程式設計(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 專業級","TQC-PD Java 程式設計(JDK 1.4) 進階級","TQC-PD Java 程式設計(JDK 1.4) 專業級","TQC 專業網站資料庫管理工程師","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","TQC 專業網站程式工程師","(ITE)資訊專業人員鑑定 - 系統分析&物件導向","(ITE)資訊專業人員鑑定 - 軟體設計","(ITE)資訊專業人員鑑定 - 嵌入式系統軟體開發","(ITE)資訊專業人員鑑定 - 資料庫設計","(MVP)Microsoft Most Valuable Professional: SQL 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: XML 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual Basic 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual C# 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual C++ 微軟最有價值專家","(ABID)程式設計入門助教","(ABID)程式設計入門講師","TQC-OA 網際網路及行動通訊 專業級","TQC-OA 網際網路及行動通訊 實用級","TQC-OA 網際網路及行動通訊 進階級","TQC-MD ITE資訊人員 實用級","TQC-MD ITE資訊人員 進階級","中華民國技術士 - 電腦軟體應用 乙級","中華民國技術士 - 會計事務 丙級","中華民國技術士 - 電腦軟體應用 丙級","TQC-OA 電腦會計 專業級","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","TQC-OS Linux 系統管理 專業級","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","(ITE)資訊專業人員鑑定 - 資訊安全管理","TQC-EEC 企業電子化助理規劃師","TQC-EEC 企業電子化規劃師 一級","TQC-EEC 企業電子化規劃師 二級","(CERPS)初階ERP規劃師~Elementary ERP Planner","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)","TQC 專業網頁設計工程師","TQC-MD Flash(8)實用級","中華民國技術士–網頁設計 乙級","中華民國技術士–網路架設 乙級","TQC-WD Dreamweaver(8) 專業級","TQC-IP Photoshop(CS3)專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","(ITE)資訊專業人員鑑定–數位教學設計","(ITE)資訊專案人員鑑定–(數位內容)遊戲企劃","(ITE)資訊專案人員鑑定–(數位內容)遊戲美術","TQC-IP PhotoImpact X3 實用級"};
        String[][] pc = new String[][]{{"軟體設計工程師","程式設計（一）","資訊管理導論","計算機概論","資訊概論","程式設計（二）","電腦與資訊應用","電子商務","視覺語言","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","作業系統","資訊管理專案研究","行動網際網路","資訊安全","雲端技術概論","資訊管理專案設計","網路管理","系統管理"},{"Internet程式設計師","程式設計（一）","資訊管理導論","計算機概論","資訊概論","程式設計（二）","電腦與資訊應用","電子商務","資料結構","視覺語言","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","作業系統","資訊管理專案研究","行動網際網路","資訊安全","雲端技術概論","資訊管理專案設計","網路管理","系統管理"},{"電腦系統分析師","程式設計（一）","程式設計（二）","電腦與資訊應用","資料結構","視覺語言","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","作業系統","資訊安全","雲端技術概論","資訊管理專案設計","論文寫作技巧","網路管理","系統管理"},{"資訊助理人員","程式設計（一）","程式設計（二）","資料庫系統與管理","系統分析與設計","行動裝置開發與應用","資訊管理專案設計","論文寫作技巧"},{"資料庫管理人員","資料庫系統與管理","系統分析與設計","行動裝置開發與應用","雲端技術概論","資訊管理專案設計","論文寫作技巧"},{"MIS程式設計師","程式設計（一）","程式設計（二）","電腦與資訊應用","資料結構","視覺語言","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","雲端技術概論","資訊管理專案設計","論文寫作技巧","網路管理","系統管理"},{"網路管理工程師","程式設計（一）","計算機概論","資訊概論","電腦與資訊應用","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","作業系統","行動網際網路","資訊安全","雲端技術概論","網路管理","系統管理"},{"系統維護/操作人員","程式設計（一）","計算機概論","資訊概論","程式設計（二）","電腦與資訊應用","資料庫系統與管理","物件導向程式設計","計算機網路","系統分析與設計","行動裝置開發與應用","作業系統","資訊安全","雲端技術概論","資訊管理專案設計","論文寫作技巧","網路管理","系統管理"},{"網路安全分析師","程式設計（一）","計算機概論","資訊概論","程式設計（二）","電腦與資訊應用","計算機網路","行動裝置開發與應用","作業系統","行動網際網路","資訊安全","雲端技術概論","資訊管理專案設計","網路管理","系統管理"},{"資訊設備管制人員","程式設計（一）","資訊管理導論","計算機概論","資訊概論","程式設計（二）","電腦與資訊應用","電子商務","資料庫系統與管理","計算機網路","行動裝置開發與應用","作業系統","資訊管理專案研究","資訊安全","雲端技術概論","資訊管理專案設計","論文寫作技巧","網路管理","系統管理"},{"行政人員","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","電子商務","生產與作業管理","企業資源規劃","網路行銷","計算機網路","系統分析與設計","網頁設計實務","企業資源規劃實務","企劃書製作與簡報","資訊管理專案研究","行動網際網路","品質管理","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"文件管理師","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","行銷管理","資料庫系統與管理","電子商務","生產與作業管理","企業資源規劃","網路行銷","計算機網路","系統分析與設計","網頁設計實務","企業資源規劃實務","企劃書製作與簡報","資訊管理專案研究","行動網際網路","品質管理","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"教育訓練人員","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","電子商務","生產與作業管理","企業資源規劃","網路行銷","系統分析與設計","企劃書製作與簡報","資訊管理專案研究","品質管理","資訊管理專案設計","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"人力資源人員","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","生產與作業管理","系統分析與設計","企劃書製作與簡報","資訊管理專案研究","品質管理","資訊管理專案設計","RFID與電子商務應用","專案管理","資訊管理個案"},{"行銷企劃人員","資訊管理導論","行銷管理","資料庫系統與管理","電子商務","企業資源規劃","網路行銷","計算機網路","網頁設計實務","企業資源規劃實務","企劃書製作與簡報","資訊管理專案研究","行動網際網路","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用"},{"網站行銷企劃","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","行銷管理","資料庫系統與管理","電子商務","生產與作業管理","企業資源規劃","網路行銷","計算機網路","系統分析與設計","網頁設計實務","企業資源規劃實務","企劃書製作與簡報","資訊管理專案研究","行動網際網路","品質管理","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"市場分析人員","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","生產與作業管理","系統分析與設計","企劃書製作與簡報","資訊管理專案研究","資訊管理專案設計","專案管理","企業電子化應用","資訊管理個案"},{"ERP專案師","電腦與資訊應用","資訊管理導論","企業資源規劃","計算機網路","企業資源規劃實務","資訊管理專案研究","資訊管理專案設計","供應鏈管理","專案管理","企業電子化應用"},{"軟體相關專案管理師","計算機概論","企業管理","電腦與資訊應用","資訊管理導論","生產與作業管理","企業資源規劃","計算機網路","系統分析與設計","企畫書製作與簡報","資訊管理專案研究","品質管理","資訊管理專案設計","供應鏈管理","專案管理","企業電子化應用","資訊管理個案"},{"電子商務行銷主管","計算機概論","電腦與資訊應用","資訊管理導論","行銷管理","資料庫系統與管理","電子商務","企業資源規劃","網路行銷","計算機網路","系統分析與設計","網頁設計實務","企業資源規劃實務","企畫書製作與簡報","資訊管理專案研究","行動網際網路","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"電子商務技術主管","計算機概論","電腦與資訊應用","資訊管理導論","行銷管理","資料庫系統與管理","電子商務","企業資源規劃","網路行銷","計算機網路","系統分析與設計","網頁設計實務","企業資源規劃實務","企畫書製作與簡報","資訊管理專案研究","行動網際網路","資料探勘","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"MIS／網管人員","計算機概論","電腦與資訊應用","資訊管理導論","資料結構","資料庫系統與管理","企業資源規劃","計算機網路","資訊管理專案研究","供應鏈管理","專案管理","企業電子化應用","資訊管理個案","計算機概論","電腦與資訊應用","資訊管理導論","資料結構","資料庫系統與管理","電子商務","企業資源規劃","網路行銷","計算機網路","系統分析與設計","資訊管理專案研究","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"MIS工程師","計算機概論","電腦與資訊應用","資訊管理導論","統計學","資料結構","資料庫系統與管理","電子商務企業資源規劃","網路行銷","計算機網路","系統分析與設計","資訊管理專案研究","資訊管理專案設計","供應鏈管理","RFID與電子商務應用","專案管理","企業電子化應用","資訊管理個案"},{"遊戲企劃人員","文化創意導論","行銷管理","數位內容概論與應用","媒體動畫製作","電子商務","網頁設計實務","數位教材製作","資訊管理專案研究","進階網頁程式設計","資訊管理專案設計","專案管理","數位內容產業實務"},{"多媒體動畫設計師","文化創意導論","計算機概論","電腦與資訊應用","資訊管理導論","行銷管理","數位內容概論與應用","媒體動畫製作","資料庫系統與管理","電子商務","多媒體實務應用","計算機網路","系統分析與設計","網頁設計實務","數位教材製作","資訊管理專案研究","行動網際網路","RFID應用","進階網頁程式設計","資訊管理專案設計","互動媒體開發應用","專案管理","數位內容產業實務"},{"網頁設計師","文化創意導論","計算機概論","電腦與資訊應用","資訊管理導論","行銷管理","數位內容概論與應用","媒體動畫製作","資料庫系統與管理","電子商務","多媒體實務應用","計算機網路","系統分析與設計","網頁設計實務","數位教材製作","資訊管理專案研究","行動網際網路","RFID應用","進階網頁程式設計","資訊管理專案設計","互動媒體開發應用","專案管理","數位內容產業實務"},{"電腦繪圖人員","文化創意導論","計算機概論","電腦與資訊應用","行銷管理","數位內容概論與應用","媒體動畫製作","資料庫系統與管理","電子商務","多媒體實務應用","系統分析與設計","網頁設計實務","數位教材製作","資訊管理專案研究","進階網頁程式設計","資訊管理專案設計","互動媒體開發應用","專案管理","數位內容產業實務"},{"電玩程式設計師","文化創意導論","行銷管理","數位內容概論與應用","媒體動畫製作","電子商務","網頁設計實務","數位教材製作","資訊管理專案研究","進階網頁程式設計","資訊管理專案設計","專案管理","數位內容產業實務"},{"排版人員","文化創意導論","數位內容概論與應用","媒體動畫製作","網頁設計實務","數位教材製作","資訊管理專案研究","進階網頁程式設計","資訊管理專案設計","數位內容產業實務"},{"網頁程式設計師","文化創意導論","計算機概論","電腦與資訊應用","資訊管理導論","媒體動畫製作","資料庫系統與管理","電子商務","多媒體實務應用","計算機網路","系統分析與設計","網頁設計實務","數位教材製作","資訊管理專案研究","行動網際網路","RFID應用","進階網頁程式設計","資訊管理專案設計","互動媒體開發應用"}};
        String[][] pl = new String[][]{{"軟體設計工程師","TQC-PD Java 程式設計(JDK 1.4) 實用級","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC 專業網頁設計工程師","TQC-PD Visual Baisic 軟體開發(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 專業級","TQC-PD Java 程式設計(JDK 1.4) 進階級","TQC-PD Java 程式設計(JDK 1.4) 專業級","TQC 專業網站資料庫管理工程師","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","TQC 專業網站程式工程師","(ITE)資訊專業人員鑑定 - 軟體設計","(ITE)資訊專業人員鑑定 - 嵌入式系統軟體開發","(ABID)程式設計入門助教","(ABID)程式設計入門講師","TQC-OA 網際網路及行動通訊 專業級","TQC-OA 網際網路及行動通訊 實用級","TQC-OA 網際網路及行動通訊 進階級","TQC-MD ITE資訊人員 實用級","TQC-MD ITE資訊人員 進階級"},{"Internet程式設計師","TQC-PD Java 程式設計(JDK 1.4) 實用級","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業網頁設計工程師","TQC-PD Visual Baisic 程式設計(6.0) 進階級","TQC-PD Java 程式設計(JDK 1.4) 進階級","TQC-PD Java 程式設計(JDK 1.4) 專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","TQC 專業網站程式工程師","(ABID)程式設計入門助教","(ABID)程式設計入門講師","TQC-MD ITE資訊人員 實用級","TQC-MD ITE資訊人員 進階級"},{"電腦系統分析師","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC-PD Visual Baisic 程式設計(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 專業級","TQC-PD Java 程式設計(JDK 1.4) 進階級","TQC-PD Java 程式設計(JDK 1.4) 專業級","(ITE)資訊專業人員鑑定 - 系統分析&物件導向","(ITE)資訊專業人員鑑定 - 資料庫設計"},{"資訊助理人員","TQC-OA PowerPoint(2003) 進階級","TQC-DA Access(2003) 實用級","(ABID)程式設計入門助教"},{"資料庫管理人員","TQC-DA Access(2003) 進階級","TQC-DA Access(2003) 實用級","TQC 專業網站資料庫管理工程師","(ITE)資訊專業人員鑑定 - 資料庫設計"},{"MIS程式設計師","TQC 專業網頁設計工程師","TQC-PD Visual Baisic 程式設計(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 進階級","TQC-PD Visual Baisic 軟體開發(6.0) 專業級","TQC-PD Java 程式設計(JDK 1.4) 進階級","TQC-PD Java 程式設計(JDK 1.4) 專業級","TQC 專業網站程式工程師","(MVP)Microsoft Most Valuable Professional: SQL 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: XML 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual Basic 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual C# 微軟最有價值專家","(MVP)Microsoft Most Valuable Professional: Visual C++ 微軟最有價值專家","(ABID)程式設計入門助教","(ABID)程式設計入門講師"},{"網路管理工程師","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 網路管理工程師","TQC 專業網站資料庫管理工程師","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","TQC 專業網站程式工程師","TQC-OA 網際網路及行動通訊 專業級","TQC-OA 網際網路及行動通訊 實用級","TQC-OA 網際網路及行動通訊 進階級"},{"系統維護/操作人員","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC 專業網站程式工程師","(ITE)資訊專業人員鑑定 - 系統分析&物件導向","(ABID)程式設計入門助教"},{"網路安全分析師","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC-OA 網際網路及行動通訊 專業級","TQC-OA 網際網路及行動通訊 實用級","TQC-OA 網際網路及行動通訊 進階級"},{"資訊設備管制人員","TQC-OS Linux 網路管理 專業級","TQC 專業 Linux 系統管理工程師","TQC-OS Linux 系統管理 專業級","TQC 專業 Linux 網路管理工程師","TQC-MD ITE資訊人員 實用級","TQC-MD ITE資訊人員 進階級"},{"行政人員","中華民國技術士 - 電腦軟體應用 乙級","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","(ITE)資訊專業人員鑑定 - 資訊安全管理","(CERPS)初階ERP規劃師~Elementary ERP Planner","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"文件管理師","中華民國技術士 - 電腦軟體應用 乙級","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","(ITE)資訊專業人員鑑定 - 資訊安全管理","(CERPS)初階ERP規劃師~Elementary ERP Planner","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"教育訓練人員","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 系統分析&電子商務"},{"人力資源人員","(ITE)資訊專業人員鑑定 - 專案管理"},{"行銷企劃人員","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"網站行銷企劃","中華民國技術士 - 電腦軟體應用 乙級","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","(ITE)資訊專業人員鑑定 - 資訊安全管理","(CERPS)初階ERP規劃師~Elementary ERP Planner","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"市場分析人員","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 專案管理"},{"ERP專案師","TQC-EEC 企業電子化助理規劃師","(CERPS)初階ERP規劃師~Elementary ERP Planner"},{"軟體相關專案管理師","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 專案管理","(ITE)資訊專業人員鑑定 - 資訊安全管理","TQC-EEC 企業電子化助理規劃師"},{"電子商務行銷主管","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"電子商務技術主管","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","微析科技股份有限公司-EBA電子商務分析師(e-Business Analyst)","微析科技股份有限公司-EBP電子商務規劃師(e-Business Planner)"},{"MIS／網管人員","TQC 專業 Linux 系統管理工程師","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","TQC-OS Linux 系統管理 專業級","TQC-EEC 企業電子化助理規劃師","TQC-EEC 企業電子化規劃師 一級","TQC-EEC 企業電子化規劃師 二級","TQC 專業 Linux 系統管理工程師","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","TQC-OS Linux 系統管理 專業級","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","TQC-EEC 企業電子化助理規劃師","TQC-EEC 企業電子化規劃師 一級","TQC-EEC 企業電子化規劃師 二級"},{"MIS工程師","TQC 專業 Linux 系統管理工程師","(ITE)資訊專業人員鑑定 - 資訊管理(應用)","TQC-OS Linux 系統管理 專業級","(ITE)資訊專業人員鑑定 - 系統分析&電子商務","TQC-EEC 企業電子化助理規劃師","TQC-EEC 企業電子化規劃師 一級","TQC-EEC 企業電子化規劃師 二級"},{"遊戲企劃人員","(ITE)資訊專案人員鑑定–(數位內容)遊戲企劃","(ITE)資訊專案人員鑑定–(數位內容)遊戲美術"},{"多媒體動畫設計師","TQC 專業網頁設計工程師","TQC-MD Flash(8)實用級","中華民國技術士–網頁設計 乙級","中華民國技術士–網路架設 乙級","TQC-WD Dreamweaver(8) 專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","(ITE)資訊專業人員鑑定–數位教學設計","(ITE)資訊專案人員鑑定–(數位內容)遊戲企劃","(ITE)資訊專案人員鑑定–(數位內容)遊戲美術","TQC-IP PhotoImpact X3 實用級"},{"網頁設計師","TQC 專業網頁設計工程師","TQC-MD Flash(8)實用級","中華民國技術士–網頁設計 乙級","中華民國技術士–網路架設 乙級","TQC-WD Dreamweaver(8) 專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","(ITE)資訊專業人員鑑定–數位教學設計","(ITE)資訊專案人員鑑定–(數位內容)遊戲企劃","(ITE)資訊專案人員鑑定–(數位內容)遊戲美術","TQC-IP PhotoImpact X3 實用級"},{"電腦繪圖人員","中華民國技術士–網頁設計 乙級","TQC-WD Dreamweaver(8) 專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","(ITE)資訊專業人員鑑定–數位教學設計","TQC-IP PhotoImpact X3 實用級"},{"排版人員","(ITE)資訊專業人員鑑定–數位教學設計"},{"網頁程式設計師","TQC 專業網頁設計工程師","TQC-MD Flash(8)實用級","中華民國技術士–網頁設計 乙級","中華民國技術士–網路架設 乙級","TQC-WD Dreamweaver(8) 專業級","TQC 專業多媒體網頁設計工程師","TQC 專業互動式網頁設計工程師","TQC-IP PhotoImpact X3 實用級"}};
        int i,j;
        for(i=p.length-1;i>=0;i--) {
            pInsert(db, p[i]);
        }
        for(i=c.length-1;i>=0;i--) {
            cInsert(db, c[i]);
        }
        for(i=l.length-1;i>=0;i--) {
            lInsert(db, l[i]);
        }
        for(i=pc.length-1;i>=0;i--) {
            for(j=pc[i].length-1;j>0;j--) {
                pcInsert(db, pc[i][0], pc[i][j]);
            }
        }
        for(i=pl.length-1;i>=0;i--) {
            for(j=pl[i].length-1;j>0;j--) {
                plInsert(db, pl[i][0], pl[i][j]);
            }
        }


    }
    public void pInsert(SQLiteDatabase db,String name) {
        ContentValues value = new ContentValues();
        value.put("name", name);
        db.insert("profession", null, value);
    }

    public void cInsert(SQLiteDatabase db,String name) {
        ContentValues value = new ContentValues();
        value.put("name", name);
        db.insert("course", null, value);
    }

    public void lInsert(SQLiteDatabase db,String name) {
        ContentValues value = new ContentValues();
        value.put("name", name);
        db.insert("license", null, value);
    }

    public void pcInsert(SQLiteDatabase db,String profession, String course) {
        ContentValues value = new ContentValues();
        value.put("profession", profession);
        value.put("course", course);
        db.insert("pac", null, value);
    }

    public void plInsert(SQLiteDatabase db,String profession, String license) {
        ContentValues value = new ContentValues();
        value.put("profession", profession);
        value.put("license", license);
        db.insert("pal", null, value);
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL("DROP TABLE IF EXISTS profession");
        db.execSQL("DROP TABLE IF EXISTS course");
        db.execSQL("DROP TABLE IF EXISTS license");
        db.execSQL("DROP TABLE IF EXISTS pac");
        db.execSQL("DROP TABLE IF EXISTS pal");
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}