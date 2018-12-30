package com.example.heitorcolangelo.espressotests.ExpressoVersao2.robots;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;

import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.EMAIL;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.HINT_EMAIL;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.HINT_PASSWORD;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.SENHA;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.TITLE_LIST_OF_USERS;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.TITLE_LOGIN;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.TXT1_POUPUP;
import static com.example.heitorcolangelo.espressotests.ExpressoVersao2.constants.TextosConstants.TXT2_POUPUP;

public class RobotsRobots extends ScreenRobot<RobotsRobots> {

    private static final int IMAGEM_LOGIN = R.id.login_image;
    private static final int CAMPO_EMAIL = R.id.login_username;
    private static final int CAMPO_SENHA = R.id.login_password;
    private static final int BTN_LOGIN = R.id.login_button;
    private static final int VIEW_PARA_SCROLL = R.id.recycler_view;

    public  RobotsRobots verificarElementoImagem(){
        checkIsDisplayed(IMAGEM_LOGIN);
        return this;
    }

    public  RobotsRobots verificarCampoLogin(){
        checkViewHasHint(CAMPO_EMAIL, HINT_EMAIL);
        return this;
    }

    public RobotsRobots verificarCampoSenha(){
        checkViewHasHint(CAMPO_SENHA, HINT_PASSWORD);
        return this;
    }

    public RobotsRobots verificarBotaoLogin(){
        checkIsDisplayed(BTN_LOGIN);
        return this;
    }

    public RobotsRobots verificarTituloDaTela(){
        checkViewContainsText(TITLE_LOGIN);
        return this;
    }

    public RobotsRobots clicarNoBotaoLogin(){
        clickOnView(BTN_LOGIN);
        return this;
    }

    public RobotsRobots verificarPopup(){
        checkDialogWithTextIsDisplayed(TXT1_POUPUP);
        checkDialogWithTextIsDisplayed(TXT2_POUPUP);
        return this;
    }

    public RobotsRobots escreverEmail(){
        enterTextIntoView(CAMPO_EMAIL, EMAIL);
        return this;
    }

    public RobotsRobots escreverSenha(){
        enterTextIntoView(CAMPO_SENHA, SENHA);
        return this;
    }

    public RobotsRobots verificarTituloTela2(){
        checkViewContainsText(TITLE_LIST_OF_USERS);
        return this;
    }

    public RobotsRobots clicarEmVoltar(){
        pressBack();
        return this;
    }

    public RobotsRobots scrollParaBaixo(){
        scrollViewDown(VIEW_PARA_SCROLL);
        return this;
    }



}
