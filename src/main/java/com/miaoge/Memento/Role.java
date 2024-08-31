package com.miaoge.Memento;

public class Role {
    private Integer vit;
    private Integer defense;
    private Integer attack;

    public void initState() {
        this.vit = 100;
        this.defense = 100;
        this.attack = 100;
    }

    public void deadState() {
        this.vit = 0;
        this.defense = 0;
        this.attack = 0;
    }

    public void printState() {
        System.out.printf("生命值：%d 攻击力：%d 防守力：%d\n", vit, attack, defense);
    }

    public Memento createMementoState() {
        Memento m = new Memento();
        m.setVit(vit);
        m.setDefense(defense);
        m.setAttack(attack);
        return m;
    }

    public void recoverStateWithMemento(Memento memento) {
        vit = memento.getVit();
        defense = memento.getDefense();
        attack = memento.getAttack();
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }
}
