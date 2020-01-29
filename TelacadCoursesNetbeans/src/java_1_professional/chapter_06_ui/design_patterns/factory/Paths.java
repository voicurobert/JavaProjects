/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.factory;

/**
 *
 * @author robert
 */
public final class Paths {

    private Paths() {

    }

    public static enum OS {
        WINDOWS, LINUX
    }

    public static Path get(OS os) {
        switch (os) {
            case WINDOWS:
                return new WindowsPath();

            case LINUX:
                return new LinuxPath();

            default:
                throw new IllegalArgumentException("Nu exista");

        }
    }

    private static class WindowsPath implements Path {

        @Override
        public String getRoot() {
            return "C:\\";
        }

    }

    private static class LinuxPath implements Path {

        @Override
        public String getRoot() {
            return "/";
        }

    }

}
