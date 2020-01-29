/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.decorater;

/**
 *
 * @author robert
 */
public class ObjectInputStream {

    // obiectul decorat
    private InputStream inputStream;

    public ObjectInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public int readInt() {
        inputStream.readByte();
        inputStream.readByte();
        inputStream.readByte();
        inputStream.readByte();
        System.out.println("am citit un int");
        return 0;
    }

}
