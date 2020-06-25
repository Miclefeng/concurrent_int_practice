package com.basic.knowledge.designpattern.reflect.hero;

import com.basic.knowledge.designpattern.reflect.SkillImpl;

public class Diana implements SkillImpl {
    @Override
    public void q() {
        print("Q");
    }

    @Override
    public void w() {
        print("W");
    }

    @Override
    public void e() {
        print("E");
    }

    @Override
    public void r() {
        print("R");
    }

    private void print(String skill) {
        System.out.println(getClass().getSimpleName() + skill);
    }
}
