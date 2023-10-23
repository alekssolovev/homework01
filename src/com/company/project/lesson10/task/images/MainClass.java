package com.company.project.lesson10.task.images;

public class MainClass {
    public static void main(String[] args) {
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {

            }
        };
        Editor editor = new Editor(drawable);
        Editor editor1 = editor.clone();
        editor1.setDrawable(drawable);
        System.out.println(editor == editor1);
    }
}
