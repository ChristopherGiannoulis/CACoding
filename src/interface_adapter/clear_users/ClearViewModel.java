package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;
import interface_adapter.signup.SignupState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public static final String  TITLE_LABEL = "Clear view";

    public static final String CLEAR_BUTTON = "Delete all";

    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    private static ClearState state = new ClearState();

    public ClearViewModel(String viewName) {
        super(viewName);
    }

    public void setState(ClearState state) {
        state = state;
    }

    public static ClearState getstate() {return state;}

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
