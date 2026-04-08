package Controller;

import View.*;

public class MainController {
    public MainController(){
        start();
    }
    
    private void start(){
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.showFrame();
    }
}
