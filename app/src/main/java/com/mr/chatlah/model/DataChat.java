package com.mr.chatlah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataChat {

    @SerializedName("id_chat")
    private String idChat;
    @SerializedName("chat")
    private String chat;
    @SerializedName("usr_pengirim")
    private String usrPengirim;
    @SerializedName("waktu_chat")
    private String waktuChat;
    @SerializedName("usr_penerima")
    private String usrPenerima;

    public String getIdChat() {
        return idChat;
    }

    public void setIdChat(String idChat) {
        this.idChat = idChat;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getUsrPengirim() {
        return usrPengirim;
    }

    public void setUsrPengirim(String usrPengirim) {
        this.usrPengirim = usrPengirim;
    }

    public String getWaktuChat() {
        return waktuChat;
    }

    public void setWaktuChat(String waktuChat) {
        this.waktuChat = waktuChat;
    }

    public String getUsrPenerima() {
        return usrPenerima;
    }

    public void setUsrPenerima(String usrPenerima) {
        this.usrPenerima = usrPenerima;
    }

}