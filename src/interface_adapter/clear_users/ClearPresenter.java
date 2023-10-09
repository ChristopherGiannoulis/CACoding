package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ClearPresenter {
    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    private final LoginViewModel loginViewModel ;
    public void prepareSuccessView(ClearOutputData nice){
        LoginState loginState = loginViewModel.getState();
        this.loginViewModel.setState(loginState);
        loginViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(loginViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    public ClearPresenter(SignupViewModel signupViewModel, ViewManagerModel Viewmanager, LoginViewModel loginViewModel) {
        this.signupViewModel = signupViewModel;
        this.viewManagerModel = Viewmanager;
        this.loginViewModel = loginViewModel;
    }
}
