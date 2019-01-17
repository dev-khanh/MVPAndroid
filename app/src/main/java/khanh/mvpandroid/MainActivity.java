package khanh.mvpandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import khanh.mvpandroid.Model.Entity.Demo;
import khanh.mvpandroid.Presenter.MainPresenter;
import khanh.mvpandroid.View.Interface.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter mainPresenter;
    private ListView listView;
    private Button btnLoand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.list_view);
        btnLoand = (Button) findViewById(R.id.btn_load_data);
        mainPresenter = new MainPresenter(this);
        btnLoand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.loadData();
            }
        });
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        listView.setAdapter(new ArrayAdapter<Demo>(this,android.R.layout.simple_list_item_1,listDemo));
    }
}
