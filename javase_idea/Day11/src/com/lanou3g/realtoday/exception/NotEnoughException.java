package com.lanou3g.realtoday.exception;

public class NotEnoughException extends EatException{
    /**
     * 自定义异常
     *      自己定义一个异常类,继承Exception
     */

    @Override
    public String getMessage() {
        return "我是真的没吃饱,我还要";
    }





}
