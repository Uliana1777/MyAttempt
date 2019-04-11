package com.example.uliana.myattempt;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TransactionFragment extends Fragment {
    private ListView listView;
    private TransactionsAdapter transactionsAdapter;
    List <Transactions>  data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_transaction, container);
        List<Transactions> adapterData = getDataList();
        transactionsAdapter = new TransactionsAdapter(getActivity(), adapterData);

        listView = inflate.findViewById(R.id.listView);
        listView.setAdapter(transactionsAdapter);
        return inflate;
    }
    private List<Transactions> getDataList (){
        data.add(new Transactions("telephone ",200, "11.04.2019 "));
        data.add(new Transactions("cinema ",200,"11.04.2019" ));
        data.add(new Transactions("jeans ",200, "11.04.2019" ));
        return  data;
    }
}
