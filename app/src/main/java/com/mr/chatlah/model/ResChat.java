package com.mr.chatlah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResChat {

    @SerializedName("kode")
    @Expose
    private Integer kode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("dataChat")
    @Expose
    private List<DataChat> dataChat = null;

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataChat> getDataChat() {
        return dataChat;
    }

    public void setDataChat(List<DataChat> dataChat) {
        this.dataChat = dataChat;
    }

}