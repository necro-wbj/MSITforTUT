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

        pInsert(db,"軟體設計工程師");
        pInsert(db,"Internet程式設計師");
        pInsert(db,"電腦系統分析師");
        pInsert(db,"資訊助理人員");
        pInsert(db,"資料庫管理人員");
        pInsert(db,"MIS程式設計師");
        pInsert(db,"網路管理工程師");
        pInsert(db,"系統維護/操作人員");
        pInsert(db,"網路安全分析師");
        pInsert(db,"資訊設備管制人員");
        cInsert(db,"程式設計（一）");
        cInsert(db,"資訊管理導論");
        cInsert(db,"本國語文（一）");
        cInsert(db,"體育（一）");
        cInsert(db,"全民國防教育軍事訓練—全民國防（一）");
        cInsert(db,"大一英文（一）");
        cInsert(db,"計算機概論");
        cInsert(db,"資訊概論");
        cInsert(db,"程式設計（二）");
        cInsert(db,"本國語文（二）");
        cInsert(db,"電腦與資訊應用");
        cInsert(db,"體育（二）");
        cInsert(db,"全民國防教育軍事訓練—全民國防（二）");
        cInsert(db,"大一英文（二）");
        cInsert(db,"大二英文");
        cInsert(db,"電子商務");
        cInsert(db,"資料結構");
        cInsert(db,"視覺語言");
        cInsert(db,"公民社會與文化");
        cInsert(db,"體育興趣選項（一）");
        cInsert(db,"多元服務學習（一）");
        cInsert(db,"資料庫系統與管理");
        cInsert(db,"物件導向程式設計");
        cInsert(db,"職場倫理");
        cInsert(db,"體育興趣選項（二）");
        cInsert(db,"多元服務學習（二）");
        cInsert(db,"計算機網路");
        cInsert(db,"系統分析與設計");
        cInsert(db,"RFID概論");
        cInsert(db,"行動裝置開發與應用");
        cInsert(db,"作業系統");
        cInsert(db,"資訊管理專案研究");
        cInsert(db,"行動網際網路");
        cInsert(db,"資訊安全");
        cInsert(db,"雲端技術概論");
        cInsert(db,"資訊管理專案設計");
        cInsert(db,"論文寫作技巧");
        cInsert(db,"網路管理");
        cInsert(db,"APP實務專題");
        cInsert(db,"職場實習");
        cInsert(db,"專案管理");
        cInsert(db,"系統管理");
        lInsert(db,"TQC-OA 中文輸入 實用級");
        lInsert(db,"QC-OA 英文輸入 實用級");
        lInsert(db,"TQC-PD Java 程式設計(JDK 1.4) 實用級");
        lInsert(db,"TQC-OS Linux 網路管理 專業級");
        lInsert(db,"TQC 專業 Linux 系統管理工程師");
        lInsert(db,"TQC-DA Access(2003) 進階級");
        lInsert(db,"TQC-OS Linux 系統管理 專業級");
        lInsert(db,"TQC 專業 Linux 網路管理工程師");
        lInsert(db,"TQC-OA Word(2003) 專業級");
        lInsert(db,"TQC-OA PowerPoint(2003) 進階級");
        lInsert(db,"TQC 專業網頁設計工程師 ");
        lInsert(db,"TQC-OA Excel(2003) 實用級");
        lInsert(db,"TQC-DA Access(2003) 實用級");
        lInsert(db,"TQC-WD HTML(4.01) 實用級");
        lInsert(db,"TQC-WD HTML(4.01) 進階級");
        lInsert(db,"TQC-DA MySQL(5) 專業級");
        lInsert(db,"TQC-PD Visual Baisic 程式設計(6.0) 進階級");
        lInsert(db,"TQC-PD Visual Baisic 軟體開發(6.0) 進階級");
        lInsert(db,"TQC-PD Visual Baisic 軟體開發(6.0) 專業級");
        lInsert(db,"TQC-PD Java 程式設計(JDK 1.4) 進階級");
        lInsert(db,"TQC-PD Java 程式設計(JDK 1.4) 專業級");
        lInsert(db,"TQC 專業網站資料庫管理工程師");
        lInsert(db,"TQC 專業多媒體網頁設計工程師");
        lInsert(db,"TQC 專業互動式網頁設計工程師");
        lInsert(db,"TQC 專業網站程式工程師");
        lInsert(db,"(ITE)資訊專業人員鑑定 - 系統分析&物件導向");
        lInsert(db,"(ITE)資訊專業人員鑑定 - 軟體設計");
        lInsert(db,"(ITE)資訊專業人員鑑定 - 嵌入式系統軟體開發");
        lInsert(db,"(ITE)資訊專業人員鑑定 - 資料庫設計 ");
        lInsert(db,"(MVP)Microsoft Most Valuable Professional: SQL 微軟最有價值專家");
        lInsert(db,"(MVP)Microsoft Most Valuable Professional: XML 微軟最有價值專家");
        lInsert(db,"(MVP)Microsoft Most Valuable Professional: Visual Basic 微軟最有價值專家");
        lInsert(db,"(MVP)Microsoft Most Valuable Professional: Visual C# 微軟最有價值專家");
        lInsert(db,"(MVP)Microsoft Most Valuable Professional: Visual C++ 微軟最有價值專家");
        lInsert(db,"(ABID)程式設計入門助教");
        lInsert(db,"(ABID)程式設計入門講師");
        lInsert(db,"TQC-OA 網際網路及行動通訊 專業級");
        lInsert(db,"TQC-OA 網際網路及行動通訊 實用級");
        lInsert(db,"TQC-OA 網際網路及行動通訊 進階級");
        lInsert(db,"TQC-MD ITE資訊人員 實用級");
        lInsert(db,"TQC-MD ITE資訊人員 進階級");
        pcInsert(db,"軟體設計工程師","程式設計（一）");
        pcInsert(db,"軟體設計工程師","資訊管理導論");
        pcInsert(db,"軟體設計工程師","計算機概論");
        pcInsert(db,"軟體設計工程師","資訊概論");
        pcInsert(db,"軟體設計工程師","程式設計（二）");
        pcInsert(db,"軟體設計工程師","電腦與資訊應用");
        pcInsert(db,"軟體設計工程師","電子商務");
        pcInsert(db,"軟體設計工程師","視覺語言");
        pcInsert(db,"軟體設計工程師","資料庫系統與管理");
        pcInsert(db,"軟體設計工程師","物件導向程式設計");
        pcInsert(db,"軟體設計工程師","計算機網路");
        pcInsert(db,"軟體設計工程師","系統分析與設計");
        pcInsert(db,"軟體設計工程師","行動裝置開發與應用");
        pcInsert(db,"軟體設計工程師","作業系統");
        pcInsert(db,"軟體設計工程師","資訊管理專案研究");
        pcInsert(db,"軟體設計工程師","行動網際網路");
        pcInsert(db,"軟體設計工程師","資訊安全");
        pcInsert(db,"軟體設計工程師","雲端技術概論");
        pcInsert(db,"軟體設計工程師","資訊管理專案設計");
        pcInsert(db,"軟體設計工程師","網路管理");
        pcInsert(db,"軟體設計工程師","系統管理");
        pcInsert(db,"Internet程式設計師","程式設計（一）");
        pcInsert(db,"Internet程式設計師","資訊管理導論");
        pcInsert(db,"Internet程式設計師","計算機概論");
        pcInsert(db,"Internet程式設計師","資訊概論");
        pcInsert(db,"Internet程式設計師","程式設計（二）");
        pcInsert(db,"Internet程式設計師","電腦與資訊應用");
        pcInsert(db,"Internet程式設計師","電子商務");
        pcInsert(db,"Internet程式設計師","資料結構");
        pcInsert(db,"Internet程式設計師","視覺語言");
        pcInsert(db,"Internet程式設計師","資料庫系統與管理");
        pcInsert(db,"Internet程式設計師","物件導向程式設計");
        pcInsert(db,"Internet程式設計師","計算機網路");
        pcInsert(db,"Internet程式設計師","系統分析與設計");
        pcInsert(db,"Internet程式設計師","行動裝置開發與應用");
        pcInsert(db,"Internet程式設計師","作業系統");
        pcInsert(db,"Internet程式設計師","資訊管理專案研究");
        pcInsert(db,"Internet程式設計師","行動網際網路");
        pcInsert(db,"Internet程式設計師","資訊安全");
        pcInsert(db,"Internet程式設計師","雲端技術概論");
        pcInsert(db,"Internet程式設計師","資訊管理專案設計");
        pcInsert(db,"Internet程式設計師","網路管理");
        pcInsert(db,"Internet程式設計師","系統管理");
        pcInsert(db,"電腦系統分析師","程式設計（一）");
        pcInsert(db,"電腦系統分析師","程式設計（二）");
        pcInsert(db,"電腦系統分析師","電腦與資訊應用");
        pcInsert(db,"電腦系統分析師","資料結構");
        pcInsert(db,"電腦系統分析師","視覺語言");
        pcInsert(db,"電腦系統分析師","資料庫系統與管理");
        pcInsert(db,"電腦系統分析師","物件導向程式設計");
        pcInsert(db,"電腦系統分析師","計算機網路");
        pcInsert(db,"電腦系統分析師","系統分析與設計");
        pcInsert(db,"電腦系統分析師","行動裝置開發與應用");
        pcInsert(db,"電腦系統分析師","作業系統");
        pcInsert(db,"電腦系統分析師","資訊安全");
        pcInsert(db,"電腦系統分析師","雲端技術概論");
        pcInsert(db,"電腦系統分析師","資訊管理專案設計");
        pcInsert(db,"電腦系統分析師","論文寫作技巧");
        pcInsert(db,"電腦系統分析師","網路管理");
        pcInsert(db,"電腦系統分析師","系統管理");
        pcInsert(db,"資訊助理人員","程式設計（一）");
        pcInsert(db,"資訊助理人員","程式設計（二）");
        pcInsert(db,"資訊助理人員","資料庫系統與管理");
        pcInsert(db,"資訊助理人員","系統分析與設計");
        pcInsert(db,"資訊助理人員","行動裝置開發與應用");
        pcInsert(db,"資訊助理人員","資訊管理專案設計");
        pcInsert(db,"資訊助理人員","論文寫作技巧");
        pcInsert(db,"資料庫管理人員","資料庫系統與管理");
        pcInsert(db,"資料庫管理人員","系統分析與設計");
        pcInsert(db,"資料庫管理人員","行動裝置開發與應用");
        pcInsert(db,"資料庫管理人員","雲端技術概論");
        pcInsert(db,"資料庫管理人員","資訊管理專案設計");
        pcInsert(db,"資料庫管理人員","論文寫作技巧");
        pcInsert(db,"MIS程式設計師","程式設計（一）");
        pcInsert(db,"MIS程式設計師","程式設計（二）");
        pcInsert(db,"MIS程式設計師","電腦與資訊應用");
        pcInsert(db,"MIS程式設計師","資料結構");
        pcInsert(db,"MIS程式設計師","視覺語言");
        pcInsert(db,"MIS程式設計師","資料庫系統與管理");
        pcInsert(db,"MIS程式設計師","物件導向程式設計");
        pcInsert(db,"MIS程式設計師","計算機網路");
        pcInsert(db,"MIS程式設計師","系統分析與設計");
        pcInsert(db,"MIS程式設計師","行動裝置開發與應用");
        pcInsert(db,"MIS程式設計師","雲端技術概論");
        pcInsert(db,"MIS程式設計師","資訊管理專案設計");
        pcInsert(db,"MIS程式設計師","論文寫作技巧");
        pcInsert(db,"MIS程式設計師","網路管理");
        pcInsert(db,"MIS程式設計師","系統管理");
        pcInsert(db,"網路管理工程師","程式設計（一）");
        pcInsert(db,"網路管理工程師","計算機概論");
        pcInsert(db,"網路管理工程師","資訊概論");
        pcInsert(db,"網路管理工程師","電腦與資訊應用");
        pcInsert(db,"網路管理工程師","資料庫系統與管理");
        pcInsert(db,"網路管理工程師","物件導向程式設計");
        pcInsert(db,"網路管理工程師","計算機網路");
        pcInsert(db,"網路管理工程師","系統分析與設計");
        pcInsert(db,"網路管理工程師","行動裝置開發與應用");
        pcInsert(db,"網路管理工程師","作業系統");
        pcInsert(db,"網路管理工程師","行動網際網路");
        pcInsert(db,"網路管理工程師","資訊安全");
        pcInsert(db,"網路管理工程師","雲端技術概論");
        pcInsert(db,"網路管理工程師","網路管理");
        pcInsert(db,"網路管理工程師","系統管理");
        pcInsert(db,"系統維護/操作人員","程式設計（一）");
        pcInsert(db,"系統維護/操作人員","計算機概論");
        pcInsert(db,"系統維護/操作人員","資訊概論");
        pcInsert(db,"系統維護/操作人員","程式設計（二）");
        pcInsert(db,"系統維護/操作人員","電腦與資訊應用");
        pcInsert(db,"系統維護/操作人員","資料庫系統與管理");
        pcInsert(db,"系統維護/操作人員","物件導向程式設計");
        pcInsert(db,"系統維護/操作人員","計算機網路");
        pcInsert(db,"系統維護/操作人員","系統分析與設計");
        pcInsert(db,"系統維護/操作人員","行動裝置開發與應用");
        pcInsert(db,"系統維護/操作人員","作業系統");
        pcInsert(db,"系統維護/操作人員","資訊安全");
        pcInsert(db,"系統維護/操作人員","雲端技術概論");
        pcInsert(db,"系統維護/操作人員","資訊管理專案設計");
        pcInsert(db,"系統維護/操作人員","論文寫作技巧");
        pcInsert(db,"系統維護/操作人員","網路管理");
        pcInsert(db,"系統維護/操作人員","系統管理");
        pcInsert(db,"網路安全分析師","程式設計（一）");
        pcInsert(db,"網路安全分析師","計算機概論");
        pcInsert(db,"網路安全分析師","資訊概論");
        pcInsert(db,"網路安全分析師","程式設計（二）");
        pcInsert(db,"網路安全分析師","電腦與資訊應用");
        pcInsert(db,"網路安全分析師","計算機網路");
        pcInsert(db,"網路安全分析師","行動裝置開發與應用");
        pcInsert(db,"網路安全分析師","作業系統");
        pcInsert(db,"網路安全分析師","行動網際網路");
        pcInsert(db,"網路安全分析師","資訊安全");
        pcInsert(db,"網路安全分析師","雲端技術概論");
        pcInsert(db,"網路安全分析師","資訊管理專案設計");
        pcInsert(db,"網路安全分析師","網路管理");
        pcInsert(db,"網路安全分析師","系統管理");
        pcInsert(db,"資訊設備管制人員","程式設計（一）");
        pcInsert(db,"資訊設備管制人員","資訊管理導論");
        pcInsert(db,"資訊設備管制人員","計算機概論");
        pcInsert(db,"資訊設備管制人員","資訊概論");
        pcInsert(db,"資訊設備管制人員","程式設計（二）");
        pcInsert(db,"資訊設備管制人員","電腦與資訊應用");
        pcInsert(db,"資訊設備管制人員","電子商務");
        pcInsert(db,"資訊設備管制人員","資料庫系統與管理");
        pcInsert(db,"資訊設備管制人員","計算機網路");
        pcInsert(db,"資訊設備管制人員","行動裝置開發與應用");
        pcInsert(db,"資訊設備管制人員","作業系統");
        pcInsert(db,"資訊設備管制人員","資訊管理專案研究");
        pcInsert(db,"資訊設備管制人員","資訊安全");
        pcInsert(db,"資訊設備管制人員","雲端技術概論");
        pcInsert(db,"資訊設備管制人員","資訊管理專案設計");
        pcInsert(db,"資訊設備管制人員","論文寫作技巧");
        pcInsert(db,"資訊設備管制人員","網路管理");
        pcInsert(db,"資訊設備管制人員","系統管理");
        plInsert(db,"軟體設計工程師","TQC-PD Java 程式設計(JDK 1.4) 實用級");
        plInsert(db,"軟體設計工程師","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"軟體設計工程師","TQC 專業 Linux 系統管理工程師 ");
        plInsert(db,"軟體設計工程師","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"軟體設計工程師","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"軟體設計工程師","TQC 專業網頁設計工程師");
        plInsert(db,"軟體設計工程師","TQC-PD Visual Baisic 軟體開發(6.0) 進階級");
        plInsert(db,"軟體設計工程師","TQC-PD Visual Baisic 軟體開發(6.0) 專業級");
        plInsert(db,"軟體設計工程師","TQC-PD Java 程式設計(JDK 1.4) 進階級");
        plInsert(db,"軟體設計工程師","TQC-PD Java 程式設計(JDK 1.4) 專業級");
        plInsert(db,"軟體設計工程師","TQC 專業網站資料庫管理工程師 ");
        plInsert(db,"軟體設計工程師","TQC 專業多媒體網頁設計工程師");
        plInsert(db,"軟體設計工程師","TQC 專業互動式網頁設計工程師");
        plInsert(db,"軟體設計工程師","TQC 專業網站程式工程師");
        plInsert(db,"軟體設計工程師","(ITE)資訊專業人員鑑定 - 軟體設計 ");
        plInsert(db,"軟體設計工程師","(ITE)資訊專業人員鑑定 - 嵌入式系統軟體開發 ");
        plInsert(db,"軟體設計工程師","(ABID)程式設計入門助教 ");
        plInsert(db,"軟體設計工程師","(ABID)程式設計入門講師 ");
        plInsert(db,"軟體設計工程師","TQC-OA 網際網路及行動通訊 專業級");
        plInsert(db,"軟體設計工程師","TQC-OA 網際網路及行動通訊 實用級");
        plInsert(db,"軟體設計工程師","TQC-OA 網際網路及行動通訊 進階級");
        plInsert(db,"軟體設計工程師","TQC-MD ITE資訊人員 實用級");
        plInsert(db,"軟體設計工程師","TQC-MD ITE資訊人員 進階級");
        plInsert(db,"Internet程式設計師","TQC-PD Java 程式設計(JDK 1.4) 實用級");
        plInsert(db,"Internet程式設計師","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"Internet程式設計師","TQC 專業 Linux 系統管理工程師 ");
        plInsert(db,"Internet程式設計師","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"Internet程式設計師","TQC 專業網頁設計工程師");
        plInsert(db,"Internet程式設計師","TQC-PD Visual Baisic 程式設計(6.0) 進階級");
        plInsert(db,"Internet程式設計師","TQC-PD Java 程式設計(JDK 1.4) 進階級");
        plInsert(db,"Internet程式設計師","TQC-PD Java 程式設計(JDK 1.4) 專業級");
        plInsert(db,"Internet程式設計師","TQC 專業多媒體網頁設計工程師");
        plInsert(db,"Internet程式設計師","TQC 專業互動式網頁設計工程師");
        plInsert(db,"Internet程式設計師","TQC 專業網站程式工程師");
        plInsert(db,"Internet程式設計師","(ABID)程式設計入門助教 ");
        plInsert(db,"Internet程式設計師","(ABID)程式設計入門講師 ");
        plInsert(db,"Internet程式設計師","TQC-MD ITE資訊人員 實用級");
        plInsert(db,"Internet程式設計師","TQC-MD ITE資訊人員 進階級");
        plInsert(db,"電腦系統分析師","TQC 專業 Linux 系統管理工程師 ");
        plInsert(db,"電腦系統分析師","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"電腦系統分析師","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"電腦系統分析師","TQC-PD Visual Baisic 程式設計(6.0) 進階級");
        plInsert(db,"電腦系統分析師","TQC-PD Visual Baisic 軟體開發(6.0) 進階級");
        plInsert(db,"電腦系統分析師","TQC-PD Visual Baisic 軟體開發(6.0) 專業級");
        plInsert(db,"電腦系統分析師","TQC-PD Java 程式設計(JDK 1.4) 進階級");
        plInsert(db,"電腦系統分析師","TQC-PD Java 程式設計(JDK 1.4) 專業級");
        plInsert(db,"電腦系統分析師","(ITE)資訊專業人員鑑定 - 系統分析&物件導向");
        plInsert(db,"電腦系統分析師","(ITE)資訊專業人員鑑定 - 資料庫設計");
        plInsert(db,"資訊助理人員","TQC-OA PowerPoint(2003) 進階級");
        plInsert(db,"資訊助理人員","TQC-DA Access(2003) 實用級");
        plInsert(db,"資訊助理人員","(ABID)程式設計入門助教");
        plInsert(db,"資料庫管理人員","TQC-DA Access(2003) 進階級");
        plInsert(db,"資料庫管理人員","TQC-DA Access(2003) 實用級");
        plInsert(db,"資料庫管理人員","TQC 專業網站資料庫管理工程師");
        plInsert(db,"資料庫管理人員","(ITE)資訊專業人員鑑定 - 資料庫設計");
        plInsert(db,"MIS程式設計師","TQC 專業網頁設計工程師");
        plInsert(db,"MIS程式設計師","TQC-PD Visual Baisic 程式設計(6.0) 進階級");
        plInsert(db,"MIS程式設計師","TQC-PD Visual Baisic 軟體開發(6.0) 進階級");
        plInsert(db,"MIS程式設計師","TQC-PD Visual Baisic 軟體開發(6.0) 專業級");
        plInsert(db,"MIS程式設計師","TQC-PD Java 程式設計(JDK 1.4) 進階級");
        plInsert(db,"MIS程式設計師","TQC-PD Java 程式設計(JDK 1.4) 專業級");
        plInsert(db,"MIS程式設計師","TQC 專業網站程式工程師");
        plInsert(db,"MIS程式設計師","(MVP)Microsoft Most Valuable Professional: SQL 微軟最有價值專家");
        plInsert(db,"MIS程式設計師","(MVP)Microsoft Most Valuable Professional: XML 微軟最有價值專家");
        plInsert(db,"MIS程式設計師","(MVP)Microsoft Most Valuable Professional: Visual Basic 微軟最有價值專家");
        plInsert(db,"MIS程式設計師","(MVP)Microsoft Most Valuable Professional: Visual C# 微軟最有價值專家");
        plInsert(db,"MIS程式設計師","(MVP)Microsoft Most Valuable Professional: Visual C++ 微軟最有價值專家");
        plInsert(db,"MIS程式設計師","(ABID)程式設計入門助教 ");
        plInsert(db,"MIS程式設計師","(ABID)程式設計入門講師");
        plInsert(db,"網路管理工程師","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"網路管理工程師","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"網路管理工程師","TQC 專業網站資料庫管理工程師");
        plInsert(db,"網路管理工程師","TQC 專業多媒體網頁設計工程師");
        plInsert(db,"網路管理工程師","TQC 專業互動式網頁設計工程師");
        plInsert(db,"網路管理工程師","TQC 專業網站程式工程師");
        plInsert(db,"網路管理工程師","TQC-OA 網際網路及行動通訊 專業級");
        plInsert(db,"網路管理工程師","TQC-OA 網際網路及行動通訊 實用級");
        plInsert(db,"網路管理工程師","TQC-OA 網際網路及行動通訊 進階級");
        plInsert(db,"系統維護/操作人員","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"系統維護/操作人員","TQC 專業 Linux 系統管理工程師");
        plInsert(db,"系統維護/操作人員","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"系統維護/操作人員","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"系統維護/操作人員","TQC 專業網站程式工程師");
        plInsert(db,"系統維護/操作人員","(ITE)資訊專業人員鑑定 - 系統分析&物件導向");
        plInsert(db,"系統維護/操作人員","(ABID)程式設計入門助教 ");
        plInsert(db,"網路安全分析師","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"網路安全分析師","TQC 專業 Linux 系統管理工程師");
        plInsert(db,"網路安全分析師","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"網路安全分析師","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"網路安全分析師","TQC-OA 網際網路及行動通訊 專業級");
        plInsert(db,"網路安全分析師","TQC-OA 網際網路及行動通訊 實用級");
        plInsert(db,"網路安全分析師","TQC-OA 網際網路及行動通訊 進階級");
        plInsert(db,"資訊設備管制人員","TQC-OS Linux 網路管理 專業級");
        plInsert(db,"資訊設備管制人員","TQC 專業 Linux 系統管理工程師");
        plInsert(db,"資訊設備管制人員","TQC-OS Linux 系統管理 專業級");
        plInsert(db,"資訊設備管制人員","TQC 專業 Linux 網路管理工程師");
        plInsert(db,"資訊設備管制人員","TQC-MD ITE資訊人員 實用級");
        plInsert(db,"資訊設備管制人員","TQC-MD ITE資訊人員 進階級");


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