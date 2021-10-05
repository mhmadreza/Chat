package com.mr.chatlah.api;

import com.mr.chatlah.model.ResChat;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("get_chat.php")
    Call<ResChat> getChat();

    @FormUrlEncoded
    @POST("post_chat.php")
    Call<ResChat> postChat(
            @Field("chat") String chat,
            @Field("usr_pengirim") String usr_pengirim,
            @Field("waktu_chat") String waktu_chat,
            @Field("usr_penerima") String usr_penerima
    );

}
