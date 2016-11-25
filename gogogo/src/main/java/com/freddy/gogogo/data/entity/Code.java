package com.freddy.gogogo.data.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 
 * Created by wujinpeng on 2016/11/25.
 */
@Entity
public class Code {
    @Id
    private long id;
    @NotNull
    private String number;
    @NotNull
    private String animal;
    @NotNull
    private String wave;
    @NotNull
    private String bigsmall;
    @NotNull
    private String doublesingle;
    @Generated(hash = 1671392385)
    public Code(long id, @NotNull String number, @NotNull String animal,
            @NotNull String wave, @NotNull String bigsmall,
            @NotNull String doublesingle) {
        this.id = id;
        this.number = number;
        this.animal = animal;
        this.wave = wave;
        this.bigsmall = bigsmall;
        this.doublesingle = doublesingle;
    }
    @Generated(hash = 364261929)
    public Code() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAnimal() {
        return this.animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public String getWave() {
        return this.wave;
    }
    public void setWave(String wave) {
        this.wave = wave;
    }
    public String getBigsmall() {
        return this.bigsmall;
    }
    public void setBigsmall(String bigsmall) {
        this.bigsmall = bigsmall;
    }
    public String getDoublesingle() {
        return this.doublesingle;
    }
    public void setDoublesingle(String doublesingle) {
        this.doublesingle = doublesingle;
    }

}
