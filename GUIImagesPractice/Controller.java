import java.awt.event.*;


public class Controller implements ActionListener{
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        model.addObserver(view);
        view.addController(this);
        view.makeFrame();
        model.initializeImages();
    }
    
    private void previousImg(){
        model.decreaseIndex();
    }
    
    private void nextImg(){
        model.increaseIndex();
    }
    
    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        switch(action){
            case "left": previousImg(); break;
            case "right": nextImg(); break;
        }
    }
}