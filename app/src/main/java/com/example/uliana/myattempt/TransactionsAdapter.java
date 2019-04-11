package com.example.uliana.myattempt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TransactionsAdapter extends ArrayAdapter <Transactions> {

    List <Transactions> transactions;
    public TransactionsAdapter(Context context, List<Transactions> transactionsList) {
        super(context,0 ,transactionsList);
        this.transactions = transactionsList;
    }

    static class ViewHolder {

    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        final Transactions transaction = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false );
        }

        TextView title = convertView.findViewById(R.id.title);
        TextView sum = convertView.findViewById(R.id.sum);
        TextView date = convertView.findViewById(R.id.date);

        title.setText(transaction.getTitle());
        sum.setText(transaction.getSum());
        date.setText(transaction.getDate());

        return convertView;
    }
}
