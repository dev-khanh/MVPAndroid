package khanh.mvpandroid.Model.Interface;

import java.util.List;

import khanh.mvpandroid.Model.Entity.Demo;

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);
    void onLoadDemoFailure(String message);
}
