package com.phone;
import com.phone.part.*;

public class MyPhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.hasFihurePrintUnlcoker = true;
        phone.price = 1999;
        phone.screen = new Screen();

        phone.screen.producer = "京东方";
        phone.screen.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer = "三星";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.capacity = 8;
        memory.producer = "三星";

        Storage storage = new Storage();
        storage.capacity = 128;
        storage.producer = "Intel";

        phone.mainBoard = new MainBoard();

        phone.mainBoard.cpu = cpu;
        phone.mainBoard.memory = memory;
        phone.mainBoard.storage = storage;

        phone.mainBoard.model = "EA999";
        phone.mainBoard.year = 2022;

        phone.prePhone = new Phone();
        phone.prePhone.mainBoard = new MainBoard();
        phone.prePhone.mainBoard.year = 2012;
        System.out.println(phone.prePhone.mainBoard.year);


    }
}
