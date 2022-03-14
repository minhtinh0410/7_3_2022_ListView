package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Ca nau lau, nau mi mini,...",
                "Shop Devang",
                R.drawable.ca_nau_lau));

        arrayList.add(new Goods("1 Kg kho ga bo toi",
                "Shop LTD Food",
                R.drawable.ga_bo_toi));

        arrayList.add(new Goods("Xe can cau da nang",
                "The gioi do choi",
                R.drawable.xa_can_cau));

        arrayList.add(new Goods("Do choi dang mo hinh",
                "The gioi do choi",
                R.drawable.do_choi_dang_mo_hinh));

        arrayList.add(new Goods("Lanh dao gian don",
                "Shop Minh Long Book",
                R.drawable.lanh_dao_gian_don));

        arrayList.add(new Goods("Hieu long con tre",
                "Shop Minh Long Book",
                R.drawable.hieu_long_con_tre));

        adt = new CustomGoodsAdapter(this, R.layout.item_listview, arrayList);

        lvGoods.setAdapter(adt);

    }
}