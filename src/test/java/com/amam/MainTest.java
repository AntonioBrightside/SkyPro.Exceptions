package com.amam;

import org.junit.Test;

public class MainTest {

    @Test(expected = WrongLoginException.class)
    public void whenInputLoginIncorrectWithWrongSymbol() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_sKypro_%2", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    @Test(expected = WrongLoginException.class)
    public void whenInputLoginIncorrectWithWrongLength() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_sKypro_Huge_Length", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    @Test
    public void whenInputLoginCorrectSymbols() throws WrongLoginException, WrongPasswordException {
        Main.logIn("ab4c_De_fG_i_42aC_", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    @Test(expected = WrongPasswordException.class)
    public void whenInputPasswordIncorrectWithWrongSymbol() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_skypro_go", "D_1hWiKjjP_%9", "D_1hWiKjjP_%9");
    }

    @Test(expected = WrongPasswordException.class)
    public void whenInputPasswordIncorrectWithWrongLength() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_skypro_go", "D_1hWiKjjP_9_HuGe_LENGTH", "D_1hWiKjjP_9_HuGe_LENGTH");
    }

    @Test
    public void whenInputPasswordCorrectSymbols() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    @Test(expected = WrongPasswordException.class)
    public void whenInputPasswordNotEqualToConfirmPassword() throws WrongLoginException, WrongPasswordException {
        Main.logIn("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_8");
    }
}