package com.exercism.learning.WizardsAndWarriors;

abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean prepareSpell = false;

    @Override
    boolean isVulnerable() {
        return !this.prepareSpell;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return this.prepareSpell ? 12 : 3;
    }

    void prepareSpell() {
        this.prepareSpell = true;
    }
}

