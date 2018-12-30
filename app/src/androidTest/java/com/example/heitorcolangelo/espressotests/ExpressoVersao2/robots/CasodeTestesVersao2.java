package com.example.heitorcolangelo.espressotests.ExpressoVersao2.robots;

import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CasodeTestesVersao2 {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class,false,true);
    @Before
    public void setup(){

    }

    @After
    public void finish(){

    }

    @Test
    public void testeNumero1(){
        new RobotsRobots()
                .verificarTituloDaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotaoLogin()
                .verificarElementoImagem();
    }

    @Test
    public void testeNumero2(){
        new RobotsRobots()
                .clicarNoBotaoLogin()
                .verificarPopup();

    }

    @Test
    public void testeNumero3(){
        new RobotsRobots()
                .escreverEmail()
                .closeKeyboard()
                .clicarNoBotaoLogin()
                .verificarPopup();
    }

    @Test
    public void testeNumero4(){
        new RobotsRobots()
                .escreverSenha()
                .closeKeyboard()
                .clicarNoBotaoLogin()
                .verificarPopup();
    }

    @Test
    public void testeNumero5(){
        new RobotsRobots()
                .escreverEmail()
                .closeKeyboard()
                .escreverSenha()
                .closeKeyboard()
                .clicarNoBotaoLogin()
                .verificarTituloTela2();

    }

    @Test
    public void testeNumero6(){
            new RobotsRobots()
                    .escreverEmail()
                    .closeKeyboard()
                    .escreverSenha()
                    .closeKeyboard()
                    .clicarNoBotaoLogin()
                    .verificarTituloTela2()
                    .clicarEmVoltar()
                    .verificarTituloDaTela()
                    .verificarCampoLogin()
                    .verificarCampoSenha()
                    .verificarBotaoLogin()
                    .verificarElementoImagem();
    }

    @Test
    public void testeNumero7() throws InterruptedException{
         new RobotsRobots()
                 .escreverEmail()
                 .closeKeyboard()
                 .escreverSenha()
                 .closeKeyboard()
                 .clicarNoBotaoLogin()
                 .sleep(5)
                 .scrollParaBaixo()
                 .sleep(2);

    }

}
