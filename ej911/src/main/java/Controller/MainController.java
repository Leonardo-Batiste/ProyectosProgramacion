package Controller;
import View.*;
public class MainController {
    public MainController(){
        start();
    }

    MainFrame mf;

    private void start(){
        mf = new MainFrame();
        mf.showFrame();
    }
}
