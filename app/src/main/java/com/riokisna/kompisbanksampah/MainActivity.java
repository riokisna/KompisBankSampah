package com.riokisna.kompisbanksampah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.riokisna.kompisbanksampah.Adapter.PenjemputanAdapter;

public class MainActivity extends AppCompatActivity {

    //Views
    private TextView tvSaldo, tvPoin, tvLihatInfo, tvLihatPenjemputan;
    private ImageButton btnScan, btnNotification, btnProfile;
    private LinearLayout btnHistory, btnTransfer, btnTarik, btnTransaksi, btnJual, btnKategori, btnLaporan, btnKontak,
            btnPengurus, btnTukar, btnTabelHarga;
    private RecyclerView rv_penjemputan;
    private PenjemputanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createView();
        setVariable();
    }

    private void createView() {
        //Hooks
        tvSaldo =findViewById(R.id.tv_saldo);
        tvPoin =findViewById(R.id.tv_poin);
        tvLihatInfo=findViewById(R.id.btn_lihat_promo);
        tvLihatPenjemputan=findViewById(R.id.btn_lihat_penjemputan);
        btnScan =findViewById(R.id.button_scan);
        btnNotification =findViewById(R.id.buttonNotification);
        btnProfile =findViewById(R.id.buttonProfile);
        btnHistory =findViewById(R.id.btn_history);
        btnTransfer =findViewById(R.id.btn_transfer);
        btnTarik =findViewById(R.id.btn_tarik);
        btnTransaksi =findViewById(R.id.btn_transaksi);
        btnJual =findViewById(R.id.btn_kategori);
        btnKategori =findViewById(R.id.btn_laporan);
        btnLaporan =findViewById(R.id.btn_kontak);
        btnPengurus =findViewById(R.id.btn_pengurus);
        btnTukar =findViewById(R.id.btn_tukar);
        btnTabelHarga =findViewById(R.id.btn_tabel_harga);
        rv_penjemputan =findViewById(R.id.rv_penjemputan);
        rv_penjemputan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setVariable() {
        adapter = new PenjemputanAdapter(MainActivity.this);
        rv_penjemputan.setAdapter(adapter);
    }
}