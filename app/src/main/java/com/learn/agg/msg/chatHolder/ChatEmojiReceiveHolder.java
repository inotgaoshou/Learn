package com.learn.agg.msg.chatHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learn.agg.R;
import com.makeramen.roundedimageview.RoundedImageView;

/**
 * author : fengzhangwei
 * date : 2019/12/27
 */
public class ChatEmojiReceiveHolder extends RecyclerView.ViewHolder {

    public RoundedImageView iv_icon;
    public TextView tv_time;
    public ImageView iv_emoji;

    public ChatEmojiReceiveHolder(@NonNull View itemView) {
        super(itemView);
        iv_icon = itemView.findViewById(R.id.iv_icon);
        tv_time = itemView.findViewById(R.id.tv_chat_time);
        iv_emoji = itemView.findViewById(R.id.iv_emoji);
    }
}
