package com.example.thannathrnyuwasin.newit;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class RecyclerActivity extends AppCompatActivity {
    private List<Detail> detailList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mAdapter = new Adapter(detailList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Detail detail  = new Detail("วัดพระธาตุดอยสุเทพ", "ตำบล สุเทพ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200","เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดพระสิงวงรวิหาร", "ตำบล ศรีภูมิ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดเจดีย์หลวง", "103 Road King Prajadhipok Phra Singh, Muang District, Chiang Mai ตำบล ศรีภูมิ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดพันเตา", "ถนนพระปกเกล้า, พระสิงห์, เมืองเชียงใหม่, เชียงใหม่ ตำบล ศรีภูมิ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดเชียงมั่น","ตำบล ศรีภูมิ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดอุโมงค์", "ตำบล สุเทพ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดสวนดอก", "139 ถนน สุเทพ ตำบล สุเทพ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดโลกโมฬี", "ตำบล ศรีภูมิ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดเจ็ดยอด", "หมู่ 2 ซุปเปอร์ไฮเวย์ 69 ตำบล ช้างเผือก อำเภอเมืองเชียงใหม่ เชียงใหม่ 31000", "เชียงใหม่");
        detailList.add(detail);

        detail = new Detail("วัดพระธาตุดอยคำ", "ถนน หมู่บ้านเชียงใหม่เลคแลนด์ ตำบล สุเทพ อำเภอเมืองเชียงใหม่ เชียงใหม่ 50200", "เชียงใหม่");
        detailList.add(detail);

        mAdapter.notifyDataSetChanged();
    }
}
