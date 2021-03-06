package com.sudheer.dailynewsforu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sudheer.dailynewsforu.R;
import com.sudheer.dailynewsforu.models.HeadlineModel;

import java.util.List;

/**
 * Created by Your name on 12/4/20.
 */
public class HeadlinesAdapter extends RecyclerView.Adapter<HeadlinesAdapter.ViewHolder> {
    private Context context;
    private List<HeadlineModel> headlineModels;

    public HeadlinesAdapter(Context context, List<HeadlineModel> headlineModels) {
        this.context = context;
        this.headlineModels = headlineModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_list_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_his_code.setText(headlineModels.get(0).getArticles().get(position).getTitle());
        holder.tv_his_code.setText(headlineModels.get(0).getArticles().get(position).getDescription());

    }
    public void setList(List<HeadlineModel> moviesList) {
        this.headlineModels = moviesList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {

        return headlineModels.get(0).getTotalResults()-1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_his_code, tv_his_rrn, tv_his_usename, tv_his_resmsg, tv_his_txnDate, tv_his_ercode, tv_his_service;
        LinearLayout li_txt_errormsg, li_txt_errorcode;

        public ViewHolder(View itemView) {
            super(itemView);

            this.tv_his_code = itemView.findViewById(R.id.title);
            this.tv_his_rrn = itemView.findViewById(R.id.discrption);
           /* this.tv_his_usename = itemView.findViewById(R.id.tv_his_usename);
            this.tv_his_ercode = itemView.findViewById(R.id.tv_his_errorcode);
            this.tv_his_resmsg = itemView.findViewById(R.id.tv_his_resmsg);
            this.tv_his_txnDate = itemView.findViewById(R.id.tv_his_txnDate);
            this.tv_his_service = itemView.findViewById(R.id.tv_his_servicetype);
            this.li_txt_errorcode = itemView.findViewById(R.id.li_txt_errorcode);
            this.li_txt_errormsg = itemView.findViewById(R.id.li_txt_errormsg);*/
        }
    }
}
