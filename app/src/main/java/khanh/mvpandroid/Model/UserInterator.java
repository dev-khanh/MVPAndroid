package khanh.mvpandroid.Model;

import java.util.ArrayList;
import java.util.List;

import khanh.mvpandroid.Model.Entity.Demo;
import khanh.mvpandroid.Model.Interface.LoadDemoListener;

public class UserInterator {
    private LoadDemoListener listener;

    public UserInterator(LoadDemoListener listener) {
        this.listener = listener;
    }
    public void createListData(){
        List<Demo> listDemo = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Demo demo = new Demo("I'm DevK");
            listDemo.add(demo);
        }
        listener.onLoandDemoSuccec(listDemo);
    }
}
