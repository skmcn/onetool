package com.example.onetoolyuyin;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class Speak02 {

    //用电脑自带的语音读字符串str
    public static void main(String[] args) {
        String str = "你好，我是java小新人！请叫我最帅的帅锅";
        String str1 = "你好，我是java小新人！请叫我最帅的帅锅";

        ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
        Dispatch sapo = sap.getObject();
        try {
            // 音量 0-100
            sap.setProperty("Volume", new Variant(100));
            // 语音朗读速度 -10 到 +10
            sap.setProperty("Rate", new Variant(0));
            // 执行朗读 
            Dispatch.call(sapo, "Speak", new Variant(str));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sapo.safeRelease();
            sap.safeRelease();
        }
    }

}