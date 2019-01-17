package khanh.mvpandroid.Presenter;

import java.util.List;

import khanh.mvpandroid.Model.Entity.Demo;
import khanh.mvpandroid.Model.Interface.LoadDemoListener;
import khanh.mvpandroid.Model.UserInterator;
import khanh.mvpandroid.View.Interface.MainView;

public class MainPresenter implements LoadDemoListener {

    private UserInterator mainInterator;
    private MainView mainView;

    public MainPresenter(UserInterator mainInterator, MainView mainView) {
        this.mainInterator = mainInterator;
        this.mainView = mainView;
    }

    public void loadData(){
        mainInterator.createListData();
    }


    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {

    }
}
