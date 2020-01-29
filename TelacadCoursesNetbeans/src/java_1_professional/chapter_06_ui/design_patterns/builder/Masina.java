/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.builder;

/**
 *
 * @author robert
 */
public class Masina {

    int caiPutere;
    String combustibil;
    String marca;

    public static class Builder {

        private Masina masina = new Masina();

        public Builder setCaiPutere(int caiPutere) {
            masina.caiPutere = caiPutere;
            return this;
        }

        public Builder setCombustibil(String combustibil) {
            masina.combustibil = combustibil;
            return this;
        }

        public Builder setMarca(String marca) {
            masina.marca = marca;
            return this;
        }

        public Masina build() {
            return masina;
        }
    }

}
