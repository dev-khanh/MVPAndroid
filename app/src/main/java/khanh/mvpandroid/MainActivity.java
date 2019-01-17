package khanh.mvpandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    }

    @Override
    public void displayMain(List<Demo> listDemo) {

    }
}
